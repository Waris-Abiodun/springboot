package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}
	
	@RequestMapping("/Welldone")
	public String hello() {
		return "writing spring application that was build using gradle and maven on command line interface";
	}

}
