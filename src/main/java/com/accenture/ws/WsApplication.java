package com.accenture.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.accenture.ws.repository")
public class WsApplication {
	public static void main(String[] args) {
		SpringApplication.run(WsApplication.class, args);
	}
}