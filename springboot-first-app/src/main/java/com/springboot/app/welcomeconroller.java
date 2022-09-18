package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeconroller {
	
	@GetMapping("/Welcome")
	public String Welcome() {
		return "Waris, this is your first springboot project on 09/18/2022";
		
	}

}
