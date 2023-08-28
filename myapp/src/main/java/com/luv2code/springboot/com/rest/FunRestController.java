package com.luv2code.springboot.com.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FunRestController {
	@GetMapping("/")
	public String sayHello() {
		return"Hello World!...";
		
	}
	
	@GetMapping("/Workout")
	public String Dailyworkout() {
		return"Everyday running 5k...";
	}

}
