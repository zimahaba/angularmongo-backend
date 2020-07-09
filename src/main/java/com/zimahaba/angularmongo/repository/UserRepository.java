package com.zimahaba.angularmongo.repository;

import com.zimahaba.angularmongo.entity.ApplicationUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<ApplicationUser, String> {

    ApplicationUser findByUsername(String username);
}
