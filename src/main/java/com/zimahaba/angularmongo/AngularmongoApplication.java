package com.zimahaba.angularmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.zimahaba.angularmongo"})
@EnableMongoRepositories(basePackages = "com.zimahaba.angularmongo.repository")
public class AngularmongoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AngularmongoApplication.class, args);
	}

}
