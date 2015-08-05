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
package com.palantir.atlasdb.stream;

import java.io.File;
import java.io.InputStream;

import javax.annotation.CheckForNull;

import com.palantir.atlasdb.transaction.api.Transaction;
import com.palantir.util.crypto.Sha256Hash;

/**
 * Interface for storing streams specifically for atlasdb.
 */
public interface GenericStreamStore<ID> {
    static int BLOCK_SIZE_IN_BYTES = 1000000; // 1MB. DO NOT CHANGE THIS WITHOUT AN UPGRADE TASK

    @CheckForNull ID lookupStreamIdByHash(Transaction t, Sha256Hash hash);

    InputStream loadStream(Transaction t, ID id);
    File loadStreamAsFile(Transaction t, ID id);
}
