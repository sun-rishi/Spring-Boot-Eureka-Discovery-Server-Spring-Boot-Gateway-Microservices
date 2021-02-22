package com.demo.microservicethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicethreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicethreeApplication.class, args);
	}

}
