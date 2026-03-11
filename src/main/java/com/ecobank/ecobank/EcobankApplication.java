package com.ecobank.ecobank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EcobankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcobankApplication.class, args);
	}

}
