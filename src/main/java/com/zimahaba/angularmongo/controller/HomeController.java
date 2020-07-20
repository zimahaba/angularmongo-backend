package com.zimahaba.angularmongo.controller;

import com.zimahaba.angularmongo.entity.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> getHomeMessage() {
        return ResponseEntity.ok("Welcome to Entity CRUD!");
    }
}
