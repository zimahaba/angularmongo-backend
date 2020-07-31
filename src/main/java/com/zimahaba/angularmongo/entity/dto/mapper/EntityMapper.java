package com.zimahaba.angularmongo.entity.dto.mapper;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.entity.dto.EntityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntityMapper extends SuperMapper<Entity, EntityDTO> {

}
