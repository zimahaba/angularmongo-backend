package com.zimahaba.angularmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Starts the application with "local" profile.
 */
@SpringBootApplication
public class LocalAngularmongoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AngularmongoApplication.class);
        app.setAdditionalProfiles("local", "lsec");
        app.run(args);
    }
}
