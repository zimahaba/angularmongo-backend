package com.zimahaba.angularmongo.repository;

import com.zimahaba.angularmongo.entity.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends MongoRepository<Entity, String> {
}
