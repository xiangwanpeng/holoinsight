// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

public interface GaugeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.metrics.v1.Gauge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.v1.NumberDataPoint> getDataPointsList();

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.NumberDataPoint getDataPoints(int index);

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  int getDataPointsCount();

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.v1.NumberDataPointOrBuilder> getDataPointsOrBuilderList();

  /**
   * <code>repeated .opentelemetry.proto.metrics.v1.NumberDataPoint data_points = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.NumberDataPointOrBuilder getDataPointsOrBuilder(int index);
}
