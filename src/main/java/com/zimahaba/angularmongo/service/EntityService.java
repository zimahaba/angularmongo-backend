package com.zimahaba.angularmongo.service;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.entity.dto.EntityDTO;
import com.zimahaba.angularmongo.entity.dto.mapper.EntityMapper;
import com.zimahaba.angularmongo.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService extends SuperEntityService<Entity> {

    @Autowired
    private EntityRepository entityRepository;

    @Autowired
    private EntityMapper entityMapper;

    @Override
    protected EntityRepository getRepository() {
        return entityRepository;
    }

    public List<EntityDTO> findAllDTO() {
        List<Entity> entityList = entityRepository.findAll();
        return entityMapper.toDTOList(entityList);
    }

}
