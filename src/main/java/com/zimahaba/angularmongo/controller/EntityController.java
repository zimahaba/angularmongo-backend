package com.zimahaba.angularmongo.controller;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.entity.dto.EntityDTO;
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
        return ResponseEntity.ok(entityService.findAllDTO());
    }

    @GetMapping("/entity/{id}")
    public ResponseEntity<EntityDTO> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(entityService.findByIdDTO(id).get());
    }

    @PostMapping("/entity")
    public ResponseEntity<EntityDTO> insertEntity(@RequestBody EntityDTO entity) {
        EntityDTO savedEntity = entityService.insertDTO(entity);
        return ResponseEntity.ok(savedEntity);
    }

    @PutMapping("/entity")
    public ResponseEntity<EntityDTO> updateEntity(@RequestBody EntityDTO entity) {
        EntityDTO savedEntity = entityService.updateDTO(entity);
        return ResponseEntity.ok(savedEntity);
    }

    @DeleteMapping("/entity")
    public ResponseEntity delete(@RequestBody EntityDTO entity) {
        entityService.deleteDTO(entity);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/entity/{id}")
    public ResponseEntity deleteById(@PathVariable("id") String id) {
        entityService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
