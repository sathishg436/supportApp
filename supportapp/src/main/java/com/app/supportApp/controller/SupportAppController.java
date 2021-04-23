package com.app.supportApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupportAppController {
	@GetMapping ("/test")
	private String getMessage() {
		
		return "Hello Sathish";
	}

}
