package com.klef.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan("com.klef.controller")
@ComponentScan("com.klef.service")
@EnableJpaRepositories("com.klef.repository")
@EntityScan("com.klef.model")

public class StudentwithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentwithJpaApplication.class, args);
		System.out.println("It is working fine!!");
	}

}
