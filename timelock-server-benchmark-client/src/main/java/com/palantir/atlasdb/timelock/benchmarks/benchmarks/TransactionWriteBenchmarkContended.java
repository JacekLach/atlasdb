/*
 * Copyright 2017 Palantir Technologies, Inc. All rights reserved.
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

package com.palantir.atlasdb.timelock.benchmarks.benchmarks;

import java.util.Arrays;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;
import com.palantir.atlasdb.timelock.benchmarks.RandomBytes;
import com.palantir.atlasdb.timelock.benchmarks.schema.generated.BenchmarksTableFactory;
import com.palantir.atlasdb.timelock.benchmarks.schema.generated.BlobsSerializableTable;
import com.palantir.atlasdb.timelock.benchmarks.schema.generated.BlobsSerializableTable.BlobsSerializableRow;
import com.palantir.atlasdb.transaction.api.TransactionManager;

public final class TransactionWriteBenchmarkContended extends AbstractBenchmark {

    private static final Logger log = LoggerFactory.getLogger(TransactionWriteBenchmarkContended.class);

    private static final BenchmarksTableFactory tableFactory = BenchmarksTableFactory.of();

    private final TransactionManager txnManager;
    private final Map<byte[], byte[]> originalValuesByKey = ImmutableMap.of(
            RandomBytes.ofLength(16), RandomBytes.ofLength(16),
            RandomBytes.ofLength(16), RandomBytes.ofLength(16));

    // TODO(gmaretic): currently does not work for requestsPerClient > 1 since we never update originalValuesByKey
    public static Map<String, Object> execute(TransactionManager txnManager, int numClients,
            int requestsPerClient) {
        return new TransactionWriteBenchmarkContended(txnManager, numClients, requestsPerClient).execute();
    }

    private TransactionWriteBenchmarkContended(TransactionManager txnManager, int numClients, int requestsPerClient) {
        super(numClients, requestsPerClient);

        this.txnManager = txnManager;
    }

    @Override
    public void setup() {
        txnManager.runTaskWithRetry(txn -> {
            BlobsSerializableTable table = tableFactory.getBlobsSerializableTable(txn);
            originalValuesByKey.forEach((key, value) -> table.putData(BlobsSerializableRow.of(key), value));
            return null;
        });
    }

    @Override
    public void performOneCall() {
        originalValuesByKey.forEach(this::runContendedTransaction);
    }

    private void runContendedTransaction(byte[] key, byte[] originalValue) {
        txnManager.runTaskWithRetry(txn -> {
            BlobsSerializableTable table = tableFactory.getBlobsSerializableTable(txn);

            byte[] currentValue = table.getRow(BlobsSerializableRow.of(key))
                    .get().getData();

            if (Arrays.equals(currentValue, originalValue)) {
                byte[] newValue = RandomBytes.ofLength(16);
                table.putData(BlobsSerializableRow.of(key), newValue);
            }

            return null;
        });
    }

}
