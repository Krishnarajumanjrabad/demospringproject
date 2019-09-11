package com.example.demo.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DemoSpringRestController {
	
	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Inside the say hello demo example");
		return "Hello First Spring Boot example with Docker example";
	}

}
