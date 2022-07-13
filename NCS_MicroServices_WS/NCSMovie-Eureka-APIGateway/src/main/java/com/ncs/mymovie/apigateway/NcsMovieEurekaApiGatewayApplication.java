package com.ncs.mymovie.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NcsMovieEurekaApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcsMovieEurekaApiGatewayApplication.class, args);
	}

}
