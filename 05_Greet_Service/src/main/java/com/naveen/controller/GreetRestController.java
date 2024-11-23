package com.naveen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.client.WelcomeFeignClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeFeignClient welcomeFeignClient;

	@GetMapping("/greet")
	public String getGreetMsg() {

		String welcomeMsg = welcomeFeignClient.getWelcomeMsg();
		
		String greetMsg = "Jai Hanuman...";
		
		return greetMsg + welcomeMsg;
	}
}
