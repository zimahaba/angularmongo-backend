package com.zimahaba.angularmongo.service;

import com.zimahaba.angularmongo.entity.DatabaseSequence;
import com.zimahaba.angularmongo.entity.SuperEntity;
import com.zimahaba.angularmongo.entity.dto.mapper.SuperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public abstract class SuperEntityService<E extends SuperEntity> {

    @Autowired
    private MongoTemplate mongoTemplate;

    protected abstract MongoRepository<E, String> getRepository();

    public Optional<E> findById(String id) {
        return getRepository().findById(id);
    }

    public List<E> findAll() {
        return getRepository().findAll();
    }

    public E insert(E entity) {
        entity.setId(nextId(entity.getSequenceName()));
        return getRepository().insert(entity);
    };

    public E update(E entity) {
        return getRepository().save(entity);
    }

    public void delete(E entity) {
        getRepository().delete(entity);
    }

    public void deleteById(String id) {
        getRepository().deleteById(id);
    }

    private String nextId(String sequenceName) {

        Query query = query(where("_id").is(sequenceName));
        Update update = new Update().inc("sequence",1);

        DatabaseSequence counter = mongoTemplate.findAndModify(query, update, options().returnNew(true).upsert(true),
                DatabaseSequence.class);

        String id = "1";
        if (!Objects.isNull(counter) && !Objects.isNull(counter.getSequence())) {
            id = String.valueOf(counter.getSequence());
        }

        return id;
    }
}
