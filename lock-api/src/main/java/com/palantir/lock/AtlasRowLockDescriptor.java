/**
 * Copyright 2015 Palantir Technologies
 *
 * Licensed under the BSD-3 License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.palantir.lock;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.locks.ReadWriteLock;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.io.BaseEncoding;
import com.google.common.primitives.Bytes;

/**
 * A descriptor for a {@link ReadWriteLock}, identified by a lock ID (a unique
 * string).
 *
 * @author jtamer
 */
@Immutable
public final class AtlasRowLockDescriptor extends LockDescriptor {
    private static final long serialVersionUID = 1L;

    /** Returns a {@code LockDescriptor} instance for the given table and row. */
    public static AtlasRowLockDescriptor of(String tableName, byte[] rowName) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(tableName));
        Preconditions.checkNotNull(rowName);
        byte[] tableBytes = tableName.getBytes();
        byte[] bytes = new byte[tableBytes.length + 1 + rowName.length];
        System.arraycopy(tableBytes, 0, bytes, 0, tableBytes.length);
        System.arraycopy(rowName, 0, bytes, tableBytes.length + 1, rowName.length);
        return new AtlasRowLockDescriptor(bytes);
    }

    private AtlasRowLockDescriptor(byte[] bytes) {
        super(bytes);
    }

    @Override
    public String getLockId() {
        // Table name and row name are separated by a \0 byte.
        int splitIndex = Bytes.indexOf(bytes, (byte) 0);
        return new StringBuilder("AtlasDb row lock: ")
                .append(new String(bytes, 0, splitIndex))
                .append(':')
                .append(BaseEncoding.base16().encode(bytes, splitIndex + 1, bytes.length - splitIndex - 1))
                .toString();
    }

    private void readObject(@SuppressWarnings("unused") ObjectInputStream in)
            throws InvalidObjectException {
        throw new InvalidObjectException("proxy required");
    }

    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    private static class SerializationProxy implements Serializable {
        private static final long serialVersionUID = 2L;

        @Nullable
        private final byte[] bytes;

        SerializationProxy(AtlasRowLockDescriptor lockDescriptor) {
            bytes = lockDescriptor.bytes;
        }

        Object readResolve() {
            return new AtlasRowLockDescriptor(bytes);
        }
    }
}
