/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.query.service.apm;

import io.holoinsight.server.apm.common.model.query.*;
import io.holoinsight.server.apm.common.model.specification.sw.Trace;
import io.holoinsight.server.apm.engine.postcal.MetricDefine;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface ApmAPI {

  @POST("/cluster/api/v1/trace/query/basic")
  Call<TraceBrief> queryBasicTraces(@Body QueryTraceRequest request);

  @POST("/cluster/api/v1/trace/query")
  Call<Trace> queryTrace(@Body QueryTraceRequest request);

  @POST("/cluster/api/v1/trace/billing")
  Call<StatisticData> billing(@Body QueryTraceRequest request);

  @POST("/cluster/api/v1/trace/statistic")
  Call<List<StatisticData>> statistic(@Body QueryTraceRequest request);

  @POST("/cluster/api/v1/metric/list")
  @Headers({"Content-Type: application/json", "Accept: application/json"})
  Call<List<String>> listMetrics();

  @POST("/cluster/api/v1/metric/defines")
  @Headers({"Content-Type: application/json", "Accept: application/json"})
  Call<List<MetricDefine>> listMetricDefines();

  @POST("/cluster/api/v1/metric/define/{name}")
  Call<MetricDefine> getMetricDefine(@Path("name") String name);

  @POST("/cluster/api/v1/metric/schema")
  @Headers({"Content-Type: application/json", "Accept: application/json"})
  Call<List<String>> querySchema(@Body QueryMetricRequest request);

  @POST("/cluster/api/v1/metric/query")
  Call<MetricValues> queryMetricData(@Body QueryMetricRequest request);

  @POST("/cluster/api/v1/service/query/serviceList")
  Call<List<Service>> queryServiceList(@Body QueryServiceRequest request);

  @POST("/cluster/api/v1/endpoint/query/endpointList")
  Call<List<Endpoint>> queryEndpointList(@Body QueryEndpointRequest request);

  @POST("/cluster/api/v1/serviceInstance/query/serviceInstanceList")
  Call<List<ServiceInstance>> queryServiceInstanceList(@Body QueryServiceInstanceRequest request);

  @POST("/cluster/api/v1/component/query/dbList")
  Call<List<VirtualComponent>> queryDbList(@Body QueryComponentRequest request);

  @POST("/cluster/api/v1/component/query/cacheList")
  Call<List<VirtualComponent>> queryCacheList(@Body QueryComponentRequest request);

  @POST("/cluster/api/v1/component/query/mqList")
  Call<List<VirtualComponent>> queryMQList(@Body QueryComponentRequest request);

  @POST("/cluster/api/v1/component/query/componentTraceIds")
  Call<List<String>> queryComponentTraceIds(@Body QueryComponentRequest request);

  @POST("/cluster/api/v1/topology/query/tenantTopology")
  Call<Topology> queryTenantTopology(@Body QueryTopologyRequest request);

  @POST("/cluster/api/v1/topology/query/serviceTopology")
  Call<Topology> queryServiceTopology(@Body QueryTopologyRequest request);

  @POST("/cluster/api/v1/topology/query/serviceInstanceTopology")
  Call<Topology> queryServiceInstanceTopology(@Body QueryTopologyRequest request);

  @POST("/cluster/api/v1/topology/query/endpointTopology")
  Call<Topology> queryEndpointTopology(@Body QueryTopologyRequest request);

  @POST("/cluster/api/v1/topology/query/dbTopology")
  Call<Topology> queryDbTopology(@Body QueryTopologyRequest request);

  @POST("/cluster/api/v1/topology/query/mqTopology")
  Call<Topology> queryMQTopology(@Body QueryTopologyRequest request);

  @POST("/cluster/api/v1/slowSql/query")
  Call<List<SlowSql>> querySlowSqlList(@Body QueryComponentRequest request);
}
