package com.luv2code.springboot.com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@GetMapping("/Hello World")
	public String sayHello() {
		return"Hello World!...";
		
	}

}
