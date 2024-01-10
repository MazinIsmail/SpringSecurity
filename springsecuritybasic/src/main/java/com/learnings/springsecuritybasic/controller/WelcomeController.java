package com.learnings.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/basic")
	public String sayWelcome() {
		return "Basic Security";
	}

}
