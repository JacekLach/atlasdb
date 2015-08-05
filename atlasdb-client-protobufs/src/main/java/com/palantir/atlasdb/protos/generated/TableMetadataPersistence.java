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
package com.palantir.atlasdb.protos.generated;

public final class TableMetadataPersistence {
  private TableMetadataPersistence() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.ValueType}
   */
  public enum ValueType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VAR_LONG = 1;</code>
     */
    VAR_LONG(0, 1),
    /**
     * <code>FIXED_LONG = 2;</code>
     */
    FIXED_LONG(1, 2),
    /**
     * <code>STRING = 3;</code>
     */
    STRING(2, 3),
    /**
     * <code>BLOB = 4;</code>
     */
    BLOB(3, 4),
    /**
     * <code>VAR_SIGNED_LONG = 5;</code>
     */
    VAR_SIGNED_LONG(4, 5),
    /**
     * <code>FIXED_LONG_LITTLE_ENDIAN = 6;</code>
     */
    FIXED_LONG_LITTLE_ENDIAN(5, 6),
    /**
     * <code>SHA256HASH = 7;</code>
     */
    SHA256HASH(6, 7),
    /**
     * <code>VAR_STRING = 8;</code>
     */
    VAR_STRING(7, 8),
    /**
     * <code>NULLABLE_FIXED_LONG = 9;</code>
     */
    NULLABLE_FIXED_LONG(8, 9),
    /**
     * <code>SIZED_BLOB = 10;</code>
     */
    SIZED_BLOB(9, 10),
    ;

    /**
     * <code>VAR_LONG = 1;</code>
     */
    public static final int VAR_LONG_VALUE = 1;
    /**
     * <code>FIXED_LONG = 2;</code>
     */
    public static final int FIXED_LONG_VALUE = 2;
    /**
     * <code>STRING = 3;</code>
     */
    public static final int STRING_VALUE = 3;
    /**
     * <code>BLOB = 4;</code>
     */
    public static final int BLOB_VALUE = 4;
    /**
     * <code>VAR_SIGNED_LONG = 5;</code>
     */
    public static final int VAR_SIGNED_LONG_VALUE = 5;
    /**
     * <code>FIXED_LONG_LITTLE_ENDIAN = 6;</code>
     */
    public static final int FIXED_LONG_LITTLE_ENDIAN_VALUE = 6;
    /**
     * <code>SHA256HASH = 7;</code>
     */
    public static final int SHA256HASH_VALUE = 7;
    /**
     * <code>VAR_STRING = 8;</code>
     */
    public static final int VAR_STRING_VALUE = 8;
    /**
     * <code>NULLABLE_FIXED_LONG = 9;</code>
     */
    public static final int NULLABLE_FIXED_LONG_VALUE = 9;
    /**
     * <code>SIZED_BLOB = 10;</code>
     */
    public static final int SIZED_BLOB_VALUE = 10;


    public final int getNumber() { return value; }

    public static ValueType valueOf(int value) {
      switch (value) {
        case 1: return VAR_LONG;
        case 2: return FIXED_LONG;
        case 3: return STRING;
        case 4: return BLOB;
        case 5: return VAR_SIGNED_LONG;
        case 6: return FIXED_LONG_LITTLE_ENDIAN;
        case 7: return SHA256HASH;
        case 8: return VAR_STRING;
        case 9: return NULLABLE_FIXED_LONG;
        case 10: return SIZED_BLOB;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ValueType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ValueType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ValueType>() {
            public ValueType findValueByNumber(int number) {
              return ValueType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(0);
    }

    private static final ValueType[] VALUES = values();

    public static ValueType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ValueType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.ValueType)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.Compression}
   */
  public enum Compression
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 1;</code>
     */
    NONE(0, 1),
    /**
     * <code>SNAPPY = 2;</code>
     */
    SNAPPY(1, 2),
    ;

    /**
     * <code>NONE = 1;</code>
     */
    public static final int NONE_VALUE = 1;
    /**
     * <code>SNAPPY = 2;</code>
     */
    public static final int SNAPPY_VALUE = 2;


    public final int getNumber() { return value; }

    public static Compression valueOf(int value) {
      switch (value) {
        case 1: return NONE;
        case 2: return SNAPPY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Compression>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Compression>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Compression>() {
            public Compression findValueByNumber(int number) {
              return Compression.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(1);
    }

    private static final Compression[] VALUES = values();

    public static Compression valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Compression(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.Compression)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.ColumnValueFormat}
   */
  public enum ColumnValueFormat
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROTO = 1;</code>
     */
    PROTO(0, 1),
    /**
     * <code>PERSISTABLE = 2;</code>
     */
    PERSISTABLE(1, 2),
    /**
     * <code>VALUE_TYPE = 3;</code>
     */
    VALUE_TYPE(2, 3),
    ;

    /**
     * <code>PROTO = 1;</code>
     */
    public static final int PROTO_VALUE = 1;
    /**
     * <code>PERSISTABLE = 2;</code>
     */
    public static final int PERSISTABLE_VALUE = 2;
    /**
     * <code>VALUE_TYPE = 3;</code>
     */
    public static final int VALUE_TYPE_VALUE = 3;


    public final int getNumber() { return value; }

    public static ColumnValueFormat valueOf(int value) {
      switch (value) {
        case 1: return PROTO;
        case 2: return PERSISTABLE;
        case 3: return VALUE_TYPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ColumnValueFormat>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ColumnValueFormat>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ColumnValueFormat>() {
            public ColumnValueFormat findValueByNumber(int number) {
              return ColumnValueFormat.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(2);
    }

    private static final ColumnValueFormat[] VALUES = values();

    public static ColumnValueFormat valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ColumnValueFormat(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.ColumnValueFormat)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.ValueByteOrder}
   */
  public enum ValueByteOrder
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ASCENDING = 1;</code>
     */
    ASCENDING(0, 1),
    /**
     * <code>DESCENDING = 2;</code>
     */
    DESCENDING(1, 2),
    ;

    /**
     * <code>ASCENDING = 1;</code>
     */
    public static final int ASCENDING_VALUE = 1;
    /**
     * <code>DESCENDING = 2;</code>
     */
    public static final int DESCENDING_VALUE = 2;


    public final int getNumber() { return value; }

    public static ValueByteOrder valueOf(int value) {
      switch (value) {
        case 1: return ASCENDING;
        case 2: return DESCENDING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ValueByteOrder>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ValueByteOrder>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ValueByteOrder>() {
            public ValueByteOrder findValueByNumber(int number) {
              return ValueByteOrder.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(3);
    }

    private static final ValueByteOrder[] VALUES = values();

    public static ValueByteOrder valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ValueByteOrder(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.ValueByteOrder)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.TableConflictHandler}
   */
  public enum TableConflictHandler
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IGNORE_ALL = 1;</code>
     */
    IGNORE_ALL(0, 1),
    /**
     * <code>RETRY_ON_WRITE_WRITE = 2;</code>
     */
    RETRY_ON_WRITE_WRITE(1, 2),
    /**
     * <code>RETRY_ON_VALUE_CHANGED = 3;</code>
     */
    RETRY_ON_VALUE_CHANGED(2, 3),
    /**
     * <code>SERIALIZABLE = 4;</code>
     */
    SERIALIZABLE(3, 4),
    /**
     * <code>RETRY_ON_WRITE_WRITE_CELL = 5;</code>
     */
    RETRY_ON_WRITE_WRITE_CELL(4, 5),
    ;

    /**
     * <code>IGNORE_ALL = 1;</code>
     */
    public static final int IGNORE_ALL_VALUE = 1;
    /**
     * <code>RETRY_ON_WRITE_WRITE = 2;</code>
     */
    public static final int RETRY_ON_WRITE_WRITE_VALUE = 2;
    /**
     * <code>RETRY_ON_VALUE_CHANGED = 3;</code>
     */
    public static final int RETRY_ON_VALUE_CHANGED_VALUE = 3;
    /**
     * <code>SERIALIZABLE = 4;</code>
     */
    public static final int SERIALIZABLE_VALUE = 4;
    /**
     * <code>RETRY_ON_WRITE_WRITE_CELL = 5;</code>
     */
    public static final int RETRY_ON_WRITE_WRITE_CELL_VALUE = 5;


    public final int getNumber() { return value; }

    public static TableConflictHandler valueOf(int value) {
      switch (value) {
        case 1: return IGNORE_ALL;
        case 2: return RETRY_ON_WRITE_WRITE;
        case 3: return RETRY_ON_VALUE_CHANGED;
        case 4: return SERIALIZABLE;
        case 5: return RETRY_ON_WRITE_WRITE_CELL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TableConflictHandler>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TableConflictHandler>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TableConflictHandler>() {
            public TableConflictHandler findValueByNumber(int number) {
              return TableConflictHandler.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(4);
    }

    private static final TableConflictHandler[] VALUES = values();

    public static TableConflictHandler valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private TableConflictHandler(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.TableConflictHandler)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.CachePriority}
   */
  public enum CachePriority
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>COLDEST = 0;</code>
     */
    COLDEST(0, 0),
    /**
     * <code>COLD = 32;</code>
     */
    COLD(1, 32),
    /**
     * <code>WARM = 64;</code>
     */
    WARM(2, 64),
    /**
     * <code>HOT = 96;</code>
     */
    HOT(3, 96),
    /**
     * <code>HOTTEST = 127;</code>
     */
    HOTTEST(4, 127),
    ;

    /**
     * <code>COLDEST = 0;</code>
     */
    public static final int COLDEST_VALUE = 0;
    /**
     * <code>COLD = 32;</code>
     */
    public static final int COLD_VALUE = 32;
    /**
     * <code>WARM = 64;</code>
     */
    public static final int WARM_VALUE = 64;
    /**
     * <code>HOT = 96;</code>
     */
    public static final int HOT_VALUE = 96;
    /**
     * <code>HOTTEST = 127;</code>
     */
    public static final int HOTTEST_VALUE = 127;


    public final int getNumber() { return value; }

    public static CachePriority valueOf(int value) {
      switch (value) {
        case 0: return COLDEST;
        case 32: return COLD;
        case 64: return WARM;
        case 96: return HOT;
        case 127: return HOTTEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CachePriority>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<CachePriority>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CachePriority>() {
            public CachePriority findValueByNumber(int number) {
              return CachePriority.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(5);
    }

    private static final CachePriority[] VALUES = values();

    public static CachePriority valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private CachePriority(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.CachePriority)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.PartitionStrategy}
   */
  public enum PartitionStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ORDERED = 0;</code>
     */
    ORDERED(0, 0),
    /**
     * <code>HASH = 1;</code>
     */
    HASH(1, 1),
    ;

    /**
     * <code>ORDERED = 0;</code>
     */
    public static final int ORDERED_VALUE = 0;
    /**
     * <code>HASH = 1;</code>
     */
    public static final int HASH_VALUE = 1;


    public final int getNumber() { return value; }

    public static PartitionStrategy valueOf(int value) {
      switch (value) {
        case 0: return ORDERED;
        case 1: return HASH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PartitionStrategy>() {
            public PartitionStrategy findValueByNumber(int number) {
              return PartitionStrategy.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(6);
    }

    private static final PartitionStrategy[] VALUES = values();

    public static PartitionStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PartitionStrategy(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.PartitionStrategy)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.SweepStrategy}
   */
  public enum SweepStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NOTHING = 0;</code>
     */
    NOTHING(0, 0),
    /**
     * <code>CONSERVATIVE = 1;</code>
     */
    CONSERVATIVE(1, 1),
    /**
     * <code>THOROUGH = 2;</code>
     */
    THOROUGH(2, 2),
    ;

    /**
     * <code>NOTHING = 0;</code>
     */
    public static final int NOTHING_VALUE = 0;
    /**
     * <code>CONSERVATIVE = 1;</code>
     */
    public static final int CONSERVATIVE_VALUE = 1;
    /**
     * <code>THOROUGH = 2;</code>
     */
    public static final int THOROUGH_VALUE = 2;


    public final int getNumber() { return value; }

    public static SweepStrategy valueOf(int value) {
      switch (value) {
        case 0: return NOTHING;
        case 1: return CONSERVATIVE;
        case 2: return THOROUGH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SweepStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<SweepStrategy>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SweepStrategy>() {
            public SweepStrategy findValueByNumber(int number) {
              return SweepStrategy.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(7);
    }

    private static final SweepStrategy[] VALUES = values();

    public static SweepStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private SweepStrategy(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.SweepStrategy)
  }

  /**
   * Protobuf enum {@code com.palantir.atlasdb.protos.generated.ExpirationStrategy}
   */
  public enum ExpirationStrategy
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NEVER = 0;</code>
     */
    NEVER(0, 0),
    /**
     * <code>INDIVIDUALLY_SPECIFIED = 1;</code>
     */
    INDIVIDUALLY_SPECIFIED(1, 1),
    ;

    /**
     * <code>NEVER = 0;</code>
     */
    public static final int NEVER_VALUE = 0;
    /**
     * <code>INDIVIDUALLY_SPECIFIED = 1;</code>
     */
    public static final int INDIVIDUALLY_SPECIFIED_VALUE = 1;


    public final int getNumber() { return value; }

    public static ExpirationStrategy valueOf(int value) {
      switch (value) {
        case 0: return NEVER;
        case 1: return INDIVIDUALLY_SPECIFIED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExpirationStrategy>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ExpirationStrategy>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExpirationStrategy>() {
            public ExpirationStrategy findValueByNumber(int number) {
              return ExpirationStrategy.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.getDescriptor().getEnumTypes().get(8);
    }

    private static final ExpirationStrategy[] VALUES = values();

    public static ExpirationStrategy valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ExpirationStrategy(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.palantir.atlasdb.protos.generated.ExpirationStrategy)
  }

  public interface TableMetadataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.TableMetadata)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
     */
    boolean hasRowName();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getRowName();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder getRowNameOrBuilder();

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
     */
    boolean hasColumns();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription getColumns();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder getColumnsOrBuilder();

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
     */
    boolean hasConflictHandler();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler getConflictHandler();

    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
     */
    boolean hasCachePriority();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority getCachePriority();

    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
     */
    boolean hasPartitionStrategy();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy getPartitionStrategy();

    /**
     * <code>optional bool rangeScanAllowed = 6;</code>
     */
    boolean hasRangeScanAllowed();
    /**
     * <code>optional bool rangeScanAllowed = 6;</code>
     */
    boolean getRangeScanAllowed();

    /**
     * <code>optional bool dbCompressionRequested = 7;</code>
     */
    boolean hasDbCompressionRequested();
    /**
     * <code>optional bool dbCompressionRequested = 7;</code>
     */
    boolean getDbCompressionRequested();

    /**
     * <code>optional bool negativeLookups = 8;</code>
     */
    boolean hasNegativeLookups();
    /**
     * <code>optional bool negativeLookups = 8;</code>
     */
    boolean getNegativeLookups();

    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
     */
    boolean hasSweepStrategy();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy getSweepStrategy();
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.TableMetadata}
   */
  public static final class TableMetadata extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.TableMetadata)
      TableMetadataOrBuilder {
    // Use TableMetadata.newBuilder() to construct.
    private TableMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TableMetadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TableMetadata defaultInstance;
    public static TableMetadata getDefaultInstance() {
      return defaultInstance;
    }

    public TableMetadata getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TableMetadata(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = rowName_.toBuilder();
              }
              rowName_ = input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rowName_);
                rowName_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = columns_.toBuilder();
              }
              columns_ = input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(columns_);
                columns_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                conflictHandler_ = value;
              }
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                cachePriority_ = value;
              }
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                partitionStrategy_ = value;
              }
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              rangeScanAllowed_ = input.readBool();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              dbCompressionRequested_ = input.readBool();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              negativeLookups_ = input.readBool();
              break;
            }
            case 72: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(9, rawValue);
              } else {
                bitField0_ |= 0x00000100;
                sweepStrategy_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.Builder.class);
    }

    public static com.google.protobuf.Parser<TableMetadata> PARSER =
        new com.google.protobuf.AbstractParser<TableMetadata>() {
      public TableMetadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TableMetadata(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TableMetadata> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ROWNAME_FIELD_NUMBER = 1;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription rowName_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
     */
    public boolean hasRowName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getRowName() {
      return rowName_;
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder getRowNameOrBuilder() {
      return rowName_;
    }

    public static final int COLUMNS_FIELD_NUMBER = 2;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription columns_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
     */
    public boolean hasColumns() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription getColumns() {
      return columns_;
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder getColumnsOrBuilder() {
      return columns_;
    }

    public static final int CONFLICTHANDLER_FIELD_NUMBER = 3;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler conflictHandler_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
     */
    public boolean hasConflictHandler() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler getConflictHandler() {
      return conflictHandler_;
    }

    public static final int CACHEPRIORITY_FIELD_NUMBER = 4;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority cachePriority_;
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
     */
    public boolean hasCachePriority() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority getCachePriority() {
      return cachePriority_;
    }

    public static final int PARTITIONSTRATEGY_FIELD_NUMBER = 5;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy partitionStrategy_;
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
     */
    public boolean hasPartitionStrategy() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy getPartitionStrategy() {
      return partitionStrategy_;
    }

    public static final int RANGESCANALLOWED_FIELD_NUMBER = 6;
    private boolean rangeScanAllowed_;
    /**
     * <code>optional bool rangeScanAllowed = 6;</code>
     */
    public boolean hasRangeScanAllowed() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bool rangeScanAllowed = 6;</code>
     */
    public boolean getRangeScanAllowed() {
      return rangeScanAllowed_;
    }

    public static final int DBCOMPRESSIONREQUESTED_FIELD_NUMBER = 7;
    private boolean dbCompressionRequested_;
    /**
     * <code>optional bool dbCompressionRequested = 7;</code>
     */
    public boolean hasDbCompressionRequested() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional bool dbCompressionRequested = 7;</code>
     */
    public boolean getDbCompressionRequested() {
      return dbCompressionRequested_;
    }

    public static final int NEGATIVELOOKUPS_FIELD_NUMBER = 8;
    private boolean negativeLookups_;
    /**
     * <code>optional bool negativeLookups = 8;</code>
     */
    public boolean hasNegativeLookups() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional bool negativeLookups = 8;</code>
     */
    public boolean getNegativeLookups() {
      return negativeLookups_;
    }

    public static final int SWEEPSTRATEGY_FIELD_NUMBER = 9;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy sweepStrategy_;
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
     */
    public boolean hasSweepStrategy() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy getSweepStrategy() {
      return sweepStrategy_;
    }

    private void initFields() {
      rowName_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
      columns_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance();
      conflictHandler_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler.IGNORE_ALL;
      cachePriority_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority.COLDEST;
      partitionStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy.ORDERED;
      rangeScanAllowed_ = false;
      dbCompressionRequested_ = false;
      negativeLookups_ = false;
      sweepStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy.NOTHING;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRowName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasColumns()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasConflictHandler()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRowName().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getColumns().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, rowName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, columns_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, conflictHandler_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, cachePriority_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, partitionStrategy_.getNumber());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBool(6, rangeScanAllowed_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBool(7, dbCompressionRequested_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBool(8, negativeLookups_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeEnum(9, sweepStrategy_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, rowName_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, columns_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, conflictHandler_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, cachePriority_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, partitionStrategy_.getNumber());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, rangeScanAllowed_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, dbCompressionRequested_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, negativeLookups_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, sweepStrategy_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.TableMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.TableMetadata)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRowNameFieldBuilder();
          getColumnsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (rowNameBuilder_ == null) {
          rowName_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
        } else {
          rowNameBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (columnsBuilder_ == null) {
          columns_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance();
        } else {
          columnsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        conflictHandler_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler.IGNORE_ALL;
        bitField0_ = (bitField0_ & ~0x00000004);
        cachePriority_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority.COLDEST;
        bitField0_ = (bitField0_ & ~0x00000008);
        partitionStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy.ORDERED;
        bitField0_ = (bitField0_ & ~0x00000010);
        rangeScanAllowed_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        dbCompressionRequested_ = false;
        bitField0_ = (bitField0_ & ~0x00000040);
        negativeLookups_ = false;
        bitField0_ = (bitField0_ & ~0x00000080);
        sweepStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy.NOTHING;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (rowNameBuilder_ == null) {
          result.rowName_ = rowName_;
        } else {
          result.rowName_ = rowNameBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (columnsBuilder_ == null) {
          result.columns_ = columns_;
        } else {
          result.columns_ = columnsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.conflictHandler_ = conflictHandler_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.cachePriority_ = cachePriority_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.partitionStrategy_ = partitionStrategy_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.rangeScanAllowed_ = rangeScanAllowed_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.dbCompressionRequested_ = dbCompressionRequested_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.negativeLookups_ = negativeLookups_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.sweepStrategy_ = sweepStrategy_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata.getDefaultInstance()) return this;
        if (other.hasRowName()) {
          mergeRowName(other.getRowName());
        }
        if (other.hasColumns()) {
          mergeColumns(other.getColumns());
        }
        if (other.hasConflictHandler()) {
          setConflictHandler(other.getConflictHandler());
        }
        if (other.hasCachePriority()) {
          setCachePriority(other.getCachePriority());
        }
        if (other.hasPartitionStrategy()) {
          setPartitionStrategy(other.getPartitionStrategy());
        }
        if (other.hasRangeScanAllowed()) {
          setRangeScanAllowed(other.getRangeScanAllowed());
        }
        if (other.hasDbCompressionRequested()) {
          setDbCompressionRequested(other.getDbCompressionRequested());
        }
        if (other.hasNegativeLookups()) {
          setNegativeLookups(other.getNegativeLookups());
        }
        if (other.hasSweepStrategy()) {
          setSweepStrategy(other.getSweepStrategy());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRowName()) {
          
          return false;
        }
        if (!hasColumns()) {
          
          return false;
        }
        if (!hasConflictHandler()) {
          
          return false;
        }
        if (!getRowName().isInitialized()) {
          
          return false;
        }
        if (!getColumns().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableMetadata) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription rowName_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder> rowNameBuilder_;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public boolean hasRowName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getRowName() {
        if (rowNameBuilder_ == null) {
          return rowName_;
        } else {
          return rowNameBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public Builder setRowName(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription value) {
        if (rowNameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rowName_ = value;
          onChanged();
        } else {
          rowNameBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public Builder setRowName(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder builderForValue) {
        if (rowNameBuilder_ == null) {
          rowName_ = builderForValue.build();
          onChanged();
        } else {
          rowNameBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public Builder mergeRowName(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription value) {
        if (rowNameBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              rowName_ != com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance()) {
            rowName_ =
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.newBuilder(rowName_).mergeFrom(value).buildPartial();
          } else {
            rowName_ = value;
          }
          onChanged();
        } else {
          rowNameBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public Builder clearRowName() {
        if (rowNameBuilder_ == null) {
          rowName_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
          onChanged();
        } else {
          rowNameBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder getRowNameBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRowNameFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder getRowNameOrBuilder() {
        if (rowNameBuilder_ != null) {
          return rowNameBuilder_.getMessageOrBuilder();
        } else {
          return rowName_;
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription rowName = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder> 
          getRowNameFieldBuilder() {
        if (rowNameBuilder_ == null) {
          rowNameBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder>(
                  getRowName(),
                  getParentForChildren(),
                  isClean());
          rowName_ = null;
        }
        return rowNameBuilder_;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription columns_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder> columnsBuilder_;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public boolean hasColumns() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription getColumns() {
        if (columnsBuilder_ == null) {
          return columns_;
        } else {
          return columnsBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public Builder setColumns(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription value) {
        if (columnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          columns_ = value;
          onChanged();
        } else {
          columnsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public Builder setColumns(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder builderForValue) {
        if (columnsBuilder_ == null) {
          columns_ = builderForValue.build();
          onChanged();
        } else {
          columnsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public Builder mergeColumns(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription value) {
        if (columnsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              columns_ != com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance()) {
            columns_ =
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.newBuilder(columns_).mergeFrom(value).buildPartial();
          } else {
            columns_ = value;
          }
          onChanged();
        } else {
          columnsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public Builder clearColumns() {
        if (columnsBuilder_ == null) {
          columns_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance();
          onChanged();
        } else {
          columnsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder getColumnsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getColumnsFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder getColumnsOrBuilder() {
        if (columnsBuilder_ != null) {
          return columnsBuilder_.getMessageOrBuilder();
        } else {
          return columns_;
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnMetadataDescription columns = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder> 
          getColumnsFieldBuilder() {
        if (columnsBuilder_ == null) {
          columnsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder>(
                  getColumns(),
                  getParentForChildren(),
                  isClean());
          columns_ = null;
        }
        return columnsBuilder_;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler conflictHandler_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler.IGNORE_ALL;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
       */
      public boolean hasConflictHandler() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler getConflictHandler() {
        return conflictHandler_;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
       */
      public Builder setConflictHandler(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        conflictHandler_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.TableConflictHandler conflictHandler = 3;</code>
       */
      public Builder clearConflictHandler() {
        bitField0_ = (bitField0_ & ~0x00000004);
        conflictHandler_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.TableConflictHandler.IGNORE_ALL;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority cachePriority_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority.COLDEST;
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
       */
      public boolean hasCachePriority() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority getCachePriority() {
        return cachePriority_;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
       */
      public Builder setCachePriority(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        cachePriority_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.CachePriority cachePriority = 4;</code>
       */
      public Builder clearCachePriority() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cachePriority_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.CachePriority.COLDEST;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy partitionStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy.ORDERED;
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
       */
      public boolean hasPartitionStrategy() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy getPartitionStrategy() {
        return partitionStrategy_;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
       */
      public Builder setPartitionStrategy(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        partitionStrategy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.PartitionStrategy partitionStrategy = 5;</code>
       */
      public Builder clearPartitionStrategy() {
        bitField0_ = (bitField0_ & ~0x00000010);
        partitionStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.PartitionStrategy.ORDERED;
        onChanged();
        return this;
      }

      private boolean rangeScanAllowed_ ;
      /**
       * <code>optional bool rangeScanAllowed = 6;</code>
       */
      public boolean hasRangeScanAllowed() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bool rangeScanAllowed = 6;</code>
       */
      public boolean getRangeScanAllowed() {
        return rangeScanAllowed_;
      }
      /**
       * <code>optional bool rangeScanAllowed = 6;</code>
       */
      public Builder setRangeScanAllowed(boolean value) {
        bitField0_ |= 0x00000020;
        rangeScanAllowed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool rangeScanAllowed = 6;</code>
       */
      public Builder clearRangeScanAllowed() {
        bitField0_ = (bitField0_ & ~0x00000020);
        rangeScanAllowed_ = false;
        onChanged();
        return this;
      }

      private boolean dbCompressionRequested_ ;
      /**
       * <code>optional bool dbCompressionRequested = 7;</code>
       */
      public boolean hasDbCompressionRequested() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional bool dbCompressionRequested = 7;</code>
       */
      public boolean getDbCompressionRequested() {
        return dbCompressionRequested_;
      }
      /**
       * <code>optional bool dbCompressionRequested = 7;</code>
       */
      public Builder setDbCompressionRequested(boolean value) {
        bitField0_ |= 0x00000040;
        dbCompressionRequested_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool dbCompressionRequested = 7;</code>
       */
      public Builder clearDbCompressionRequested() {
        bitField0_ = (bitField0_ & ~0x00000040);
        dbCompressionRequested_ = false;
        onChanged();
        return this;
      }

      private boolean negativeLookups_ ;
      /**
       * <code>optional bool negativeLookups = 8;</code>
       */
      public boolean hasNegativeLookups() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional bool negativeLookups = 8;</code>
       */
      public boolean getNegativeLookups() {
        return negativeLookups_;
      }
      /**
       * <code>optional bool negativeLookups = 8;</code>
       */
      public Builder setNegativeLookups(boolean value) {
        bitField0_ |= 0x00000080;
        negativeLookups_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool negativeLookups = 8;</code>
       */
      public Builder clearNegativeLookups() {
        bitField0_ = (bitField0_ & ~0x00000080);
        negativeLookups_ = false;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy sweepStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy.NOTHING;
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
       */
      public boolean hasSweepStrategy() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy getSweepStrategy() {
        return sweepStrategy_;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
       */
      public Builder setSweepStrategy(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        sweepStrategy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.SweepStrategy sweepStrategy = 9;</code>
       */
      public Builder clearSweepStrategy() {
        bitField0_ = (bitField0_ & ~0x00000100);
        sweepStrategy_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.SweepStrategy.NOTHING;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.TableMetadata)
    }

    static {
      defaultInstance = new TableMetadata(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.TableMetadata)
  }

  public interface NameMetadataDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.NameMetadataDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription> 
        getNamePartsList();
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription getNameParts(int index);
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    int getNamePartsCount();
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    java.util.List<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder> 
        getNamePartsOrBuilderList();
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder getNamePartsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.NameMetadataDescription}
   */
  public static final class NameMetadataDescription extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.NameMetadataDescription)
      NameMetadataDescriptionOrBuilder {
    // Use NameMetadataDescription.newBuilder() to construct.
    private NameMetadataDescription(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NameMetadataDescription(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NameMetadataDescription defaultInstance;
    public static NameMetadataDescription getDefaultInstance() {
      return defaultInstance;
    }

    public NameMetadataDescription getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NameMetadataDescription(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                nameParts_ = new java.util.ArrayList<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription>();
                mutable_bitField0_ |= 0x00000001;
              }
              nameParts_.add(input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          nameParts_ = java.util.Collections.unmodifiableList(nameParts_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder.class);
    }

    public static com.google.protobuf.Parser<NameMetadataDescription> PARSER =
        new com.google.protobuf.AbstractParser<NameMetadataDescription>() {
      public NameMetadataDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NameMetadataDescription(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NameMetadataDescription> getParserForType() {
      return PARSER;
    }

    public static final int NAMEPARTS_FIELD_NUMBER = 1;
    private java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription> nameParts_;
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    public java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription> getNamePartsList() {
      return nameParts_;
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    public java.util.List<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder> 
        getNamePartsOrBuilderList() {
      return nameParts_;
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    public int getNamePartsCount() {
      return nameParts_.size();
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription getNameParts(int index) {
      return nameParts_.get(index);
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder getNamePartsOrBuilder(
        int index) {
      return nameParts_.get(index);
    }

    private void initFields() {
      nameParts_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getNamePartsCount(); i++) {
        if (!getNameParts(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < nameParts_.size(); i++) {
        output.writeMessage(1, nameParts_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nameParts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, nameParts_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.NameMetadataDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.NameMetadataDescription)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getNamePartsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (namePartsBuilder_ == null) {
          nameParts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          namePartsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription(this);
        int from_bitField0_ = bitField0_;
        if (namePartsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            nameParts_ = java.util.Collections.unmodifiableList(nameParts_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nameParts_ = nameParts_;
        } else {
          result.nameParts_ = namePartsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance()) return this;
        if (namePartsBuilder_ == null) {
          if (!other.nameParts_.isEmpty()) {
            if (nameParts_.isEmpty()) {
              nameParts_ = other.nameParts_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNamePartsIsMutable();
              nameParts_.addAll(other.nameParts_);
            }
            onChanged();
          }
        } else {
          if (!other.nameParts_.isEmpty()) {
            if (namePartsBuilder_.isEmpty()) {
              namePartsBuilder_.dispose();
              namePartsBuilder_ = null;
              nameParts_ = other.nameParts_;
              bitField0_ = (bitField0_ & ~0x00000001);
              namePartsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNamePartsFieldBuilder() : null;
            } else {
              namePartsBuilder_.addAllMessages(other.nameParts_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getNamePartsCount(); i++) {
          if (!getNameParts(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription> nameParts_ =
        java.util.Collections.emptyList();
      private void ensureNamePartsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          nameParts_ = new java.util.ArrayList<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription>(nameParts_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder> namePartsBuilder_;

      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription> getNamePartsList() {
        if (namePartsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nameParts_);
        } else {
          return namePartsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public int getNamePartsCount() {
        if (namePartsBuilder_ == null) {
          return nameParts_.size();
        } else {
          return namePartsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription getNameParts(int index) {
        if (namePartsBuilder_ == null) {
          return nameParts_.get(index);
        } else {
          return namePartsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder setNameParts(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription value) {
        if (namePartsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNamePartsIsMutable();
          nameParts_.set(index, value);
          onChanged();
        } else {
          namePartsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder setNameParts(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder builderForValue) {
        if (namePartsBuilder_ == null) {
          ensureNamePartsIsMutable();
          nameParts_.set(index, builderForValue.build());
          onChanged();
        } else {
          namePartsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder addNameParts(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription value) {
        if (namePartsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNamePartsIsMutable();
          nameParts_.add(value);
          onChanged();
        } else {
          namePartsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder addNameParts(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription value) {
        if (namePartsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNamePartsIsMutable();
          nameParts_.add(index, value);
          onChanged();
        } else {
          namePartsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder addNameParts(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder builderForValue) {
        if (namePartsBuilder_ == null) {
          ensureNamePartsIsMutable();
          nameParts_.add(builderForValue.build());
          onChanged();
        } else {
          namePartsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder addNameParts(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder builderForValue) {
        if (namePartsBuilder_ == null) {
          ensureNamePartsIsMutable();
          nameParts_.add(index, builderForValue.build());
          onChanged();
        } else {
          namePartsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder addAllNameParts(
          java.lang.Iterable<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription> values) {
        if (namePartsBuilder_ == null) {
          ensureNamePartsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nameParts_);
          onChanged();
        } else {
          namePartsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder clearNameParts() {
        if (namePartsBuilder_ == null) {
          nameParts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          namePartsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public Builder removeNameParts(int index) {
        if (namePartsBuilder_ == null) {
          ensureNamePartsIsMutable();
          nameParts_.remove(index);
          onChanged();
        } else {
          namePartsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder getNamePartsBuilder(
          int index) {
        return getNamePartsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder getNamePartsOrBuilder(
          int index) {
        if (namePartsBuilder_ == null) {
          return nameParts_.get(index);  } else {
          return namePartsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public java.util.List<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder> 
           getNamePartsOrBuilderList() {
        if (namePartsBuilder_ != null) {
          return namePartsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nameParts_);
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder addNamePartsBuilder() {
        return getNamePartsFieldBuilder().addBuilder(
            com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.getDefaultInstance());
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder addNamePartsBuilder(
          int index) {
        return getNamePartsFieldBuilder().addBuilder(
            index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.getDefaultInstance());
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NameComponentDescription nameParts = 1;</code>
       */
      public java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder> 
           getNamePartsBuilderList() {
        return getNamePartsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder> 
          getNamePartsFieldBuilder() {
        if (namePartsBuilder_ == null) {
          namePartsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder>(
                  nameParts_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          nameParts_ = null;
        }
        return namePartsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.NameMetadataDescription)
    }

    static {
      defaultInstance = new NameMetadataDescription(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.NameMetadataDescription)
  }

  public interface NameComponentDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.NameComponentDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string componentName = 1;</code>
     */
    boolean hasComponentName();
    /**
     * <code>required string componentName = 1;</code>
     */
    java.lang.String getComponentName();
    /**
     * <code>required string componentName = 1;</code>
     */
    com.google.protobuf.ByteString
        getComponentNameBytes();

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType getType();

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
     */
    boolean hasOrder();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder getOrder();

    /**
     * <code>optional bool hasUniformPartitioner = 4;</code>
     */
    boolean hasHasUniformPartitioner();
    /**
     * <code>optional bool hasUniformPartitioner = 4;</code>
     */
    boolean getHasUniformPartitioner();

    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    com.google.protobuf.ProtocolStringList
        getExplicitParitionsList();
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    int getExplicitParitionsCount();
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    java.lang.String getExplicitParitions(int index);
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    com.google.protobuf.ByteString
        getExplicitParitionsBytes(int index);
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.NameComponentDescription}
   */
  public static final class NameComponentDescription extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.NameComponentDescription)
      NameComponentDescriptionOrBuilder {
    // Use NameComponentDescription.newBuilder() to construct.
    private NameComponentDescription(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NameComponentDescription(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NameComponentDescription defaultInstance;
    public static NameComponentDescription getDefaultInstance() {
      return defaultInstance;
    }

    public NameComponentDescription getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NameComponentDescription(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              componentName_ = bs;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = value;
              }
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                order_ = value;
              }
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              hasUniformPartitioner_ = input.readBool();
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                explicitParitions_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000010;
              }
              explicitParitions_.add(bs);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          explicitParitions_ = explicitParitions_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder.class);
    }

    public static com.google.protobuf.Parser<NameComponentDescription> PARSER =
        new com.google.protobuf.AbstractParser<NameComponentDescription>() {
      public NameComponentDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NameComponentDescription(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NameComponentDescription> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int COMPONENTNAME_FIELD_NUMBER = 1;
    private java.lang.Object componentName_;
    /**
     * <code>required string componentName = 1;</code>
     */
    public boolean hasComponentName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string componentName = 1;</code>
     */
    public java.lang.String getComponentName() {
      java.lang.Object ref = componentName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          componentName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string componentName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getComponentNameBytes() {
      java.lang.Object ref = componentName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        componentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType type_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType getType() {
      return type_;
    }

    public static final int ORDER_FIELD_NUMBER = 3;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder order_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
     */
    public boolean hasOrder() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder getOrder() {
      return order_;
    }

    public static final int HASUNIFORMPARTITIONER_FIELD_NUMBER = 4;
    private boolean hasUniformPartitioner_;
    /**
     * <code>optional bool hasUniformPartitioner = 4;</code>
     */
    public boolean hasHasUniformPartitioner() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool hasUniformPartitioner = 4;</code>
     */
    public boolean getHasUniformPartitioner() {
      return hasUniformPartitioner_;
    }

    public static final int EXPLICITPARITIONS_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList explicitParitions_;
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getExplicitParitionsList() {
      return explicitParitions_;
    }
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    public int getExplicitParitionsCount() {
      return explicitParitions_.size();
    }
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    public java.lang.String getExplicitParitions(int index) {
      return explicitParitions_.get(index);
    }
    /**
     * <code>repeated string explicitParitions = 5;</code>
     */
    public com.google.protobuf.ByteString
        getExplicitParitionsBytes(int index) {
      return explicitParitions_.getByteString(index);
    }

    private void initFields() {
      componentName_ = "";
      type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
      order_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder.ASCENDING;
      hasUniformPartitioner_ = false;
      explicitParitions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasComponentName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOrder()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getComponentNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, type_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, order_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, hasUniformPartitioner_);
      }
      for (int i = 0; i < explicitParitions_.size(); i++) {
        output.writeBytes(5, explicitParitions_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getComponentNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, order_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, hasUniformPartitioner_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < explicitParitions_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(explicitParitions_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getExplicitParitionsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.NameComponentDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.NameComponentDescription)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        componentName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
        bitField0_ = (bitField0_ & ~0x00000002);
        order_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder.ASCENDING;
        bitField0_ = (bitField0_ & ~0x00000004);
        hasUniformPartitioner_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        explicitParitions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.componentName_ = componentName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.order_ = order_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.hasUniformPartitioner_ = hasUniformPartitioner_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          explicitParitions_ = explicitParitions_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.explicitParitions_ = explicitParitions_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription.getDefaultInstance()) return this;
        if (other.hasComponentName()) {
          bitField0_ |= 0x00000001;
          componentName_ = other.componentName_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasOrder()) {
          setOrder(other.getOrder());
        }
        if (other.hasHasUniformPartitioner()) {
          setHasUniformPartitioner(other.getHasUniformPartitioner());
        }
        if (!other.explicitParitions_.isEmpty()) {
          if (explicitParitions_.isEmpty()) {
            explicitParitions_ = other.explicitParitions_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureExplicitParitionsIsMutable();
            explicitParitions_.addAll(other.explicitParitions_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasComponentName()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        if (!hasOrder()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameComponentDescription) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object componentName_ = "";
      /**
       * <code>required string componentName = 1;</code>
       */
      public boolean hasComponentName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string componentName = 1;</code>
       */
      public java.lang.String getComponentName() {
        java.lang.Object ref = componentName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            componentName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string componentName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getComponentNameBytes() {
        java.lang.Object ref = componentName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          componentName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string componentName = 1;</code>
       */
      public Builder setComponentName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        componentName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string componentName = 1;</code>
       */
      public Builder clearComponentName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        componentName_ = getDefaultInstance().getComponentName();
        onChanged();
        return this;
      }
      /**
       * <code>required string componentName = 1;</code>
       */
      public Builder setComponentNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        componentName_ = value;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType getType() {
        return type_;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
       */
      public Builder setType(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder order_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder.ASCENDING;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
       */
      public boolean hasOrder() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder getOrder() {
        return order_;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
       */
      public Builder setOrder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        order_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueByteOrder order = 3;</code>
       */
      public Builder clearOrder() {
        bitField0_ = (bitField0_ & ~0x00000004);
        order_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueByteOrder.ASCENDING;
        onChanged();
        return this;
      }

      private boolean hasUniformPartitioner_ ;
      /**
       * <code>optional bool hasUniformPartitioner = 4;</code>
       */
      public boolean hasHasUniformPartitioner() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool hasUniformPartitioner = 4;</code>
       */
      public boolean getHasUniformPartitioner() {
        return hasUniformPartitioner_;
      }
      /**
       * <code>optional bool hasUniformPartitioner = 4;</code>
       */
      public Builder setHasUniformPartitioner(boolean value) {
        bitField0_ |= 0x00000008;
        hasUniformPartitioner_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool hasUniformPartitioner = 4;</code>
       */
      public Builder clearHasUniformPartitioner() {
        bitField0_ = (bitField0_ & ~0x00000008);
        hasUniformPartitioner_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList explicitParitions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureExplicitParitionsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          explicitParitions_ = new com.google.protobuf.LazyStringArrayList(explicitParitions_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getExplicitParitionsList() {
        return explicitParitions_.getUnmodifiableView();
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public int getExplicitParitionsCount() {
        return explicitParitions_.size();
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public java.lang.String getExplicitParitions(int index) {
        return explicitParitions_.get(index);
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public com.google.protobuf.ByteString
          getExplicitParitionsBytes(int index) {
        return explicitParitions_.getByteString(index);
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public Builder setExplicitParitions(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureExplicitParitionsIsMutable();
        explicitParitions_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public Builder addExplicitParitions(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureExplicitParitionsIsMutable();
        explicitParitions_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public Builder addAllExplicitParitions(
          java.lang.Iterable<java.lang.String> values) {
        ensureExplicitParitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, explicitParitions_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public Builder clearExplicitParitions() {
        explicitParitions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string explicitParitions = 5;</code>
       */
      public Builder addExplicitParitionsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureExplicitParitionsIsMutable();
        explicitParitions_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.NameComponentDescription)
    }

    static {
      defaultInstance = new NameComponentDescription(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.NameComponentDescription)
  }

  public interface ColumnMetadataDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.ColumnMetadataDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription> 
        getNamedColumnsList();
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription getNamedColumns(int index);
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    int getNamedColumnsCount();
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    java.util.List<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder> 
        getNamedColumnsOrBuilderList();
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder getNamedColumnsOrBuilder(
        int index);

    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
     */
    boolean hasDynamicColumn();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription getDynamicColumn();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder getDynamicColumnOrBuilder();
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.ColumnMetadataDescription}
   */
  public static final class ColumnMetadataDescription extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.ColumnMetadataDescription)
      ColumnMetadataDescriptionOrBuilder {
    // Use ColumnMetadataDescription.newBuilder() to construct.
    private ColumnMetadataDescription(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ColumnMetadataDescription(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ColumnMetadataDescription defaultInstance;
    public static ColumnMetadataDescription getDefaultInstance() {
      return defaultInstance;
    }

    public ColumnMetadataDescription getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ColumnMetadataDescription(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                namedColumns_ = new java.util.ArrayList<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription>();
                mutable_bitField0_ |= 0x00000001;
              }
              namedColumns_.add(input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = dynamicColumn_.toBuilder();
              }
              dynamicColumn_ = input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dynamicColumn_);
                dynamicColumn_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          namedColumns_ = java.util.Collections.unmodifiableList(namedColumns_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder.class);
    }

    public static com.google.protobuf.Parser<ColumnMetadataDescription> PARSER =
        new com.google.protobuf.AbstractParser<ColumnMetadataDescription>() {
      public ColumnMetadataDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ColumnMetadataDescription(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ColumnMetadataDescription> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NAMEDCOLUMNS_FIELD_NUMBER = 1;
    private java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription> namedColumns_;
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    public java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription> getNamedColumnsList() {
      return namedColumns_;
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    public java.util.List<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder> 
        getNamedColumnsOrBuilderList() {
      return namedColumns_;
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    public int getNamedColumnsCount() {
      return namedColumns_.size();
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription getNamedColumns(int index) {
      return namedColumns_.get(index);
    }
    /**
     * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder getNamedColumnsOrBuilder(
        int index) {
      return namedColumns_.get(index);
    }

    public static final int DYNAMICCOLUMN_FIELD_NUMBER = 2;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription dynamicColumn_;
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
     */
    public boolean hasDynamicColumn() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription getDynamicColumn() {
      return dynamicColumn_;
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder getDynamicColumnOrBuilder() {
      return dynamicColumn_;
    }

    private void initFields() {
      namedColumns_ = java.util.Collections.emptyList();
      dynamicColumn_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getNamedColumnsCount(); i++) {
        if (!getNamedColumns(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasDynamicColumn()) {
        if (!getDynamicColumn().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < namedColumns_.size(); i++) {
        output.writeMessage(1, namedColumns_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(2, dynamicColumn_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < namedColumns_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, namedColumns_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, dynamicColumn_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.ColumnMetadataDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.ColumnMetadataDescription)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getNamedColumnsFieldBuilder();
          getDynamicColumnFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (namedColumnsBuilder_ == null) {
          namedColumns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          namedColumnsBuilder_.clear();
        }
        if (dynamicColumnBuilder_ == null) {
          dynamicColumn_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance();
        } else {
          dynamicColumnBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (namedColumnsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            namedColumns_ = java.util.Collections.unmodifiableList(namedColumns_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.namedColumns_ = namedColumns_;
        } else {
          result.namedColumns_ = namedColumnsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        if (dynamicColumnBuilder_ == null) {
          result.dynamicColumn_ = dynamicColumn_;
        } else {
          result.dynamicColumn_ = dynamicColumnBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription.getDefaultInstance()) return this;
        if (namedColumnsBuilder_ == null) {
          if (!other.namedColumns_.isEmpty()) {
            if (namedColumns_.isEmpty()) {
              namedColumns_ = other.namedColumns_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNamedColumnsIsMutable();
              namedColumns_.addAll(other.namedColumns_);
            }
            onChanged();
          }
        } else {
          if (!other.namedColumns_.isEmpty()) {
            if (namedColumnsBuilder_.isEmpty()) {
              namedColumnsBuilder_.dispose();
              namedColumnsBuilder_ = null;
              namedColumns_ = other.namedColumns_;
              bitField0_ = (bitField0_ & ~0x00000001);
              namedColumnsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNamedColumnsFieldBuilder() : null;
            } else {
              namedColumnsBuilder_.addAllMessages(other.namedColumns_);
            }
          }
        }
        if (other.hasDynamicColumn()) {
          mergeDynamicColumn(other.getDynamicColumn());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getNamedColumnsCount(); i++) {
          if (!getNamedColumns(i).isInitialized()) {
            
            return false;
          }
        }
        if (hasDynamicColumn()) {
          if (!getDynamicColumn().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnMetadataDescription) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription> namedColumns_ =
        java.util.Collections.emptyList();
      private void ensureNamedColumnsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          namedColumns_ = new java.util.ArrayList<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription>(namedColumns_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder> namedColumnsBuilder_;

      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription> getNamedColumnsList() {
        if (namedColumnsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(namedColumns_);
        } else {
          return namedColumnsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public int getNamedColumnsCount() {
        if (namedColumnsBuilder_ == null) {
          return namedColumns_.size();
        } else {
          return namedColumnsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription getNamedColumns(int index) {
        if (namedColumnsBuilder_ == null) {
          return namedColumns_.get(index);
        } else {
          return namedColumnsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder setNamedColumns(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription value) {
        if (namedColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNamedColumnsIsMutable();
          namedColumns_.set(index, value);
          onChanged();
        } else {
          namedColumnsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder setNamedColumns(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder builderForValue) {
        if (namedColumnsBuilder_ == null) {
          ensureNamedColumnsIsMutable();
          namedColumns_.set(index, builderForValue.build());
          onChanged();
        } else {
          namedColumnsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder addNamedColumns(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription value) {
        if (namedColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNamedColumnsIsMutable();
          namedColumns_.add(value);
          onChanged();
        } else {
          namedColumnsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder addNamedColumns(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription value) {
        if (namedColumnsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNamedColumnsIsMutable();
          namedColumns_.add(index, value);
          onChanged();
        } else {
          namedColumnsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder addNamedColumns(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder builderForValue) {
        if (namedColumnsBuilder_ == null) {
          ensureNamedColumnsIsMutable();
          namedColumns_.add(builderForValue.build());
          onChanged();
        } else {
          namedColumnsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder addNamedColumns(
          int index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder builderForValue) {
        if (namedColumnsBuilder_ == null) {
          ensureNamedColumnsIsMutable();
          namedColumns_.add(index, builderForValue.build());
          onChanged();
        } else {
          namedColumnsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder addAllNamedColumns(
          java.lang.Iterable<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription> values) {
        if (namedColumnsBuilder_ == null) {
          ensureNamedColumnsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, namedColumns_);
          onChanged();
        } else {
          namedColumnsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder clearNamedColumns() {
        if (namedColumnsBuilder_ == null) {
          namedColumns_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          namedColumnsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public Builder removeNamedColumns(int index) {
        if (namedColumnsBuilder_ == null) {
          ensureNamedColumnsIsMutable();
          namedColumns_.remove(index);
          onChanged();
        } else {
          namedColumnsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder getNamedColumnsBuilder(
          int index) {
        return getNamedColumnsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder getNamedColumnsOrBuilder(
          int index) {
        if (namedColumnsBuilder_ == null) {
          return namedColumns_.get(index);  } else {
          return namedColumnsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public java.util.List<? extends com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder> 
           getNamedColumnsOrBuilderList() {
        if (namedColumnsBuilder_ != null) {
          return namedColumnsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(namedColumns_);
        }
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder addNamedColumnsBuilder() {
        return getNamedColumnsFieldBuilder().addBuilder(
            com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.getDefaultInstance());
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder addNamedColumnsBuilder(
          int index) {
        return getNamedColumnsFieldBuilder().addBuilder(
            index, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.getDefaultInstance());
      }
      /**
       * <code>repeated .com.palantir.atlasdb.protos.generated.NamedColumnDescription namedColumns = 1;</code>
       */
      public java.util.List<com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder> 
           getNamedColumnsBuilderList() {
        return getNamedColumnsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder> 
          getNamedColumnsFieldBuilder() {
        if (namedColumnsBuilder_ == null) {
          namedColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder>(
                  namedColumns_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          namedColumns_ = null;
        }
        return namedColumnsBuilder_;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription dynamicColumn_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder> dynamicColumnBuilder_;
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public boolean hasDynamicColumn() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription getDynamicColumn() {
        if (dynamicColumnBuilder_ == null) {
          return dynamicColumn_;
        } else {
          return dynamicColumnBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public Builder setDynamicColumn(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription value) {
        if (dynamicColumnBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dynamicColumn_ = value;
          onChanged();
        } else {
          dynamicColumnBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public Builder setDynamicColumn(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder builderForValue) {
        if (dynamicColumnBuilder_ == null) {
          dynamicColumn_ = builderForValue.build();
          onChanged();
        } else {
          dynamicColumnBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public Builder mergeDynamicColumn(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription value) {
        if (dynamicColumnBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              dynamicColumn_ != com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance()) {
            dynamicColumn_ =
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.newBuilder(dynamicColumn_).mergeFrom(value).buildPartial();
          } else {
            dynamicColumn_ = value;
          }
          onChanged();
        } else {
          dynamicColumnBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public Builder clearDynamicColumn() {
        if (dynamicColumnBuilder_ == null) {
          dynamicColumn_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance();
          onChanged();
        } else {
          dynamicColumnBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder getDynamicColumnBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getDynamicColumnFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder getDynamicColumnOrBuilder() {
        if (dynamicColumnBuilder_ != null) {
          return dynamicColumnBuilder_.getMessageOrBuilder();
        } else {
          return dynamicColumn_;
        }
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.DynamicColumnDescription dynamicColumn = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder> 
          getDynamicColumnFieldBuilder() {
        if (dynamicColumnBuilder_ == null) {
          dynamicColumnBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder>(
                  getDynamicColumn(),
                  getParentForChildren(),
                  isClean());
          dynamicColumn_ = null;
        }
        return dynamicColumnBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.ColumnMetadataDescription)
    }

    static {
      defaultInstance = new ColumnMetadataDescription(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.ColumnMetadataDescription)
  }

  public interface DynamicColumnDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.DynamicColumnDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
     */
    boolean hasColumnNameDesc();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getColumnNameDesc();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder getColumnNameDescOrBuilder();

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getValue();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder getValueOrBuilder();
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.DynamicColumnDescription}
   */
  public static final class DynamicColumnDescription extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.DynamicColumnDescription)
      DynamicColumnDescriptionOrBuilder {
    // Use DynamicColumnDescription.newBuilder() to construct.
    private DynamicColumnDescription(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DynamicColumnDescription(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DynamicColumnDescription defaultInstance;
    public static DynamicColumnDescription getDefaultInstance() {
      return defaultInstance;
    }

    public DynamicColumnDescription getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DynamicColumnDescription(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = columnNameDesc_.toBuilder();
              }
              columnNameDesc_ = input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(columnNameDesc_);
                columnNameDesc_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder.class);
    }

    public static com.google.protobuf.Parser<DynamicColumnDescription> PARSER =
        new com.google.protobuf.AbstractParser<DynamicColumnDescription>() {
      public DynamicColumnDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DynamicColumnDescription(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DynamicColumnDescription> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int COLUMNNAMEDESC_FIELD_NUMBER = 1;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription columnNameDesc_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
     */
    public boolean hasColumnNameDesc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getColumnNameDesc() {
      return columnNameDesc_;
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder getColumnNameDescOrBuilder() {
      return columnNameDesc_;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getValue() {
      return value_;
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder getValueOrBuilder() {
      return value_;
    }

    private void initFields() {
      columnNameDesc_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
      value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasColumnNameDesc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getColumnNameDesc().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getValue().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, columnNameDesc_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, value_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, columnNameDesc_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, value_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.DynamicColumnDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.DynamicColumnDescription)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getColumnNameDescFieldBuilder();
          getValueFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (columnNameDescBuilder_ == null) {
          columnNameDesc_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
        } else {
          columnNameDescBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (valueBuilder_ == null) {
          value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (columnNameDescBuilder_ == null) {
          result.columnNameDesc_ = columnNameDesc_;
        } else {
          result.columnNameDesc_ = columnNameDescBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription.getDefaultInstance()) return this;
        if (other.hasColumnNameDesc()) {
          mergeColumnNameDesc(other.getColumnNameDesc());
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasColumnNameDesc()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        if (!getColumnNameDesc().isInitialized()) {
          
          return false;
        }
        if (!getValue().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.DynamicColumnDescription) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription columnNameDesc_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder> columnNameDescBuilder_;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public boolean hasColumnNameDesc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription getColumnNameDesc() {
        if (columnNameDescBuilder_ == null) {
          return columnNameDesc_;
        } else {
          return columnNameDescBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public Builder setColumnNameDesc(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription value) {
        if (columnNameDescBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          columnNameDesc_ = value;
          onChanged();
        } else {
          columnNameDescBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public Builder setColumnNameDesc(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder builderForValue) {
        if (columnNameDescBuilder_ == null) {
          columnNameDesc_ = builderForValue.build();
          onChanged();
        } else {
          columnNameDescBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public Builder mergeColumnNameDesc(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription value) {
        if (columnNameDescBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              columnNameDesc_ != com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance()) {
            columnNameDesc_ =
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.newBuilder(columnNameDesc_).mergeFrom(value).buildPartial();
          } else {
            columnNameDesc_ = value;
          }
          onChanged();
        } else {
          columnNameDescBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public Builder clearColumnNameDesc() {
        if (columnNameDescBuilder_ == null) {
          columnNameDesc_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.getDefaultInstance();
          onChanged();
        } else {
          columnNameDescBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder getColumnNameDescBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getColumnNameDescFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder getColumnNameDescOrBuilder() {
        if (columnNameDescBuilder_ != null) {
          return columnNameDescBuilder_.getMessageOrBuilder();
        } else {
          return columnNameDesc_;
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.NameMetadataDescription columnNameDesc = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder> 
          getColumnNameDescFieldBuilder() {
        if (columnNameDescBuilder_ == null) {
          columnNameDescBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NameMetadataDescriptionOrBuilder>(
                  getColumnNameDesc(),
                  getParentForChildren(),
                  isClean());
          columnNameDesc_ = null;
        }
        return columnNameDescBuilder_;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder> valueBuilder_;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getValue() {
        if (valueBuilder_ == null) {
          return value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public Builder setValue(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public Builder setValue(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public Builder mergeValue(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              value_ != com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance()) {
            value_ =
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
          onChanged();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder getValueBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_;
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.DynamicColumnDescription)
    }

    static {
      defaultInstance = new DynamicColumnDescription(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.DynamicColumnDescription)
  }

  public interface NamedColumnDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.NamedColumnDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string shortName = 1;</code>
     */
    boolean hasShortName();
    /**
     * <code>required string shortName = 1;</code>
     */
    java.lang.String getShortName();
    /**
     * <code>required string shortName = 1;</code>
     */
    com.google.protobuf.ByteString
        getShortNameBytes();

    /**
     * <code>required string longName = 2;</code>
     */
    boolean hasLongName();
    /**
     * <code>required string longName = 2;</code>
     */
    java.lang.String getLongName();
    /**
     * <code>required string longName = 2;</code>
     */
    com.google.protobuf.ByteString
        getLongNameBytes();

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
     */
    boolean hasValue();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getValue();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder getValueOrBuilder();
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.NamedColumnDescription}
   */
  public static final class NamedColumnDescription extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.NamedColumnDescription)
      NamedColumnDescriptionOrBuilder {
    // Use NamedColumnDescription.newBuilder() to construct.
    private NamedColumnDescription(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NamedColumnDescription(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NamedColumnDescription defaultInstance;
    public static NamedColumnDescription getDefaultInstance() {
      return defaultInstance;
    }

    public NamedColumnDescription getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NamedColumnDescription(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              shortName_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              longName_ = bs;
              break;
            }
            case 26: {
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder.class);
    }

    public static com.google.protobuf.Parser<NamedColumnDescription> PARSER =
        new com.google.protobuf.AbstractParser<NamedColumnDescription>() {
      public NamedColumnDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NamedColumnDescription(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NamedColumnDescription> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SHORTNAME_FIELD_NUMBER = 1;
    private java.lang.Object shortName_;
    /**
     * <code>required string shortName = 1;</code>
     */
    public boolean hasShortName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string shortName = 1;</code>
     */
    public java.lang.String getShortName() {
      java.lang.Object ref = shortName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          shortName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string shortName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getShortNameBytes() {
      java.lang.Object ref = shortName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shortName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LONGNAME_FIELD_NUMBER = 2;
    private java.lang.Object longName_;
    /**
     * <code>required string longName = 2;</code>
     */
    public boolean hasLongName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string longName = 2;</code>
     */
    public java.lang.String getLongName() {
      java.lang.Object ref = longName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          longName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string longName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLongNameBytes() {
      java.lang.Object ref = longName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        longName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 3;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getValue() {
      return value_;
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder getValueOrBuilder() {
      return value_;
    }

    private void initFields() {
      shortName_ = "";
      longName_ = "";
      value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasShortName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLongName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getValue().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getShortNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLongNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, value_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getShortNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLongNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, value_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.NamedColumnDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.NamedColumnDescription)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getValueFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        shortName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        longName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (valueBuilder_ == null) {
          value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.shortName_ = shortName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.longName_ = longName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription.getDefaultInstance()) return this;
        if (other.hasShortName()) {
          bitField0_ |= 0x00000001;
          shortName_ = other.shortName_;
          onChanged();
        }
        if (other.hasLongName()) {
          bitField0_ |= 0x00000002;
          longName_ = other.longName_;
          onChanged();
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasShortName()) {
          
          return false;
        }
        if (!hasLongName()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        if (!getValue().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.NamedColumnDescription) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object shortName_ = "";
      /**
       * <code>required string shortName = 1;</code>
       */
      public boolean hasShortName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string shortName = 1;</code>
       */
      public java.lang.String getShortName() {
        java.lang.Object ref = shortName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            shortName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string shortName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getShortNameBytes() {
        java.lang.Object ref = shortName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          shortName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string shortName = 1;</code>
       */
      public Builder setShortName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        shortName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string shortName = 1;</code>
       */
      public Builder clearShortName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        shortName_ = getDefaultInstance().getShortName();
        onChanged();
        return this;
      }
      /**
       * <code>required string shortName = 1;</code>
       */
      public Builder setShortNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        shortName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object longName_ = "";
      /**
       * <code>required string longName = 2;</code>
       */
      public boolean hasLongName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string longName = 2;</code>
       */
      public java.lang.String getLongName() {
        java.lang.Object ref = longName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            longName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string longName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLongNameBytes() {
        java.lang.Object ref = longName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          longName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string longName = 2;</code>
       */
      public Builder setLongName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        longName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string longName = 2;</code>
       */
      public Builder clearLongName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        longName_ = getDefaultInstance().getLongName();
        onChanged();
        return this;
      }
      /**
       * <code>required string longName = 2;</code>
       */
      public Builder setLongNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        longName_ = value;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder> valueBuilder_;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getValue() {
        if (valueBuilder_ == null) {
          return value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public Builder setValue(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public Builder setValue(
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public Builder mergeValue(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              value_ != com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance()) {
            value_ =
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
          onChanged();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder getValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_;
        }
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ColumnValueDescription value = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.NamedColumnDescription)
    }

    static {
      defaultInstance = new NamedColumnDescription(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.NamedColumnDescription)
  }

  public interface ColumnValueDescriptionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.atlasdb.protos.generated.ColumnValueDescription)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType getType();

    /**
     * <code>optional string className = 2;</code>
     */
    boolean hasClassName();
    /**
     * <code>optional string className = 2;</code>
     */
    java.lang.String getClassName();
    /**
     * <code>optional string className = 2;</code>
     */
    com.google.protobuf.ByteString
        getClassNameBytes();

    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
     */
    boolean hasCompression();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression getCompression();

    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
     */
    boolean hasFormat();
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
     */
    com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat getFormat();

    /**
     * <code>optional string canonicalClassName = 5;</code>
     */
    boolean hasCanonicalClassName();
    /**
     * <code>optional string canonicalClassName = 5;</code>
     */
    java.lang.String getCanonicalClassName();
    /**
     * <code>optional string canonicalClassName = 5;</code>
     */
    com.google.protobuf.ByteString
        getCanonicalClassNameBytes();

    /**
     * <code>optional bytes protoFileDescriptor = 6;</code>
     *
     * <pre>
     * This is the proto descriptor so we can render the message without the compiled proto files.
     * </pre>
     */
    boolean hasProtoFileDescriptor();
    /**
     * <code>optional bytes protoFileDescriptor = 6;</code>
     *
     * <pre>
     * This is the proto descriptor so we can render the message without the compiled proto files.
     * </pre>
     */
    com.google.protobuf.ByteString getProtoFileDescriptor();

    /**
     * <code>optional string protoMessageName = 7;</code>
     *
     * <pre>
     * This protoName is the name of the message in the protoFileDescriptor.
     * </pre>
     */
    boolean hasProtoMessageName();
    /**
     * <code>optional string protoMessageName = 7;</code>
     *
     * <pre>
     * This protoName is the name of the message in the protoFileDescriptor.
     * </pre>
     */
    java.lang.String getProtoMessageName();
    /**
     * <code>optional string protoMessageName = 7;</code>
     *
     * <pre>
     * This protoName is the name of the message in the protoFileDescriptor.
     * </pre>
     */
    com.google.protobuf.ByteString
        getProtoMessageNameBytes();
  }
  /**
   * Protobuf type {@code com.palantir.atlasdb.protos.generated.ColumnValueDescription}
   */
  public static final class ColumnValueDescription extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.atlasdb.protos.generated.ColumnValueDescription)
      ColumnValueDescriptionOrBuilder {
    // Use ColumnValueDescription.newBuilder() to construct.
    private ColumnValueDescription(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ColumnValueDescription(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ColumnValueDescription defaultInstance;
    public static ColumnValueDescription getDefaultInstance() {
      return defaultInstance;
    }

    public ColumnValueDescription getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ColumnValueDescription(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              className_ = bs;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                compression_ = value;
              }
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat value = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                format_ = value;
              }
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              canonicalClassName_ = bs;
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              protoFileDescriptor_ = input.readBytes();
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              protoMessageName_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder.class);
    }

    public static com.google.protobuf.Parser<ColumnValueDescription> PARSER =
        new com.google.protobuf.AbstractParser<ColumnValueDescription>() {
      public ColumnValueDescription parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ColumnValueDescription(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ColumnValueDescription> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType type_;
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType getType() {
      return type_;
    }

    public static final int CLASSNAME_FIELD_NUMBER = 2;
    private java.lang.Object className_;
    /**
     * <code>optional string className = 2;</code>
     */
    public boolean hasClassName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string className = 2;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          className_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string className = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COMPRESSION_FIELD_NUMBER = 3;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression compression_;
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
     */
    public boolean hasCompression() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression getCompression() {
      return compression_;
    }

    public static final int FORMAT_FIELD_NUMBER = 4;
    private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat format_;
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
     */
    public boolean hasFormat() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
     */
    public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat getFormat() {
      return format_;
    }

    public static final int CANONICALCLASSNAME_FIELD_NUMBER = 5;
    private java.lang.Object canonicalClassName_;
    /**
     * <code>optional string canonicalClassName = 5;</code>
     */
    public boolean hasCanonicalClassName() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string canonicalClassName = 5;</code>
     */
    public java.lang.String getCanonicalClassName() {
      java.lang.Object ref = canonicalClassName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          canonicalClassName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string canonicalClassName = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCanonicalClassNameBytes() {
      java.lang.Object ref = canonicalClassName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        canonicalClassName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PROTOFILEDESCRIPTOR_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString protoFileDescriptor_;
    /**
     * <code>optional bytes protoFileDescriptor = 6;</code>
     *
     * <pre>
     * This is the proto descriptor so we can render the message without the compiled proto files.
     * </pre>
     */
    public boolean hasProtoFileDescriptor() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional bytes protoFileDescriptor = 6;</code>
     *
     * <pre>
     * This is the proto descriptor so we can render the message without the compiled proto files.
     * </pre>
     */
    public com.google.protobuf.ByteString getProtoFileDescriptor() {
      return protoFileDescriptor_;
    }

    public static final int PROTOMESSAGENAME_FIELD_NUMBER = 7;
    private java.lang.Object protoMessageName_;
    /**
     * <code>optional string protoMessageName = 7;</code>
     *
     * <pre>
     * This protoName is the name of the message in the protoFileDescriptor.
     * </pre>
     */
    public boolean hasProtoMessageName() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional string protoMessageName = 7;</code>
     *
     * <pre>
     * This protoName is the name of the message in the protoFileDescriptor.
     * </pre>
     */
    public java.lang.String getProtoMessageName() {
      java.lang.Object ref = protoMessageName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          protoMessageName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string protoMessageName = 7;</code>
     *
     * <pre>
     * This protoName is the name of the message in the protoFileDescriptor.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getProtoMessageNameBytes() {
      java.lang.Object ref = protoMessageName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        protoMessageName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
      className_ = "";
      compression_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression.NONE;
      format_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat.PROTO;
      canonicalClassName_ = "";
      protoFileDescriptor_ = com.google.protobuf.ByteString.EMPTY;
      protoMessageName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getClassNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, compression_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, format_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getCanonicalClassNameBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeBytes(6, protoFileDescriptor_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeBytes(7, getProtoMessageNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getClassNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, compression_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, format_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getCanonicalClassNameBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, protoFileDescriptor_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getProtoMessageNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.atlasdb.protos.generated.ColumnValueDescription}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.atlasdb.protos.generated.ColumnValueDescription)
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescriptionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.class, com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.Builder.class);
      }

      // Construct using com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
        bitField0_ = (bitField0_ & ~0x00000001);
        className_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        compression_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression.NONE;
        bitField0_ = (bitField0_ & ~0x00000004);
        format_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat.PROTO;
        bitField0_ = (bitField0_ & ~0x00000008);
        canonicalClassName_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        protoFileDescriptor_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        protoMessageName_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_descriptor;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription getDefaultInstanceForType() {
        return com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance();
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription build() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription buildPartial() {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription result = new com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.className_ = className_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.compression_ = compression_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.format_ = format_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.canonicalClassName_ = canonicalClassName_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.protoFileDescriptor_ = protoFileDescriptor_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.protoMessageName_ = protoMessageName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription) {
          return mergeFrom((com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription other) {
        if (other == com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasClassName()) {
          bitField0_ |= 0x00000002;
          className_ = other.className_;
          onChanged();
        }
        if (other.hasCompression()) {
          setCompression(other.getCompression());
        }
        if (other.hasFormat()) {
          setFormat(other.getFormat());
        }
        if (other.hasCanonicalClassName()) {
          bitField0_ |= 0x00000010;
          canonicalClassName_ = other.canonicalClassName_;
          onChanged();
        }
        if (other.hasProtoFileDescriptor()) {
          setProtoFileDescriptor(other.getProtoFileDescriptor());
        }
        if (other.hasProtoMessageName()) {
          bitField0_ |= 0x00000040;
          protoMessageName_ = other.protoMessageName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueDescription) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType getType() {
        return type_;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
       */
      public Builder setType(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .com.palantir.atlasdb.protos.generated.ValueType type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ValueType.VAR_LONG;
        onChanged();
        return this;
      }

      private java.lang.Object className_ = "";
      /**
       * <code>optional string className = 2;</code>
       */
      public boolean hasClassName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string className = 2;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            className_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string className = 2;</code>
       */
      public com.google.protobuf.ByteString
          getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string className = 2;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        className_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string className = 2;</code>
       */
      public Builder clearClassName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string className = 2;</code>
       */
      public Builder setClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        className_ = value;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression compression_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression.NONE;
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
       */
      public boolean hasCompression() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression getCompression() {
        return compression_;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
       */
      public Builder setCompression(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        compression_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.Compression compression = 3 [default = NONE];</code>
       */
      public Builder clearCompression() {
        bitField0_ = (bitField0_ & ~0x00000004);
        compression_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.Compression.NONE;
        onChanged();
        return this;
      }

      private com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat format_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat.PROTO;
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
       */
      public boolean hasFormat() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
       */
      public com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat getFormat() {
        return format_;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
       */
      public Builder setFormat(com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        format_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.palantir.atlasdb.protos.generated.ColumnValueFormat format = 4;</code>
       */
      public Builder clearFormat() {
        bitField0_ = (bitField0_ & ~0x00000008);
        format_ = com.palantir.atlasdb.protos.generated.TableMetadataPersistence.ColumnValueFormat.PROTO;
        onChanged();
        return this;
      }

      private java.lang.Object canonicalClassName_ = "";
      /**
       * <code>optional string canonicalClassName = 5;</code>
       */
      public boolean hasCanonicalClassName() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string canonicalClassName = 5;</code>
       */
      public java.lang.String getCanonicalClassName() {
        java.lang.Object ref = canonicalClassName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            canonicalClassName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string canonicalClassName = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCanonicalClassNameBytes() {
        java.lang.Object ref = canonicalClassName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          canonicalClassName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string canonicalClassName = 5;</code>
       */
      public Builder setCanonicalClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        canonicalClassName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string canonicalClassName = 5;</code>
       */
      public Builder clearCanonicalClassName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        canonicalClassName_ = getDefaultInstance().getCanonicalClassName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string canonicalClassName = 5;</code>
       */
      public Builder setCanonicalClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        canonicalClassName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString protoFileDescriptor_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes protoFileDescriptor = 6;</code>
       *
       * <pre>
       * This is the proto descriptor so we can render the message without the compiled proto files.
       * </pre>
       */
      public boolean hasProtoFileDescriptor() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional bytes protoFileDescriptor = 6;</code>
       *
       * <pre>
       * This is the proto descriptor so we can render the message without the compiled proto files.
       * </pre>
       */
      public com.google.protobuf.ByteString getProtoFileDescriptor() {
        return protoFileDescriptor_;
      }
      /**
       * <code>optional bytes protoFileDescriptor = 6;</code>
       *
       * <pre>
       * This is the proto descriptor so we can render the message without the compiled proto files.
       * </pre>
       */
      public Builder setProtoFileDescriptor(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        protoFileDescriptor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes protoFileDescriptor = 6;</code>
       *
       * <pre>
       * This is the proto descriptor so we can render the message without the compiled proto files.
       * </pre>
       */
      public Builder clearProtoFileDescriptor() {
        bitField0_ = (bitField0_ & ~0x00000020);
        protoFileDescriptor_ = getDefaultInstance().getProtoFileDescriptor();
        onChanged();
        return this;
      }

      private java.lang.Object protoMessageName_ = "";
      /**
       * <code>optional string protoMessageName = 7;</code>
       *
       * <pre>
       * This protoName is the name of the message in the protoFileDescriptor.
       * </pre>
       */
      public boolean hasProtoMessageName() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional string protoMessageName = 7;</code>
       *
       * <pre>
       * This protoName is the name of the message in the protoFileDescriptor.
       * </pre>
       */
      public java.lang.String getProtoMessageName() {
        java.lang.Object ref = protoMessageName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            protoMessageName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string protoMessageName = 7;</code>
       *
       * <pre>
       * This protoName is the name of the message in the protoFileDescriptor.
       * </pre>
       */
      public com.google.protobuf.ByteString
          getProtoMessageNameBytes() {
        java.lang.Object ref = protoMessageName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          protoMessageName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string protoMessageName = 7;</code>
       *
       * <pre>
       * This protoName is the name of the message in the protoFileDescriptor.
       * </pre>
       */
      public Builder setProtoMessageName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        protoMessageName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string protoMessageName = 7;</code>
       *
       * <pre>
       * This protoName is the name of the message in the protoFileDescriptor.
       * </pre>
       */
      public Builder clearProtoMessageName() {
        bitField0_ = (bitField0_ & ~0x00000040);
        protoMessageName_ = getDefaultInstance().getProtoMessageName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string protoMessageName = 7;</code>
       *
       * <pre>
       * This protoName is the name of the message in the protoFileDescriptor.
       * </pre>
       */
      public Builder setProtoMessageNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        protoMessageName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.atlasdb.protos.generated.ColumnValueDescription)
    }

    static {
      defaultInstance = new ColumnValueDescription(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.atlasdb.protos.generated.ColumnValueDescription)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:com/palantir/atlasdb/protos/TableMetad" +
      "ataPersistence.proto\022%com.palantir.atlasdb" +
      "db.protos.generated\"\313\004\n\rTableMetadata\022O\n" +
      "\007rowName\030\001 \002(\0132>.com.palantir.atlasdb.pr" +
      "otos.generated.NameMetadataDescription\022Q" +
      "\n\007columns\030\002 \002(\0132@.com.palantir.atlasdb.p" +
      "rotos.generated.ColumnMetadataDescriptio" +
      "n\022T\n\017conflictHandler\030\003 \002(\0162;.com.palanti" +
      "r.atlasdb.protos.generated.TableConflict" +
      "Handler\022K\n\rcachePriority\030\004 \001(\01624.com.pal",
      "antir.atlasdb.protos.generated.CachePrio" +
      "rity\022S\n\021partitionStrategy\030\005 \001(\01628.com.pa" +
      "lantir.atlasdb.protos.generated.Partitio" +
      "nStrategy\022\030\n\020rangeScanAllowed\030\006 \001(\010\022\036\n\026d" +
      "bCompressionRequested\030\007 \001(\010\022\027\n\017negativeL" +
      "ookups\030\010 \001(\010\022K\n\rsweepStrategy\030\t \001(\01624.co" +
      "m.palantir.atlasdb.protos.generated.Swee" +
      "pStrategy\"m\n\027NameMetadataDescription\022R\n\t" +
      "nameParts\030\001 \003(\0132?.com.palantir.atlasdb.p" +
      "rotos.generated.NameComponentDescription",
      "\"\361\001\n\030NameComponentDescription\022\025\n\rcompone" +
      "ntName\030\001 \002(\t\022>\n\004type\030\002 \002(\01620.com.palanti" +
      "r.atlasdb.protos.generated.ValueType\022D\n\005" +
      "order\030\003 \002(\01625.com.palantir.atlasdb.proto" +
      "s.generated.ValueByteOrder\022\035\n\025hasUniform" +
      "Partitioner\030\004 \001(\010\022\031\n\021explicitParitions\030\005" +
      " \003(\t\"\310\001\n\031ColumnMetadataDescription\022S\n\014na" +
      "medColumns\030\001 \003(\0132=.com.palantir.atlasdb." +
      "protos.generated.NamedColumnDescription\022" +
      "V\n\rdynamicColumn\030\002 \001(\0132?.com.palantir.at",
      "lasdb.protos.generated.DynamicColumnDesc" +
      "ription\"\300\001\n\030DynamicColumnDescription\022V\n\016" +
      "columnNameDesc\030\001 \002(\0132>.com.palantir.atla" +
      "sdb.protos.generated.NameMetadataDescrip" +
      "tion\022L\n\005value\030\002 \002(\0132=.com.palantir.atlasdb" +
      "db.protos.generated.ColumnValueDescripti" +
      "on\"\213\001\n\026NamedColumnDescription\022\021\n\tshortNa" +
      "me\030\001 \002(\t\022\020\n\010longName\030\002 \002(\t\022L\n\005value\030\003 \002(" +
      "\0132=.com.palantir.atlasdb.protos.generate" +
      "d.ColumnValueDescription\"\327\002\n\026ColumnValue",
      "Description\022>\n\004type\030\001 \002(\01620.com.palantir" +
      ".atlasdb.protos.generated.ValueType\022\021\n\tc" +
      "lassName\030\002 \001(\t\022M\n\013compression\030\003 \001(\01622.co" +
      "m.palantir.atlasdb.protos.generated.Comp" +
      "ression:\004NONE\022H\n\006format\030\004 \001(\01628.com.pala" +
      "ntir.atlasdb.protos.generated.ColumnValu" +
      "eFormat\022\032\n\022canonicalClassName\030\005 \001(\t\022\033\n\023p" +
      "rotoFileDescriptor\030\006 \001(\014\022\030\n\020protoMessage" +
      "Name\030\007 \001(\t*\273\001\n\tValueType\022\014\n\010VAR_LONG\020\001\022\016" +
      "\n\nFIXED_LONG\020\002\022\n\n\006STRING\020\003\022\010\n\004BLOB\020\004\022\023\n\017",
      "VAR_SIGNED_LONG\020\005\022\034\n\030FIXED_LONG_LITTLE_E" +
      "NDIAN\020\006\022\016\n\nSHA256HASH\020\007\022\016\n\nVAR_STRING\020\010\022" +
      "\027\n\023NULLABLE_FIXED_LONG\020\t\022\016\n\nSIZED_BLOB\020\n" +
      "*#\n\013Compression\022\010\n\004NONE\020\001\022\n\n\006SNAPPY\020\002*?\n" +
      "\021ColumnValueFormat\022\t\n\005PROTO\020\001\022\017\n\013PERSIST" +
      "ABLE\020\002\022\016\n\nVALUE_TYPE\020\003*/\n\016ValueByteOrder" +
      "\022\r\n\tASCENDING\020\001\022\016\n\nDESCENDING\020\002*\215\001\n\024Tabl" +
      "eConflictHandler\022\016\n\nIGNORE_ALL\020\001\022\030\n\024RETR" +
      "Y_ON_WRITE_WRITE\020\002\022\032\n\026RETRY_ON_VALUE_CHA" +
      "NGED\020\003\022\020\n\014SERIALIZABLE\020\004\022\035\n\031RETRY_ON_WRI",
      "TE_WRITE_CELL\020\005*F\n\rCachePriority\022\013\n\007COLD" +
      "EST\020\000\022\010\n\004COLD\020 \022\010\n\004WARM\020@\022\007\n\003HOT\020`\022\013\n\007HO" +
      "TTEST\020\177**\n\021PartitionStrategy\022\013\n\007ORDERED\020" +
      "\000\022\010\n\004HASH\020\001*<\n\rSweepStrategy\022\013\n\007NOTHING\020" +
      "\000\022\020\n\014CONSERVATIVE\020\001\022\014\n\010THOROUGH\020\002*;\n\022Exp" +
      "irationStrategy\022\t\n\005NEVER\020\000\022\032\n\026INDIVIDUAL" +
      "LY_SPECIFIED\020\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_TableMetadata_descriptor,
        new java.lang.String[] { "RowName", "Columns", "ConflictHandler", "CachePriority", "PartitionStrategy", "RangeScanAllowed", "DbCompressionRequested", "NegativeLookups", "SweepStrategy", });
    internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_NameMetadataDescription_descriptor,
        new java.lang.String[] { "NameParts", });
    internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_NameComponentDescription_descriptor,
        new java.lang.String[] { "ComponentName", "Type", "Order", "HasUniformPartitioner", "ExplicitParitions", });
    internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_ColumnMetadataDescription_descriptor,
        new java.lang.String[] { "NamedColumns", "DynamicColumn", });
    internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_DynamicColumnDescription_descriptor,
        new java.lang.String[] { "ColumnNameDesc", "Value", });
    internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_NamedColumnDescription_descriptor,
        new java.lang.String[] { "ShortName", "LongName", "Value", });
    internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_atlasdb_protos_generated_ColumnValueDescription_descriptor,
        new java.lang.String[] { "Type", "ClassName", "Compression", "Format", "CanonicalClassName", "ProtoFileDescriptor", "ProtoMessageName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
