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
package com.palantir.paxos.persistence.generated;

public final class PaxosPersistence {
  private PaxosPersistence() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PaxosHeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.paxos.persistence.generated.PaxosHeader)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes checksum = 1;</code>
     */
    boolean hasChecksum();
    /**
     * <code>required bytes checksum = 1;</code>
     */
    com.google.protobuf.ByteString getChecksum();
  }
  /**
   * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosHeader}
   */
  public static final class PaxosHeader extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.paxos.persistence.generated.PaxosHeader)
      PaxosHeaderOrBuilder {
    // Use PaxosHeader.newBuilder() to construct.
    private PaxosHeader(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PaxosHeader(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PaxosHeader defaultInstance;
    public static PaxosHeader getDefaultInstance() {
      return defaultInstance;
    }

    @Override public PaxosHeader getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PaxosHeader(
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
              bitField0_ |= 0x00000001;
              checksum_ = input.readBytes();
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
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_descriptor;
    }

    @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.Builder.class);
    }

    public static com.google.protobuf.Parser<PaxosHeader> PARSER =
        new com.google.protobuf.AbstractParser<PaxosHeader>() {
      @Override
    public PaxosHeader parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaxosHeader(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PaxosHeader> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CHECKSUM_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString checksum_;
    /**
     * <code>required bytes checksum = 1;</code>
     */
    @Override
    public boolean hasChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bytes checksum = 1;</code>
     */
    @Override
    public com.google.protobuf.ByteString getChecksum() {
      return checksum_;
    }

    private void initFields() {
      checksum_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    @Override public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
    }
      if (isInitialized == 0) {
        return false;
    }

      if (!hasChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, checksum_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    @Override public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) {
        return size;
    }

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, checksum_);
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

    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    @Override public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    @Override public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosHeader}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.paxos.persistence.generated.PaxosHeader)
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_descriptor;
      }

      @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.Builder.class);
      }

      // Construct using com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.newBuilder()
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

      @Override public Builder clear() {
        super.clear();
        checksum_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_descriptor;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader getDefaultInstanceForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.getDefaultInstance();
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader build() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader buildPartial() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader result = new com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.checksum_ = checksum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader) {
          return mergeFrom((com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader other) {
        if (other == com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader.getDefaultInstance()) {
            return this;
        }
        if (other.hasChecksum()) {
          setChecksum(other.getChecksum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override public final boolean isInitialized() {
        if (!hasChecksum()) {

          return false;
        }
        return true;
      }

      @Override public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosHeader) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString checksum_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes checksum = 1;</code>
       */
      @Override
    public boolean hasChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bytes checksum = 1;</code>
       */
      @Override
    public com.google.protobuf.ByteString getChecksum() {
        return checksum_;
      }
      /**
       * <code>required bytes checksum = 1;</code>
       */
      public Builder setChecksum(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        checksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes checksum = 1;</code>
       */
      public Builder clearChecksum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        checksum_ = getDefaultInstance().getChecksum();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.paxos.persistence.generated.PaxosHeader)
    }

    static {
      defaultInstance = new PaxosHeader(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.paxos.persistence.generated.PaxosHeader)
  }

  public interface PaxosValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.paxos.persistence.generated.PaxosValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes bytes = 1;</code>
     */
    boolean hasBytes();
    /**
     * <code>optional bytes bytes = 1;</code>
     */
    com.google.protobuf.ByteString getBytes();

    /**
     * <code>optional int64 seq = 2;</code>
     */
    boolean hasSeq();
    /**
     * <code>optional int64 seq = 2;</code>
     */
    long getSeq();

    /**
     * <code>optional string leaderUUID = 3;</code>
     */
    boolean hasLeaderUUID();
    /**
     * <code>optional string leaderUUID = 3;</code>
     */
    java.lang.String getLeaderUUID();
    /**
     * <code>optional string leaderUUID = 3;</code>
     */
    com.google.protobuf.ByteString
        getLeaderUUIDBytes();
  }
  /**
   * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosValue}
   */
  public static final class PaxosValue extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.paxos.persistence.generated.PaxosValue)
      PaxosValueOrBuilder {
    // Use PaxosValue.newBuilder() to construct.
    private PaxosValue(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PaxosValue(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PaxosValue defaultInstance;
    public static PaxosValue getDefaultInstance() {
      return defaultInstance;
    }

    @Override public PaxosValue getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PaxosValue(
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
              bitField0_ |= 0x00000001;
              bytes_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              seq_ = input.readInt64();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              leaderUUID_ = bs;
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
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosValue_descriptor;
    }

    @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder.class);
    }

    public static com.google.protobuf.Parser<PaxosValue> PARSER =
        new com.google.protobuf.AbstractParser<PaxosValue>() {
      @Override
    public PaxosValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaxosValue(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PaxosValue> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BYTES_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString bytes_;
    /**
     * <code>optional bytes bytes = 1;</code>
     */
    @Override
    public boolean hasBytes() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes bytes = 1;</code>
     */
    @Override
    public com.google.protobuf.ByteString getBytes() {
      return bytes_;
    }

    public static final int SEQ_FIELD_NUMBER = 2;
    private long seq_;
    /**
     * <code>optional int64 seq = 2;</code>
     */
    @Override
    public boolean hasSeq() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 seq = 2;</code>
     */
    @Override
    public long getSeq() {
      return seq_;
    }

    public static final int LEADERUUID_FIELD_NUMBER = 3;
    private java.lang.Object leaderUUID_;
    /**
     * <code>optional string leaderUUID = 3;</code>
     */
    @Override
    public boolean hasLeaderUUID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string leaderUUID = 3;</code>
     */
    @Override
    public java.lang.String getLeaderUUID() {
      java.lang.Object ref = leaderUUID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          leaderUUID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string leaderUUID = 3;</code>
     */
    @Override
    public com.google.protobuf.ByteString
        getLeaderUUIDBytes() {
      java.lang.Object ref = leaderUUID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leaderUUID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      bytes_ = com.google.protobuf.ByteString.EMPTY;
      seq_ = 0L;
      leaderUUID_ = "";
    }
    private byte memoizedIsInitialized = -1;
    @Override public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
    }
      if (isInitialized == 0) {
        return false;
    }

      memoizedIsInitialized = 1;
      return true;
    }

    @Override public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, bytes_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, seq_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLeaderUUIDBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    @Override public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) {
        return size;
    }

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, bytes_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, seq_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLeaderUUIDBytes());
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

    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    @Override public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    @Override public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.paxos.persistence.generated.PaxosValue)
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosValue_descriptor;
      }

      @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder.class);
      }

      // Construct using com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.newBuilder()
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

      @Override public Builder clear() {
        super.clear();
        bytes_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        seq_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        leaderUUID_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosValue_descriptor;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue getDefaultInstanceForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance();
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue build() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue buildPartial() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue result = new com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.bytes_ = bytes_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seq_ = seq_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.leaderUUID_ = leaderUUID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue) {
          return mergeFrom((com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue other) {
        if (other == com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance()) {
            return this;
        }
        if (other.hasBytes()) {
          setBytes(other.getBytes());
        }
        if (other.hasSeq()) {
          setSeq(other.getSeq());
        }
        if (other.hasLeaderUUID()) {
          bitField0_ |= 0x00000004;
          leaderUUID_ = other.leaderUUID_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override public final boolean isInitialized() {
        return true;
      }

      @Override public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString bytes_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes bytes = 1;</code>
       */
      @Override
    public boolean hasBytes() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes bytes = 1;</code>
       */
      @Override
    public com.google.protobuf.ByteString getBytes() {
        return bytes_;
      }
      /**
       * <code>optional bytes bytes = 1;</code>
       */
      public Builder setBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        bytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes bytes = 1;</code>
       */
      public Builder clearBytes() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bytes_ = getDefaultInstance().getBytes();
        onChanged();
        return this;
      }

      private long seq_ ;
      /**
       * <code>optional int64 seq = 2;</code>
       */
      @Override
    public boolean hasSeq() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 seq = 2;</code>
       */
      @Override
    public long getSeq() {
        return seq_;
      }
      /**
       * <code>optional int64 seq = 2;</code>
       */
      public Builder setSeq(long value) {
        bitField0_ |= 0x00000002;
        seq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 seq = 2;</code>
       */
      public Builder clearSeq() {
        bitField0_ = (bitField0_ & ~0x00000002);
        seq_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object leaderUUID_ = "";
      /**
       * <code>optional string leaderUUID = 3;</code>
       */
      @Override
    public boolean hasLeaderUUID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string leaderUUID = 3;</code>
       */
      @Override
    public java.lang.String getLeaderUUID() {
        java.lang.Object ref = leaderUUID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            leaderUUID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string leaderUUID = 3;</code>
       */
      @Override
    public com.google.protobuf.ByteString
          getLeaderUUIDBytes() {
        java.lang.Object ref = leaderUUID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          leaderUUID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string leaderUUID = 3;</code>
       */
      public Builder setLeaderUUID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        leaderUUID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string leaderUUID = 3;</code>
       */
      public Builder clearLeaderUUID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        leaderUUID_ = getDefaultInstance().getLeaderUUID();
        onChanged();
        return this;
      }
      /**
       * <code>optional string leaderUUID = 3;</code>
       */
      public Builder setLeaderUUIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        leaderUUID_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.paxos.persistence.generated.PaxosValue)
    }

    static {
      defaultInstance = new PaxosValue(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.paxos.persistence.generated.PaxosValue)
  }

  public interface PaxosAcceptorStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.paxos.persistence.generated.PaxosAcceptorState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
     */
    boolean hasLastPromisedId();
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
     */
    com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getLastPromisedId();
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
     */
    com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder getLastPromisedIdOrBuilder();

    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
     */
    boolean hasLastAcceptedId();
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
     */
    com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getLastAcceptedId();
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
     */
    com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder getLastAcceptedIdOrBuilder();

    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
     */
    boolean hasLastAcceptedValue();
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
     */
    com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue getLastAcceptedValue();
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
     */
    com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder getLastAcceptedValueOrBuilder();
  }
  /**
   * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosAcceptorState}
   */
  public static final class PaxosAcceptorState extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.paxos.persistence.generated.PaxosAcceptorState)
      PaxosAcceptorStateOrBuilder {
    // Use PaxosAcceptorState.newBuilder() to construct.
    private PaxosAcceptorState(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PaxosAcceptorState(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PaxosAcceptorState defaultInstance;
    public static PaxosAcceptorState getDefaultInstance() {
      return defaultInstance;
    }

    @Override public PaxosAcceptorState getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PaxosAcceptorState(
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
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = lastPromisedId_.toBuilder();
              }
              lastPromisedId_ = input.readMessage(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lastPromisedId_);
                lastPromisedId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = lastAcceptedId_.toBuilder();
              }
              lastAcceptedId_ = input.readMessage(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lastAcceptedId_);
                lastAcceptedId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = lastAcceptedValue_.toBuilder();
              }
              lastAcceptedValue_ = input.readMessage(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lastAcceptedValue_);
                lastAcceptedValue_ = subBuilder.buildPartial();
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
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_descriptor;
    }

    @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.Builder.class);
    }

    public static com.google.protobuf.Parser<PaxosAcceptorState> PARSER =
        new com.google.protobuf.AbstractParser<PaxosAcceptorState>() {
      @Override
    public PaxosAcceptorState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaxosAcceptorState(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PaxosAcceptorState> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LASTPROMISEDID_FIELD_NUMBER = 1;
    private com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId lastPromisedId_;
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
     */
    @Override
    public boolean hasLastPromisedId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
     */
    @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getLastPromisedId() {
      return lastPromisedId_;
    }
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
     */
    @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder getLastPromisedIdOrBuilder() {
      return lastPromisedId_;
    }

    public static final int LASTACCEPTEDID_FIELD_NUMBER = 2;
    private com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId lastAcceptedId_;
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
     */
    @Override
    public boolean hasLastAcceptedId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
     */
    @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getLastAcceptedId() {
      return lastAcceptedId_;
    }
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
     */
    @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder getLastAcceptedIdOrBuilder() {
      return lastAcceptedId_;
    }

    public static final int LASTACCEPTEDVALUE_FIELD_NUMBER = 3;
    private com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue lastAcceptedValue_;
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
     */
    @Override
    public boolean hasLastAcceptedValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
     */
    @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue getLastAcceptedValue() {
      return lastAcceptedValue_;
    }
    /**
     * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
     */
    @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder getLastAcceptedValueOrBuilder() {
      return lastAcceptedValue_;
    }

    private void initFields() {
      lastPromisedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
      lastAcceptedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
      lastAcceptedValue_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    @Override public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
    }
      if (isInitialized == 0) {
        return false;
    }

      if (hasLastPromisedId()) {
        if (!getLastPromisedId().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasLastAcceptedId()) {
        if (!getLastAcceptedId().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, lastPromisedId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, lastAcceptedId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, lastAcceptedValue_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    @Override public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) {
        return size;
    }

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, lastPromisedId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, lastAcceptedId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, lastAcceptedValue_);
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

    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    @Override public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    @Override public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosAcceptorState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.paxos.persistence.generated.PaxosAcceptorState)
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_descriptor;
      }

      @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.Builder.class);
      }

      // Construct using com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.newBuilder()
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
          getLastPromisedIdFieldBuilder();
          getLastAcceptedIdFieldBuilder();
          getLastAcceptedValueFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      @Override public Builder clear() {
        super.clear();
        if (lastPromisedIdBuilder_ == null) {
          lastPromisedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
        } else {
          lastPromisedIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (lastAcceptedIdBuilder_ == null) {
          lastAcceptedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
        } else {
          lastAcceptedIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (lastAcceptedValueBuilder_ == null) {
          lastAcceptedValue_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance();
        } else {
          lastAcceptedValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_descriptor;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState getDefaultInstanceForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.getDefaultInstance();
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState build() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState buildPartial() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState result = new com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (lastPromisedIdBuilder_ == null) {
          result.lastPromisedId_ = lastPromisedId_;
        } else {
          result.lastPromisedId_ = lastPromisedIdBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (lastAcceptedIdBuilder_ == null) {
          result.lastAcceptedId_ = lastAcceptedId_;
        } else {
          result.lastAcceptedId_ = lastAcceptedIdBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (lastAcceptedValueBuilder_ == null) {
          result.lastAcceptedValue_ = lastAcceptedValue_;
        } else {
          result.lastAcceptedValue_ = lastAcceptedValueBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState) {
          return mergeFrom((com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState other) {
        if (other == com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState.getDefaultInstance()) {
            return this;
        }
        if (other.hasLastPromisedId()) {
          mergeLastPromisedId(other.getLastPromisedId());
        }
        if (other.hasLastAcceptedId()) {
          mergeLastAcceptedId(other.getLastAcceptedId());
        }
        if (other.hasLastAcceptedValue()) {
          mergeLastAcceptedValue(other.getLastAcceptedValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override public final boolean isInitialized() {
        if (hasLastPromisedId()) {
          if (!getLastPromisedId().isInitialized()) {

            return false;
          }
        }
        if (hasLastAcceptedId()) {
          if (!getLastAcceptedId().isInitialized()) {

            return false;
          }
        }
        return true;
      }

      @Override public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosAcceptorState) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId lastPromisedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder> lastPromisedIdBuilder_;
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      @Override
    public boolean hasLastPromisedId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getLastPromisedId() {
        if (lastPromisedIdBuilder_ == null) {
          return lastPromisedId_;
        } else {
          return lastPromisedIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      public Builder setLastPromisedId(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId value) {
        if (lastPromisedIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastPromisedId_ = value;
          onChanged();
        } else {
          lastPromisedIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      public Builder setLastPromisedId(
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder builderForValue) {
        if (lastPromisedIdBuilder_ == null) {
          lastPromisedId_ = builderForValue.build();
          onChanged();
        } else {
          lastPromisedIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      public Builder mergeLastPromisedId(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId value) {
        if (lastPromisedIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              lastPromisedId_ != com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance()) {
            lastPromisedId_ =
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.newBuilder(lastPromisedId_).mergeFrom(value).buildPartial();
          } else {
            lastPromisedId_ = value;
          }
          onChanged();
        } else {
          lastPromisedIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      public Builder clearLastPromisedId() {
        if (lastPromisedIdBuilder_ == null) {
          lastPromisedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
          onChanged();
        } else {
          lastPromisedIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder getLastPromisedIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getLastPromisedIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder getLastPromisedIdOrBuilder() {
        if (lastPromisedIdBuilder_ != null) {
          return lastPromisedIdBuilder_.getMessageOrBuilder();
        } else {
          return lastPromisedId_;
        }
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastPromisedId = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder>
          getLastPromisedIdFieldBuilder() {
        if (lastPromisedIdBuilder_ == null) {
          lastPromisedIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder>(
                  getLastPromisedId(),
                  getParentForChildren(),
                  isClean());
          lastPromisedId_ = null;
        }
        return lastPromisedIdBuilder_;
      }

      private com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId lastAcceptedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder> lastAcceptedIdBuilder_;
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      @Override
    public boolean hasLastAcceptedId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getLastAcceptedId() {
        if (lastAcceptedIdBuilder_ == null) {
          return lastAcceptedId_;
        } else {
          return lastAcceptedIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      public Builder setLastAcceptedId(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId value) {
        if (lastAcceptedIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastAcceptedId_ = value;
          onChanged();
        } else {
          lastAcceptedIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      public Builder setLastAcceptedId(
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder builderForValue) {
        if (lastAcceptedIdBuilder_ == null) {
          lastAcceptedId_ = builderForValue.build();
          onChanged();
        } else {
          lastAcceptedIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      public Builder mergeLastAcceptedId(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId value) {
        if (lastAcceptedIdBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              lastAcceptedId_ != com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance()) {
            lastAcceptedId_ =
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.newBuilder(lastAcceptedId_).mergeFrom(value).buildPartial();
          } else {
            lastAcceptedId_ = value;
          }
          onChanged();
        } else {
          lastAcceptedIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      public Builder clearLastAcceptedId() {
        if (lastAcceptedIdBuilder_ == null) {
          lastAcceptedId_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
          onChanged();
        } else {
          lastAcceptedIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder getLastAcceptedIdBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLastAcceptedIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder getLastAcceptedIdOrBuilder() {
        if (lastAcceptedIdBuilder_ != null) {
          return lastAcceptedIdBuilder_.getMessageOrBuilder();
        } else {
          return lastAcceptedId_;
        }
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosProposalId lastAcceptedId = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder>
          getLastAcceptedIdFieldBuilder() {
        if (lastAcceptedIdBuilder_ == null) {
          lastAcceptedIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder>(
                  getLastAcceptedId(),
                  getParentForChildren(),
                  isClean());
          lastAcceptedId_ = null;
        }
        return lastAcceptedIdBuilder_;
      }

      private com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue lastAcceptedValue_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder> lastAcceptedValueBuilder_;
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      @Override
    public boolean hasLastAcceptedValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue getLastAcceptedValue() {
        if (lastAcceptedValueBuilder_ == null) {
          return lastAcceptedValue_;
        } else {
          return lastAcceptedValueBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      public Builder setLastAcceptedValue(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue value) {
        if (lastAcceptedValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastAcceptedValue_ = value;
          onChanged();
        } else {
          lastAcceptedValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      public Builder setLastAcceptedValue(
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder builderForValue) {
        if (lastAcceptedValueBuilder_ == null) {
          lastAcceptedValue_ = builderForValue.build();
          onChanged();
        } else {
          lastAcceptedValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      public Builder mergeLastAcceptedValue(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue value) {
        if (lastAcceptedValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              lastAcceptedValue_ != com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance()) {
            lastAcceptedValue_ =
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.newBuilder(lastAcceptedValue_).mergeFrom(value).buildPartial();
          } else {
            lastAcceptedValue_ = value;
          }
          onChanged();
        } else {
          lastAcceptedValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      public Builder clearLastAcceptedValue() {
        if (lastAcceptedValueBuilder_ == null) {
          lastAcceptedValue_ = com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.getDefaultInstance();
          onChanged();
        } else {
          lastAcceptedValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder getLastAcceptedValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getLastAcceptedValueFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      @Override
    public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder getLastAcceptedValueOrBuilder() {
        if (lastAcceptedValueBuilder_ != null) {
          return lastAcceptedValueBuilder_.getMessageOrBuilder();
        } else {
          return lastAcceptedValue_;
        }
      }
      /**
       * <code>optional .com.palantir.paxos.persistence.generated.PaxosValue lastAcceptedValue = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder>
          getLastAcceptedValueFieldBuilder() {
        if (lastAcceptedValueBuilder_ == null) {
          lastAcceptedValueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValue.Builder, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosValueOrBuilder>(
                  getLastAcceptedValue(),
                  getParentForChildren(),
                  isClean());
          lastAcceptedValue_ = null;
        }
        return lastAcceptedValueBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.paxos.persistence.generated.PaxosAcceptorState)
    }

    static {
      defaultInstance = new PaxosAcceptorState(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.paxos.persistence.generated.PaxosAcceptorState)
  }

  public interface PaxosProposalIdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.palantir.paxos.persistence.generated.PaxosProposalId)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 number = 1;</code>
     */
    boolean hasNumber();
    /**
     * <code>required int64 number = 1;</code>
     */
    long getNumber();

    /**
     * <code>optional string proposerUUID = 2;</code>
     */
    boolean hasProposerUUID();
    /**
     * <code>optional string proposerUUID = 2;</code>
     */
    java.lang.String getProposerUUID();
    /**
     * <code>optional string proposerUUID = 2;</code>
     */
    com.google.protobuf.ByteString
        getProposerUUIDBytes();
  }
  /**
   * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosProposalId}
   */
  public static final class PaxosProposalId extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.palantir.paxos.persistence.generated.PaxosProposalId)
      PaxosProposalIdOrBuilder {
    // Use PaxosProposalId.newBuilder() to construct.
    private PaxosProposalId(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PaxosProposalId(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PaxosProposalId defaultInstance;
    public static PaxosProposalId getDefaultInstance() {
      return defaultInstance;
    }

    @Override public PaxosProposalId getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PaxosProposalId(
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
              bitField0_ |= 0x00000001;
              number_ = input.readInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              proposerUUID_ = bs;
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
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_descriptor;
    }

    @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder.class);
    }

    public static com.google.protobuf.Parser<PaxosProposalId> PARSER =
        new com.google.protobuf.AbstractParser<PaxosProposalId>() {
      @Override
    public PaxosProposalId parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PaxosProposalId(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PaxosProposalId> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private long number_;
    /**
     * <code>required int64 number = 1;</code>
     */
    @Override
    public boolean hasNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 number = 1;</code>
     */
    @Override
    public long getNumber() {
      return number_;
    }

    public static final int PROPOSERUUID_FIELD_NUMBER = 2;
    private java.lang.Object proposerUUID_;
    /**
     * <code>optional string proposerUUID = 2;</code>
     */
    @Override
    public boolean hasProposerUUID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string proposerUUID = 2;</code>
     */
    @Override
    public java.lang.String getProposerUUID() {
      java.lang.Object ref = proposerUUID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          proposerUUID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string proposerUUID = 2;</code>
     */
    @Override
    public com.google.protobuf.ByteString
        getProposerUUIDBytes() {
      java.lang.Object ref = proposerUUID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        proposerUUID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      number_ = 0L;
      proposerUUID_ = "";
    }
    private byte memoizedIsInitialized = -1;
    @Override public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) {
        return true;
    }
      if (isInitialized == 0) {
        return false;
    }

      if (!hasNumber()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, number_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getProposerUUIDBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    @Override public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) {
        return size;
    }

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, number_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getProposerUUIDBytes());
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

    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    @Override public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    @Override public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.palantir.paxos.persistence.generated.PaxosProposalId}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.palantir.paxos.persistence.generated.PaxosProposalId)
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalIdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_descriptor;
      }

      @Override protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.class, com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.Builder.class);
      }

      // Construct using com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.newBuilder()
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

      @Override public Builder clear() {
        super.clear();
        number_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        proposerUUID_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_descriptor;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId getDefaultInstanceForType() {
        return com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance();
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId build() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override public com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId buildPartial() {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId result = new com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.number_ = number_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.proposerUUID_ = proposerUUID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId) {
          return mergeFrom((com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId other) {
        if (other == com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId.getDefaultInstance()) {
            return this;
        }
        if (other.hasNumber()) {
          setNumber(other.getNumber());
        }
        if (other.hasProposerUUID()) {
          bitField0_ |= 0x00000002;
          proposerUUID_ = other.proposerUUID_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override public final boolean isInitialized() {
        if (!hasNumber()) {

          return false;
        }
        return true;
      }

      @Override public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.palantir.paxos.persistence.generated.PaxosPersistence.PaxosProposalId) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long number_ ;
      /**
       * <code>required int64 number = 1;</code>
       */
      @Override
    public boolean hasNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 number = 1;</code>
       */
      @Override
    public long getNumber() {
        return number_;
      }
      /**
       * <code>required int64 number = 1;</code>
       */
      public Builder setNumber(long value) {
        bitField0_ |= 0x00000001;
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 number = 1;</code>
       */
      public Builder clearNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        number_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object proposerUUID_ = "";
      /**
       * <code>optional string proposerUUID = 2;</code>
       */
      @Override
    public boolean hasProposerUUID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string proposerUUID = 2;</code>
       */
      @Override
    public java.lang.String getProposerUUID() {
        java.lang.Object ref = proposerUUID_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            proposerUUID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string proposerUUID = 2;</code>
       */
      @Override
    public com.google.protobuf.ByteString
          getProposerUUIDBytes() {
        java.lang.Object ref = proposerUUID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          proposerUUID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string proposerUUID = 2;</code>
       */
      public Builder setProposerUUID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        proposerUUID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string proposerUUID = 2;</code>
       */
      public Builder clearProposerUUID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        proposerUUID_ = getDefaultInstance().getProposerUUID();
        onChanged();
        return this;
      }
      /**
       * <code>optional string proposerUUID = 2;</code>
       */
      public Builder setProposerUUIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        proposerUUID_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.palantir.paxos.persistence.generated.PaxosProposalId)
    }

    static {
      defaultInstance = new PaxosProposalId(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.palantir.paxos.persistence.generated.PaxosProposalId)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_paxos_persistence_generated_PaxosValue_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_paxos_persistence_generated_PaxosValue_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9src/com/palantir/paxos/persistence/Pax" +
      "osPersistence.proto\022(com.palantir.paxos." +
      "persistence.generated\"\037\n\013PaxosHeader\022\020\n\010" +
      "checksum\030\001 \002(\014\"<\n\nPaxosValue\022\r\n\005bytes\030\001 " +
      "\001(\014\022\013\n\003seq\030\002 \001(\003\022\022\n\nleaderUUID\030\003 \001(\t\"\213\002\n" +
      "\022PaxosAcceptorState\022Q\n\016lastPromisedId\030\001 " +
      "\001(\01329.com.palantir.paxos.persistence.gen" +
      "erated.PaxosProposalId\022Q\n\016lastAcceptedId" +
      "\030\002 \001(\01329.com.palantir.paxos.persistence." +
      "generated.PaxosProposalId\022O\n\021lastAccepte",
      "dValue\030\003 \001(\01324.com.palantir.paxos.persis" +
      "tence.generated.PaxosValue\"7\n\017PaxosPropo" +
      "salId\022\016\n\006number\030\001 \002(\003\022\024\n\014proposerUUID\030\002 " +
      "\001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          @Override public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_paxos_persistence_generated_PaxosHeader_descriptor,
        new java.lang.String[] { "Checksum", });
    internal_static_com_palantir_paxos_persistence_generated_PaxosValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_palantir_paxos_persistence_generated_PaxosValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_paxos_persistence_generated_PaxosValue_descriptor,
        new java.lang.String[] { "Bytes", "Seq", "LeaderUUID", });
    internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_paxos_persistence_generated_PaxosAcceptorState_descriptor,
        new java.lang.String[] { "LastPromisedId", "LastAcceptedId", "LastAcceptedValue", });
    internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_palantir_paxos_persistence_generated_PaxosProposalId_descriptor,
        new java.lang.String[] { "Number", "ProposerUUID", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
