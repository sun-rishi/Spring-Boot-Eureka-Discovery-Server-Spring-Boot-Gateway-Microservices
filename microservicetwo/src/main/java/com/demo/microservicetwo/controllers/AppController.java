package com.demo.microservicetwo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/get")
	public String home() {
		return "<h2>Microservice two is running</h2>";
	}

}
