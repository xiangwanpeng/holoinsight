/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.common.dao.converter;

import io.holoinsight.server.common.dao.entity.AlarmGroup;
import io.holoinsight.server.common.dao.entity.dto.AlarmGroupDTO;
import io.holoinsight.server.common.dao.transformer.GroupInfoConfMapper;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author wangsiyuan
 * @date 2022/4/12 9:40 下午
 */
@Mapper(componentModel = "spring", uses = {GroupInfoConfMapper.class})
public interface AlarmGroupConverter {

  AlarmGroupDTO doToDTO(AlarmGroup tenant);

  AlarmGroup dtoToDO(AlarmGroupDTO tenantDTO);

  List<AlarmGroupDTO> dosToDTOs(Iterable<AlarmGroup> tenants);
}
