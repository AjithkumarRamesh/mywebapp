package com.tech.mywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebAppController {
	@GetMapping("/get")
	public String get() {
		return "My WEB APP DEMO";
	}

}
