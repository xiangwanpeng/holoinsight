// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/collector/metrics/v1/metrics_service.proto

package io.opentelemetry.proto.collector.metrics.v1;

/**
 * Protobuf type {@code opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse}
 */
public final class ExportMetricsServiceResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse)
    ExportMetricsServiceResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ExportMetricsServiceResponse.newBuilder() to construct.
  private ExportMetricsServiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportMetricsServiceResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportMetricsServiceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExportMetricsServiceResponse(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.Builder subBuilder =
                null;
            if (partialSuccess_ != null) {
              subBuilder = partialSuccess_.toBuilder();
            }
            partialSuccess_ = input.readMessage(
                io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.parser(),
                extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partialSuccess_);
              partialSuccess_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.opentelemetry.proto.collector.metrics.v1.MetricsServiceProto.internal_static_opentelemetry_proto_collector_metrics_v1_ExportMetricsServiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.opentelemetry.proto.collector.metrics.v1.MetricsServiceProto.internal_static_opentelemetry_proto_collector_metrics_v1_ExportMetricsServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse.class,
            io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse.Builder.class);
  }

  public static final int PARTIAL_SUCCESS_FIELD_NUMBER = 1;
  private io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partialSuccess_;

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
   */
  public boolean hasPartialSuccess() {
    return partialSuccess_ != null;
  }

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
   */
  public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess getPartialSuccess() {
    return partialSuccess_ == null
        ? io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess
            .getDefaultInstance()
        : partialSuccess_;
  }

  /**
   * <pre>
   * The details of a partially successful export request.
   * If the request is only partially accepted
   * (i.e. when the server accepts only parts of the data and rejects the rest)
   * the server MUST initialize the `partial_success` field and MUST
   * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
   * Servers MAY also make use of the `partial_success` field to convey
   * warnings/suggestions to senders even when the request was fully accepted.
   * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
   * the `error_message` MUST be non-empty.
   * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
   * `error_message` = "") is equivalent to it not being set/present. Senders
   * SHOULD interpret it the same way as in the full success case.
   * </pre>
   *
   * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
   */
  public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccessOrBuilder getPartialSuccessOrBuilder() {
    return getPartialSuccess();
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
    if (partialSuccess_ != null) {
      output.writeMessage(1, getPartialSuccess());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (partialSuccess_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPartialSuccess());
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
    if (!(obj instanceof io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse)) {
      return super.equals(obj);
    }
    io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse other =
        (io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse) obj;

    if (hasPartialSuccess() != other.hasPartialSuccess())
      return false;
    if (hasPartialSuccess()) {
      if (!getPartialSuccess().equals(other.getPartialSuccess()))
        return false;
    }
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
    if (hasPartialSuccess()) {
      hash = (37 * hash) + PARTIAL_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + getPartialSuccess().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parseFrom(
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

  public static Builder newBuilder(
      io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse prototype) {
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
   * Protobuf type {@code opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse)
      io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.opentelemetry.proto.collector.metrics.v1.MetricsServiceProto.internal_static_opentelemetry_proto_collector_metrics_v1_ExportMetricsServiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.opentelemetry.proto.collector.metrics.v1.MetricsServiceProto.internal_static_opentelemetry_proto_collector_metrics_v1_ExportMetricsServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse.class,
              io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse.Builder.class);
    }

    // Construct using
    // io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (partialSuccessBuilder_ == null) {
        partialSuccess_ = null;
      } else {
        partialSuccess_ = null;
        partialSuccessBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.opentelemetry.proto.collector.metrics.v1.MetricsServiceProto.internal_static_opentelemetry_proto_collector_metrics_v1_ExportMetricsServiceResponse_descriptor;
    }

    @java.lang.Override
    public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse getDefaultInstanceForType() {
      return io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse build() {
      io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse buildPartial() {
      io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse result =
          new io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse(this);
      if (partialSuccessBuilder_ == null) {
        result.partialSuccess_ = partialSuccess_;
      } else {
        result.partialSuccess_ = partialSuccessBuilder_.build();
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
      if (other instanceof io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse) {
        return mergeFrom(
            (io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse other) {
      if (other == io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse
          .getDefaultInstance())
        return this;
      if (other.hasPartialSuccess()) {
        mergePartialSuccess(other.getPartialSuccess());
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
      io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse) e
            .getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partialSuccess_;
    private com.google.protobuf.SingleFieldBuilderV3<io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess, io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.Builder, io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccessOrBuilder> partialSuccessBuilder_;

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public boolean hasPartialSuccess() {
      return partialSuccessBuilder_ != null || partialSuccess_ != null;
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess getPartialSuccess() {
      if (partialSuccessBuilder_ == null) {
        return partialSuccess_ == null
            ? io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess
                .getDefaultInstance()
            : partialSuccess_;
      } else {
        return partialSuccessBuilder_.getMessage();
      }
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public Builder setPartialSuccess(
        io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess value) {
      if (partialSuccessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partialSuccess_ = value;
        onChanged();
      } else {
        partialSuccessBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public Builder setPartialSuccess(
        io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.Builder builderForValue) {
      if (partialSuccessBuilder_ == null) {
        partialSuccess_ = builderForValue.build();
        onChanged();
      } else {
        partialSuccessBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public Builder mergePartialSuccess(
        io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess value) {
      if (partialSuccessBuilder_ == null) {
        if (partialSuccess_ != null) {
          partialSuccess_ = io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess
              .newBuilder(partialSuccess_).mergeFrom(value).buildPartial();
        } else {
          partialSuccess_ = value;
        }
        onChanged();
      } else {
        partialSuccessBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public Builder clearPartialSuccess() {
      if (partialSuccessBuilder_ == null) {
        partialSuccess_ = null;
        onChanged();
      } else {
        partialSuccess_ = null;
        partialSuccessBuilder_ = null;
      }

      return this;
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.Builder getPartialSuccessBuilder() {

      onChanged();
      return getPartialSuccessFieldBuilder().getBuilder();
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccessOrBuilder getPartialSuccessOrBuilder() {
      if (partialSuccessBuilder_ != null) {
        return partialSuccessBuilder_.getMessageOrBuilder();
      } else {
        return partialSuccess_ == null
            ? io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess
                .getDefaultInstance()
            : partialSuccess_;
      }
    }

    /**
     * <pre>
     * The details of a partially successful export request.
     * If the request is only partially accepted
     * (i.e. when the server accepts only parts of the data and rejects the rest)
     * the server MUST initialize the `partial_success` field and MUST
     * set the `rejected_&lt;signal&gt;` with the number of items it rejected.
     * Servers MAY also make use of the `partial_success` field to convey
     * warnings/suggestions to senders even when the request was fully accepted.
     * In such cases, the `rejected_&lt;signal&gt;` MUST have a value of `0` and
     * the `error_message` MUST be non-empty.
     * A `partial_success` message with an empty value (rejected_&lt;signal&gt; = 0 and
     * `error_message` = "") is equivalent to it not being set/present. Senders
     * SHOULD interpret it the same way as in the full success case.
     * </pre>
     *
     * <code>.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess partial_success = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess, io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.Builder, io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccessOrBuilder> getPartialSuccessFieldBuilder() {
      if (partialSuccessBuilder_ == null) {
        partialSuccessBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess, io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccess.Builder, io.opentelemetry.proto.collector.metrics.v1.ExportMetricsPartialSuccessOrBuilder>(
                getPartialSuccess(), getParentForChildren(), isClean());
        partialSuccess_ = null;
      }
      return partialSuccessBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse)
  private static final io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE =
        new io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse();
  }

  public static io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportMetricsServiceResponse> PARSER =
      new com.google.protobuf.AbstractParser<ExportMetricsServiceResponse>() {
        @java.lang.Override
        public ExportMetricsServiceResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExportMetricsServiceResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExportMetricsServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportMetricsServiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

