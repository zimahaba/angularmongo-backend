package com.zimahaba.angularmongo.controller;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntityController {

    @Autowired
    private EntityService entityService;

    @GetMapping("/entity")
    public ResponseEntity<List> findAll() {
        return ResponseEntity.ok(entityService.findAll());
    }

    @GetMapping("/entity/{id}")
    public ResponseEntity<Entity> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(entityService.findById(id).get());
    }

    @PostMapping("/entity")
    public ResponseEntity<Entity> insertEntity(@RequestBody Entity entity) {
        Entity savedEntity = entityService.insert(entity);
        return ResponseEntity.ok(savedEntity);
    }

    @PutMapping("/entity")
    public ResponseEntity<Entity> updateEntity(@RequestBody Entity entity) {
        Entity savedEntity = entityService.update(entity);
        return ResponseEntity.ok(savedEntity);
    }

    @DeleteMapping("/entity")
    public ResponseEntity delete(@RequestBody Entity entity) {
        entityService.delete(entity);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/entity/{id}")
    public ResponseEntity deleteById(@PathVariable("id") String id) {
        entityService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
