/*
 * Copyright 2015 Palantir Technologies, Inc. All rights reserved.
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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LockWithMode {
    private LockDescriptor lockDescriptor;
    private LockMode lockMode;

    public LockWithMode(@JsonProperty("lockDescriptor") LockDescriptor lockDescriptor,
                        @JsonProperty("lockMode") LockMode lockMode) {
        this.lockDescriptor = lockDescriptor;
        this.lockMode = lockMode;
    }

    public LockDescriptor getLockDescriptor() {
        return lockDescriptor;
    }

    public LockMode getLockMode() {
        return lockMode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        LockWithMode that = (LockWithMode) other;
        return Objects.equals(lockDescriptor, that.lockDescriptor)
                && lockMode == that.lockMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockDescriptor,
                lockMode);
    }

    @Override
    public String toString() {
        return "LockWithMode{"
                + "lockDescriptor=" + lockDescriptor
                + ", lockMode=" + lockMode
                + '}';
    }
}
