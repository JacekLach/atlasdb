/*
 * Copyright 2018 Palantir Technologies, Inc. All rights reserved.
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

package com.palantir.atlasdb.sweep.queue;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.palantir.atlasdb.keyvalue.api.Cell;
import com.palantir.atlasdb.keyvalue.api.TableReference;
import com.palantir.atlasdb.sweep.Sweeper;

public class WriteInfoTest {
    private static final TableReference TABLE_REF = TableReference.createFromFullyQualifiedName("test.test");
    private static final Cell CELL = Cell.create(new byte[]{1}, new byte[]{2});
    private static final long ONE = 1L;
    private static final long TWO = 2L;
    private static final int SHARDS = 128;

    @Test
    public void cellReferenceIgnoresTombstoneStatus() {
        assertThat(getWriteAt(ONE)).isNotEqualTo(getTombstoneAt(ONE));
        assertThat(getWriteAt(ONE).writeRef().cellReference())
                .isEqualTo(getTombstoneAt(ONE).writeRef().cellReference());
    }

    @Test
    public void tombstoneStatusIsIgnoredForSharding() {
        assertThat(getWriteAt(ONE)).isNotEqualTo(getTombstoneAt(ONE));
        assertThat(getWriteAt(ONE).toShard(SHARDS)).isEqualTo(getTombstoneAt(ONE).toShard(SHARDS));
    }

    @Test
    public void timestampIsIgnoredForSharding() {
        assertThat(getWriteAt(ONE)).isNotEqualTo(getWriteAt(TWO));
        assertThat(getTombstoneAt(ONE)).isNotEqualTo(getTombstoneAt(TWO));

        assertThat(getWriteAt(ONE).toShard(SHARDS)).isEqualTo(getWriteAt(TWO).toShard(SHARDS));
        assertThat(getTombstoneAt(ONE).toShard(SHARDS)).isEqualTo(getTombstoneAt(TWO).toShard(SHARDS));
    }

    @Test
    public void timestampToDeleteAtHigherForTombstoneAndThorough() {
        assertThat(getWriteAt(ONE).timestampToDeleteAtExclusive(Sweeper.CONSERVATIVE)).isEqualTo(ONE);
        assertThat(getWriteAt(ONE).timestampToDeleteAtExclusive(Sweeper.THOROUGH)).isEqualTo(ONE);
        assertThat(getTombstoneAt(ONE).timestampToDeleteAtExclusive(Sweeper.CONSERVATIVE)).isEqualTo(ONE);
        assertThat(getTombstoneAt(ONE).timestampToDeleteAtExclusive(Sweeper.THOROUGH)).isEqualTo(TWO);
    }

    private WriteInfo getWriteAt(long timestamp) {
        return WriteInfo.write(TABLE_REF, CELL, timestamp);
    }

    private WriteInfo getTombstoneAt(long timestamp) {
        return WriteInfo.tombstone(TABLE_REF, CELL, timestamp);
    }
}
