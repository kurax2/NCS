package com.mkj.securepro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SecurePro1Application {

	public static void main(String[] args) {
		SpringApplication.run(SecurePro1Application.class, args);
	}

}
