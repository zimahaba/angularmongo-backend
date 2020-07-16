package com.zimahaba.angularmongo.entity.dto.mapper;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.entity.dto.EntityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntityMapper {

    EntityDTO toDTO(Entity entity);
    Entity toEntity(EntityDTO entityDTO);
    List<EntityDTO> toDTOList(List<Entity> entityList);
    List<Entity> toEntityList(List<EntityDTO> entityDTOList);
}
