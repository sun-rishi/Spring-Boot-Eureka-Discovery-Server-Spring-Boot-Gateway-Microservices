package com.demo.microservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicetwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicetwoApplication.class, args);
	}

}
