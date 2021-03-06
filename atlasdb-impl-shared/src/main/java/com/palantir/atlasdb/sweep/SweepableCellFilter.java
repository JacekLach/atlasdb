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
package com.palantir.atlasdb.sweep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.palantir.atlasdb.keyvalue.api.CandidateCellForSweeping;
import com.palantir.atlasdb.transaction.impl.TransactionConstants;

public class SweepableCellFilter {
    private final CommitTsCache commitTsCache;
    private final Sweeper sweeper;
    private final long sweepTs;

    public SweepableCellFilter(CommitTsCache commitTsCache, Sweeper sweeper, long sweepTs) {
        this.commitTsCache = commitTsCache;
        this.sweeper = sweeper;
        this.sweepTs = sweepTs;
    }

    // For a given list of candidates, decide which ones we should actually sweep.
    // Here we need to load the commit timestamps, and it's important to do that in bulk
    // to reduce the number of round trips to the database.
    public BatchOfCellsToSweep getCellsToSweep(List<CandidateCellForSweeping> candidates) {
        Map<Long, Long> startToCommitTs = commitTsCache.loadBatch(getAllTimestamps(candidates));
        ImmutableBatchOfCellsToSweep.Builder builder = ImmutableBatchOfCellsToSweep.builder();
        long numCellTsPairsExamined = 0;
        for (CandidateCellForSweeping candidate : candidates) {
            getCellToSweep(candidate, startToCommitTs).ifPresent(builder::addCells);
            numCellTsPairsExamined += candidate.sortedTimestamps().size();
        }
        return builder
                .numCellTsPairsExamined(numCellTsPairsExamined)
                .lastCellExamined(candidates.get(candidates.size() - 1).cell())
                .build();
    }

    private Optional<CellToSweep> getCellToSweep(CandidateCellForSweeping candidate, Map<Long, Long> startToCommitTs) {
        List<Long> tsToSweep = new ArrayList<>();
        List<Long> uncommittedTs = new ArrayList<>();
        boolean lastIsCommittedBeforeSweepTs = false;

        for (long startTs : candidate.sortedTimestamps()) {
            long commitTs = startToCommitTs.get(startTs);
            lastIsCommittedBeforeSweepTs = false;
            if (commitTs == TransactionConstants.FAILED_COMMIT_TS) {
                uncommittedTs.add(startTs);
            } else if (commitTs < sweepTs) {
                tsToSweep.add(startTs);
                lastIsCommittedBeforeSweepTs = true;
            }
        }

        tsToSweep = checkIfLastShouldBeSwept(tsToSweep, candidate.isLatestValueEmpty(), lastIsCommittedBeforeSweepTs);
        boolean shouldAddSentinel = sweeper.shouldAddSentinels() && !tsToSweep.isEmpty();
        tsToSweep.addAll(uncommittedTs);

        if (tsToSweep.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(ImmutableCellToSweep.builder()
                    .cell(candidate.cell())
                    .sortedTimestamps(tsToSweep)
                    .needsSentinel(shouldAddSentinel)
                    .build()
            );
        }
    }

    private static Set<Long> getAllTimestamps(Collection<CandidateCellForSweeping> candidates) {
        return candidates.stream()
                .map(CandidateCellForSweeping::sortedTimestamps)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    private List<Long> checkIfLastShouldBeSwept(List<Long> tsToSweep, boolean lastIsTombstone,
            boolean lastIsCommittedBeforeSweepTs) {
        if (!tsToSweep.isEmpty() && !shouldSweepLast(lastIsTombstone, lastIsCommittedBeforeSweepTs)) {
            tsToSweep.remove(tsToSweep.size() - 1);
        }
        return tsToSweep;
    }

    private boolean shouldSweepLast(boolean lastIsTombstone, boolean lastIsCommittedBeforeSweepTs) {
        return sweeper.shouldSweepLastCommitted() && lastIsTombstone && lastIsCommittedBeforeSweepTs;
    }
}
