package com.example.microservicioStarterClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import starter.Saludo;

@SpringBootApplication
public class MicroservicioStarterClientApplication implements CommandLineRunner {


	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicioStarterClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
