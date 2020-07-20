package com.zimahaba.angularmongo.controller;

import com.zimahaba.angularmongo.entity.Entity;
import com.zimahaba.angularmongo.entity.dto.EntityDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/free")
public class EntityFreeController {

    @GetMapping("/entity")
    public ResponseEntity<List> findAll() {
        EntityDTO entity1 = EntityDTO.builder().oneString("oneString 1").oneInteger(1).oneLong(2L).oneDecimal(BigDecimal.ONE)
                .oneDate(LocalDate.now()).oneTime(LocalTime.now()).build();
        EntityDTO entity2 = EntityDTO.builder().oneString("oneString 2").oneInteger(3).oneLong(4L).oneDecimal(BigDecimal.TEN)
                .oneDate(LocalDate.now()).oneTime(LocalTime.now()).build();
        return ResponseEntity.ok(Arrays.asList(entity1, entity2));
    }

    @GetMapping("/entity/{id}")
    public ResponseEntity<Entity> findById(@PathVariable("id") String id) {
        Entity entity = Entity.builder().oneString("oneString - id="+id).oneInteger(1).oneLong(2L).oneDecimal(BigDecimal.ONE)
                .oneDate(LocalDate.now()).oneTime(LocalTime.now()).build();
        return ResponseEntity.ok(entity);
    }

    @PostMapping("/entity")
    public ResponseEntity<Entity> insertEntity(@RequestBody Entity entity) {
        return ResponseEntity.ok(entity);
    }

    @PutMapping("/entity")
    public ResponseEntity<Entity> updateEntity(@RequestBody Entity entity) {
        entity.setOneString(entity.getOneString() + "alterada");
        entity.setOneInteger(entity.getOneInteger()+1);
        entity.setOneLong(entity.getOneLong()+1);
        entity.setOneDecimal(entity.getOneDecimal().add(BigDecimal.ONE));
        entity.setOneDate(entity.getOneDate().plusDays(1));
        entity.setOneTime(entity.getOneTime().plusHours(1));
        return ResponseEntity.ok(entity);
    }

    @DeleteMapping("/entity")
    public ResponseEntity delete(@RequestBody Entity entity) {
        return ResponseEntity.ok(entity);
    }

    @DeleteMapping("/entity/{id}")
    public ResponseEntity deleteById(@PathVariable("id") String id) {
        return ResponseEntity.ok("deleted id="+id);
    }

}
