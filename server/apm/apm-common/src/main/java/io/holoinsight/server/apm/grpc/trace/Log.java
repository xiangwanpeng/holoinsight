// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: trace/Tracing.proto

package io.holoinsight.server.apm.grpc.trace;

/**
 * Protobuf type {@code io.holoinsight.server.apm.grpc.trace.Log}
 */
public final class Log extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.apm.grpc.trace.Log)
    LogOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Log.newBuilder() to construct.
  private Log(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Log() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Log();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Log(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            time_ = input.readInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ =
                  new java.util.ArrayList<io.holoinsight.server.apm.grpc.common.KeyStringValuePair>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(io.holoinsight.server.apm.grpc.common.KeyStringValuePair.parser(),
                    extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_Log_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_Log_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.holoinsight.server.apm.grpc.trace.Log.class,
            io.holoinsight.server.apm.grpc.trace.Log.Builder.class);
  }

  public static final int TIME_FIELD_NUMBER = 1;
  private long time_;

  /**
   * <pre>
   * The timestamp in milliseconds of this event.,
   * measured between the current time and midnight, January 1, 1970 UTC.
   * </pre>
   *
   * <code>int64 time = 1;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private java.util.List<io.holoinsight.server.apm.grpc.common.KeyStringValuePair> data_;

  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
   */
  public java.util.List<io.holoinsight.server.apm.grpc.common.KeyStringValuePair> getDataList() {
    return data_;
  }

  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
   */
  public java.util.List<? extends io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder> getDataOrBuilderList() {
    return data_;
  }

  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
   */
  public int getDataCount() {
    return data_.size();
  }

  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
   */
  public io.holoinsight.server.apm.grpc.common.KeyStringValuePair getData(int index) {
    return data_.get(index);
  }

  /**
   * <pre>
   * String key, String value pair.
   * </pre>
   *
   * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
   */
  public io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (time_ != 0L) {
      output.writeInt64(1, time_);
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, time_);
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, data_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.holoinsight.server.apm.grpc.trace.Log)) {
      return super.equals(obj);
    }
    io.holoinsight.server.apm.grpc.trace.Log other = (io.holoinsight.server.apm.grpc.trace.Log) obj;

    if (getTime() != other.getTime())
      return false;
    if (!getDataList().equals(other.getDataList()))
      return false;
    if (!unknownFields.equals(other.unknownFields))
      return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTime());
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.apm.grpc.trace.Log parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.holoinsight.server.apm.grpc.trace.Log prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * Protobuf type {@code io.holoinsight.server.apm.grpc.trace.Log}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.apm.grpc.trace.Log)
      io.holoinsight.server.apm.grpc.trace.LogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_Log_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_Log_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.holoinsight.server.apm.grpc.trace.Log.class,
              io.holoinsight.server.apm.grpc.trace.Log.Builder.class);
    }

    // Construct using io.holoinsight.server.apm.grpc.trace.Log.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      time_ = 0L;

      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_Log_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.apm.grpc.trace.Log getDefaultInstanceForType() {
      return io.holoinsight.server.apm.grpc.trace.Log.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.apm.grpc.trace.Log build() {
      io.holoinsight.server.apm.grpc.trace.Log result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.apm.grpc.trace.Log buildPartial() {
      io.holoinsight.server.apm.grpc.trace.Log result =
          new io.holoinsight.server.apm.grpc.trace.Log(this);
      int from_bitField0_ = bitField0_;
      result.time_ = time_;
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.apm.grpc.trace.Log) {
        return mergeFrom((io.holoinsight.server.apm.grpc.trace.Log) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.apm.grpc.trace.Log other) {
      if (other == io.holoinsight.server.apm.grpc.trace.Log.getDefaultInstance())
        return this;
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                ? getDataFieldBuilder()
                : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.holoinsight.server.apm.grpc.trace.Log parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.apm.grpc.trace.Log) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private long time_;

    /**
     * <pre>
     * The timestamp in milliseconds of this event.,
     * measured between the current time and midnight, January 1, 1970 UTC.
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public long getTime() {
      return time_;
    }

    /**
     * <pre>
     * The timestamp in milliseconds of this event.,
     * measured between the current time and midnight, January 1, 1970 UTC.
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder setTime(long value) {

      time_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * The timestamp in milliseconds of this event.,
     * measured between the current time and midnight, January 1, 1970 UTC.
     * </pre>
     *
     * <code>int64 time = 1;</code>
     */
    public Builder clearTime() {

      time_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<io.holoinsight.server.apm.grpc.common.KeyStringValuePair> data_ =
        java.util.Collections.emptyList();

    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<io.holoinsight.server.apm.grpc.common.KeyStringValuePair>(
            data_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.holoinsight.server.apm.grpc.common.KeyStringValuePair, io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder, io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder> dataBuilder_;

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public java.util.List<io.holoinsight.server.apm.grpc.common.KeyStringValuePair> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public io.holoinsight.server.apm.grpc.common.KeyStringValuePair getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder setData(int index,
        io.holoinsight.server.apm.grpc.common.KeyStringValuePair value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder setData(int index,
        io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder addData(io.holoinsight.server.apm.grpc.common.KeyStringValuePair value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder addData(int index,
        io.holoinsight.server.apm.grpc.common.KeyStringValuePair value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder addData(
        io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder addData(int index,
        io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends io.holoinsight.server.apm.grpc.common.KeyStringValuePair> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public java.util.List<? extends io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder> getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          io.holoinsight.server.apm.grpc.common.KeyStringValuePair.getDefaultInstance());
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(index,
          io.holoinsight.server.apm.grpc.common.KeyStringValuePair.getDefaultInstance());
    }

    /**
     * <pre>
     * String key, String value pair.
     * </pre>
     *
     * <code>repeated .io.holoinsight.server.apm.grpc.common.KeyStringValuePair data = 2;</code>
     */
    public java.util.List<io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder> getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<io.holoinsight.server.apm.grpc.common.KeyStringValuePair, io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder, io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder> getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<io.holoinsight.server.apm.grpc.common.KeyStringValuePair, io.holoinsight.server.apm.grpc.common.KeyStringValuePair.Builder, io.holoinsight.server.apm.grpc.common.KeyStringValuePairOrBuilder>(
                data_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.apm.grpc.trace.Log)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.apm.grpc.trace.Log)
  private static final io.holoinsight.server.apm.grpc.trace.Log DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.apm.grpc.trace.Log();
  }

  public static io.holoinsight.server.apm.grpc.trace.Log getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Log> PARSER =
      new com.google.protobuf.AbstractParser<Log>() {
        @java.lang.Override
        public Log parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Log(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Log> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Log> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.apm.grpc.trace.Log getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

