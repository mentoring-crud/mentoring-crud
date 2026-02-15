package com.example.mentoring_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MentoringCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentoringCrudApplication.class, args);
	}

}