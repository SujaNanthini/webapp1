package com.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {
	@GetMapping(path = "/value")
	public String getMsg() {
		return "Hello Suja";
	}

}
