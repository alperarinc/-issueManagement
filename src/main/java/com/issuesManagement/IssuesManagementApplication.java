package com.issuesManagement;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IssuesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssuesManagementApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper(){

		return new ModelMapper();

	}

}
