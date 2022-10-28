package com.amit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller1 {

	@GetMapping
	public String getMessage() {
		return "Welcome";
	}
	
	

	@GetMapping("/{message}")
	public String greet(@PathVariable String message) {
		return "Welcome: "+message;
	}


}
