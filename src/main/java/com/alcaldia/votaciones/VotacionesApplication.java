package com.alcaldia.votaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotacionesApplication {

	public static void main(String[] args) {
		String dbUrl = System.getenv("DATABASE_URL");
		System.out.println("==============================================");
		System.out.println("DATABASE_URL from environment: " + dbUrl);
		System.out.println("==============================================");
		System.out.println("=========================================================");
		SpringApplication.run(VotacionesApplication.class, args);
	}

}
