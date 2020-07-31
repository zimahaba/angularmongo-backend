package com.zimahaba.angularmongo.entity.dto.mapper;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.entity.SuperEntity;
import com.zimahaba.angularmongo.entity.dto.DTO;
import com.zimahaba.angularmongo.entity.dto.EntityDTO;

import java.util.List;

public interface SuperMapper<E extends SuperEntity, D extends DTO> {

    D toDTO(E entity);
    E toEntity(D dto);
    List<D> toDTOList(List<E> entityList);
    List<E> toEntityList(List<D> entityDTOList);

}
