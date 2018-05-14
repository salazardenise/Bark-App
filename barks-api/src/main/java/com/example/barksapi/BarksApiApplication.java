package com.example.barksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BarksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarksApiApplication.class, args);
	}
}
