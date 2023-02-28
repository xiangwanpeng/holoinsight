/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.storage.engine.elasticsearch.service.impl;

import io.holoinsight.server.common.springboot.ConditionalOnFeature;
import io.holoinsight.server.storage.engine.model.ServiceErrorDO;
import io.holoinsight.server.storage.engine.storage.ServiceErrorStorage;
import org.springframework.stereotype.Service;

@ConditionalOnFeature("trace")
@Service("serviceErrorEsStorage")
public class ServiceErrorEsStorage extends RecordEsStorage<ServiceErrorDO>
    implements ServiceErrorStorage {

}
