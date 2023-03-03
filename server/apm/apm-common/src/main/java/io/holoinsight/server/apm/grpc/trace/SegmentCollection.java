// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trace/Tracing.proto

package io.holoinsight.server.apm.grpc.trace;

/**
 * <pre>
 * The segment collections for trace report in batch and sync mode.
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.apm.grpc.trace.SegmentCollection}
 */
public  final class SegmentCollection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.apm.grpc.trace.SegmentCollection)
    SegmentCollectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SegmentCollection.newBuilder() to construct.
  private SegmentCollection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SegmentCollection() {
    segments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SegmentCollection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SegmentCollection(
      com.google.protobuf.CodedInputStream input,
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              segments_ = new java.util.ArrayList<io.holoinsight.server.apm.grpc.trace.SegmentObject>();
              mutable_bitField0_ |= 0x00000001;
            }
            segments_.add(
                input.readMessage(io.holoinsight.server.apm.grpc.trace.SegmentObject.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        segments_ = java.util.Collections.unmodifiableList(segments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_SegmentCollection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_SegmentCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.apm.grpc.trace.SegmentCollection.class, io.holoinsight.server.apm.grpc.trace.SegmentCollection.Builder.class);
  }

  public static final int SEGMENTS_FIELD_NUMBER = 1;
  private java.util.List<io.holoinsight.server.apm.grpc.trace.SegmentObject> segments_;
  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
   */
  public java.util.List<io.holoinsight.server.apm.grpc.trace.SegmentObject> getSegmentsList() {
    return segments_;
  }
  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
   */
  public java.util.List<? extends io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder> 
      getSegmentsOrBuilderList() {
    return segments_;
  }
  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
   */
  public int getSegmentsCount() {
    return segments_.size();
  }
  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
   */
  public io.holoinsight.server.apm.grpc.trace.SegmentObject getSegments(int index) {
    return segments_.get(index);
  }
  /**
   * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
   */
  public io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder getSegmentsOrBuilder(
      int index) {
    return segments_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < segments_.size(); i++) {
      output.writeMessage(1, segments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < segments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, segments_.get(i));
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
    if (!(obj instanceof io.holoinsight.server.apm.grpc.trace.SegmentCollection)) {
      return super.equals(obj);
    }
    io.holoinsight.server.apm.grpc.trace.SegmentCollection other = (io.holoinsight.server.apm.grpc.trace.SegmentCollection) obj;

    if (!getSegmentsList()
        .equals(other.getSegmentsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSegmentsCount() > 0) {
      hash = (37 * hash) + SEGMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.holoinsight.server.apm.grpc.trace.SegmentCollection prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The segment collections for trace report in batch and sync mode.
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.apm.grpc.trace.SegmentCollection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.apm.grpc.trace.SegmentCollection)
      io.holoinsight.server.apm.grpc.trace.SegmentCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_SegmentCollection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_SegmentCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.apm.grpc.trace.SegmentCollection.class, io.holoinsight.server.apm.grpc.trace.SegmentCollection.Builder.class);
    }

    // Construct using io.holoinsight.server.apm.grpc.trace.SegmentCollection.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSegmentsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        segmentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.holoinsight.server.apm.grpc.trace.Tracing.internal_static_io_holoinsight_server_apm_grpc_trace_SegmentCollection_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.apm.grpc.trace.SegmentCollection getDefaultInstanceForType() {
      return io.holoinsight.server.apm.grpc.trace.SegmentCollection.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.apm.grpc.trace.SegmentCollection build() {
      io.holoinsight.server.apm.grpc.trace.SegmentCollection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.apm.grpc.trace.SegmentCollection buildPartial() {
      io.holoinsight.server.apm.grpc.trace.SegmentCollection result = new io.holoinsight.server.apm.grpc.trace.SegmentCollection(this);
      int from_bitField0_ = bitField0_;
      if (segmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          segments_ = java.util.Collections.unmodifiableList(segments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.segments_ = segments_;
      } else {
        result.segments_ = segmentsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.apm.grpc.trace.SegmentCollection) {
        return mergeFrom((io.holoinsight.server.apm.grpc.trace.SegmentCollection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.apm.grpc.trace.SegmentCollection other) {
      if (other == io.holoinsight.server.apm.grpc.trace.SegmentCollection.getDefaultInstance()) return this;
      if (segmentsBuilder_ == null) {
        if (!other.segments_.isEmpty()) {
          if (segments_.isEmpty()) {
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSegmentsIsMutable();
            segments_.addAll(other.segments_);
          }
          onChanged();
        }
      } else {
        if (!other.segments_.isEmpty()) {
          if (segmentsBuilder_.isEmpty()) {
            segmentsBuilder_.dispose();
            segmentsBuilder_ = null;
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            segmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSegmentsFieldBuilder() : null;
          } else {
            segmentsBuilder_.addAllMessages(other.segments_);
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
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.holoinsight.server.apm.grpc.trace.SegmentCollection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.apm.grpc.trace.SegmentCollection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.holoinsight.server.apm.grpc.trace.SegmentObject> segments_ =
      java.util.Collections.emptyList();
    private void ensureSegmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        segments_ = new java.util.ArrayList<io.holoinsight.server.apm.grpc.trace.SegmentObject>(segments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.holoinsight.server.apm.grpc.trace.SegmentObject, io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder, io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder> segmentsBuilder_;

    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public java.util.List<io.holoinsight.server.apm.grpc.trace.SegmentObject> getSegmentsList() {
      if (segmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(segments_);
      } else {
        return segmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public int getSegmentsCount() {
      if (segmentsBuilder_ == null) {
        return segments_.size();
      } else {
        return segmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public io.holoinsight.server.apm.grpc.trace.SegmentObject getSegments(int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);
      } else {
        return segmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder setSegments(
        int index, io.holoinsight.server.apm.grpc.trace.SegmentObject value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.set(index, value);
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder setSegments(
        int index, io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.set(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder addSegments(io.holoinsight.server.apm.grpc.trace.SegmentObject value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder addSegments(
        int index, io.holoinsight.server.apm.grpc.trace.SegmentObject value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(index, value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder addSegments(
        io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder addSegments(
        int index, io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder addAllSegments(
        java.lang.Iterable<? extends io.holoinsight.server.apm.grpc.trace.SegmentObject> values) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, segments_);
        onChanged();
      } else {
        segmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder clearSegments() {
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        segmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public Builder removeSegments(int index) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.remove(index);
        onChanged();
      } else {
        segmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder getSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder getSegmentsOrBuilder(
        int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);  } else {
        return segmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public java.util.List<? extends io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder> 
         getSegmentsOrBuilderList() {
      if (segmentsBuilder_ != null) {
        return segmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(segments_);
      }
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder addSegmentsBuilder() {
      return getSegmentsFieldBuilder().addBuilder(
          io.holoinsight.server.apm.grpc.trace.SegmentObject.getDefaultInstance());
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder addSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().addBuilder(
          index, io.holoinsight.server.apm.grpc.trace.SegmentObject.getDefaultInstance());
    }
    /**
     * <code>repeated .io.holoinsight.server.apm.grpc.trace.SegmentObject segments = 1;</code>
     */
    public java.util.List<io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder> 
         getSegmentsBuilderList() {
      return getSegmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.holoinsight.server.apm.grpc.trace.SegmentObject, io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder, io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder> 
        getSegmentsFieldBuilder() {
      if (segmentsBuilder_ == null) {
        segmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.holoinsight.server.apm.grpc.trace.SegmentObject, io.holoinsight.server.apm.grpc.trace.SegmentObject.Builder, io.holoinsight.server.apm.grpc.trace.SegmentObjectOrBuilder>(
                segments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        segments_ = null;
      }
      return segmentsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.apm.grpc.trace.SegmentCollection)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.apm.grpc.trace.SegmentCollection)
  private static final io.holoinsight.server.apm.grpc.trace.SegmentCollection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.apm.grpc.trace.SegmentCollection();
  }

  public static io.holoinsight.server.apm.grpc.trace.SegmentCollection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SegmentCollection>
      PARSER = new com.google.protobuf.AbstractParser<SegmentCollection>() {
    @java.lang.Override
    public SegmentCollection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SegmentCollection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SegmentCollection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SegmentCollection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.apm.grpc.trace.SegmentCollection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
