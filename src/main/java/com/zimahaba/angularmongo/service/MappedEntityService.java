package com.zimahaba.angularmongo.service;

import com.zimahaba.angularmongo.entity.SuperEntity;
import com.zimahaba.angularmongo.entity.dto.DTO;
import com.zimahaba.angularmongo.entity.dto.mapper.SuperMapper;

import java.util.List;
import java.util.Optional;

public abstract class MappedEntityService <E extends SuperEntity, D extends DTO> extends SuperEntityService<E> {

    protected abstract SuperMapper<E, D> getMapper();

    public Optional<D> findByIdDTO(String id) {
        Optional<D> dto = Optional.empty();

        Optional<E> entity = getRepository().findById(id);
        if (entity.isPresent()) {
            dto = Optional.of(convert(entity.get()));
        }

        return dto;
    }

    public List<D> findAllDTO() {
        List<E> entityList = getRepository().findAll();
        return convert(entityList);
    }

    public D insertDTO(D dto) {
        E entity = convert(dto);
        E insertedEntity = insert(entity);
        return convert(insertedEntity);
    }

    public D updateDTO(D dto) {
        E entity = convert(dto);
        E updatedEntity = update(entity);
        return convert(updatedEntity);
    }

    public void deleteDTO(D dto) {
        E entity = convert(dto);
        delete(entity);
    }

    private E convert(D dto) {
        return getMapper().toEntity(dto);
    }

    private D convert(E entity) {
        return getMapper().toDTO(entity);
    }

    private List<D> convert(List<E> list) {
        return getMapper().toDTOList(list);
    }
}
