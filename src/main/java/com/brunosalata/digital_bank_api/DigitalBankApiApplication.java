package com.brunosalata.digital_bank_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class DigitalBankApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBankApiApplication.class, args);
	}

}
