package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class Cricketcoach implements Coach {

	@Override
	public String getDailyworkout() {

		return "Practice fast bowling for 15 minutes";
	}

}
