package com.zimahaba.angularmongo.service;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService extends SuperEntityService<Entity> {

    @Autowired
    private EntityRepository entityRepository;

    @Override
    protected EntityRepository getRepository() {
        return entityRepository;
    }

}
