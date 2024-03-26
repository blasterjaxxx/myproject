package com.example.LearningProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.example.LearningProject")
@EnableJpaRepositories(basePackages = "com.example.LearningProject")
@EntityScan(basePackages = "com.example.LearningProject")
public class LearningProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningProjectApplication.class, args);
		System.out.print("inside main");
	}

}
