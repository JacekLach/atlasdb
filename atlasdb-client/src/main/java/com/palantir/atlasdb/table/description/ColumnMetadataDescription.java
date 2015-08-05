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
package com.palantir.atlasdb.table.description;

import java.util.List;
import java.util.Set;

import javax.annotation.concurrent.Immutable;

import org.apache.commons.lang.Validate;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.palantir.atlasdb.protos.generated.TableMetadataPersistence;
import com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder;

@Immutable
public class ColumnMetadataDescription {
    final ImmutableSet<NamedColumnDescription> namedColumns;
    final DynamicColumnDescription dynamicColumn;

    public ColumnMetadataDescription() {
        this(new DynamicColumnDescription(new NameMetadataDescription(), ColumnValueDescription.forType(ValueType.BLOB)));
    }

    public ColumnMetadataDescription(Iterable<NamedColumnDescription> namedColumns) {
        this.namedColumns = ImmutableSet.copyOf(namedColumns);
        this.dynamicColumn = null;
    }

    public ColumnMetadataDescription(DynamicColumnDescription dynamicColumn) {
        namedColumns = null;
        this.dynamicColumn = dynamicColumn;
    }

    public Set<NamedColumnDescription> getNamedColumns() {
        return namedColumns;
    }

    public DynamicColumnDescription getDynamicColumn() {
        return dynamicColumn;
    }

    public List<ColumnValueDescription> getAllColumnValues() {
        if (dynamicColumn != null) {
            return ImmutableList.of(dynamicColumn.getValue());
        }
        List<ColumnValueDescription> ret = Lists.newArrayList();
        for (NamedColumnDescription col : namedColumns) {
            ret.add(col.value);
        }
        return ret;
    }

    public int getMaxValueSize() {
        if (dynamicColumn != null) {
            return dynamicColumn.getValue().getMaxValueSize();
        }
        int max = 0;
        for (NamedColumnDescription col : namedColumns) {
            max = Math.max(max, col.getValue().getMaxValueSize());
        }
        return max;
    }

    public TableMetadataPersistence.ColumnMetadataDescription.Builder persistToProto() {
        Builder builder = TableMetadataPersistence.ColumnMetadataDescription.newBuilder();
        if (namedColumns != null) {
            for (NamedColumnDescription col : namedColumns) {
                builder.addNamedColumns(col.persistToProto());
            }
        } else {
            builder.setDynamicColumn(dynamicColumn.persistToProto());
        }
        return builder;
    }

    public static ColumnMetadataDescription hydrateFromProto(TableMetadataPersistence.ColumnMetadataDescription message) {
        if (message.hasDynamicColumn()) {
            Validate.isTrue(message.getNamedColumnsCount() == 0);
            return new ColumnMetadataDescription(DynamicColumnDescription.hydrateFromProto(message.getDynamicColumn()));
        } else {
            List<NamedColumnDescription> list = Lists.newArrayList();
            for (TableMetadataPersistence.NamedColumnDescription col : message.getNamedColumnsList()) {
                list.add(NamedColumnDescription.hydrateFromProto(col));
            }
            return new ColumnMetadataDescription(list);
        }
    }

    public boolean hasDynamicColumns() {
        return dynamicColumn != null;
    }

    @Override
    public String toString() {
        if (namedColumns == null) {
            return "ColumnMetadataDescription [dynamicColumn=" + dynamicColumn + "]";
        } else {
            return "ColumnMetadataDescription [namedColumns=" + namedColumns + "]";
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;

        int result = 1;
        result = prime * result + (namedColumns == null ? 0 : namedColumns.hashCode());
        result = prime * result + (dynamicColumn == null ? 0 : dynamicColumn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ColumnMetadataDescription other = (ColumnMetadataDescription) obj;
        if (namedColumns == null) {
            if (other.getNamedColumns() != null) {
                return false;
            }
        } else if (!namedColumns.equals(other.getNamedColumns())) {
            return false;
        }
        if (dynamicColumn == null) {
            if (other.getDynamicColumn() != null) {
                return false;
            }
        } else if (!dynamicColumn.equals(other.getDynamicColumn())) {
            return false;
        }
        return true;
    }
}
