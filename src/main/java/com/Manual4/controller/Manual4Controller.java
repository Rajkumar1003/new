package com.Manual4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Manual4Controller {
	
	@GetMapping(value="/hello")
	public String get() {
		return "Aws";
	}

}
