package com.alcaldia.votaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotacionesApplication {

	public static void main(String[] args) {
		System.out.println("POSTGRES_URL: " + System.getenv("POSTGRES_URL"));
		System.out.println("PORT: " + System.getenv("PORT"));
		System.getenv().forEach((key, value) ->
				System.out.println(key + ": " + value)
		);
		System.out.println("=========================================================");
		SpringApplication.run(VotacionesApplication.class, args);
	}

}
