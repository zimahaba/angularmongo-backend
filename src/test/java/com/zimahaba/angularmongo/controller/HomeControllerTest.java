package com.zimahaba.angularmongo.controller;

import com.zimahaba.angularmongo.AngularmongoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = AngularmongoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HomeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getMessageShouldReturnWelcomeMessage() {

        ResponseEntity<String> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "/home", String.class);
        assertThat(responseEntity.getBody()).contains("Welcome");
    }
}
