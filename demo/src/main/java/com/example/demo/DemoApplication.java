package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(TeammateRepository repo) {
		return args -> {
			repo.save(new Teammate("Teste", "Teste"));
			repo.save(new Teammate("Teste1", "Teste1"));
			repo.save(new Teammate("Teste2", "Teste2"));
			repo.save(new Teammate("Teste3", "Teste3"));
			repo.save(new Teammate("Teste4", "Teste4"));
		};
	}

}
