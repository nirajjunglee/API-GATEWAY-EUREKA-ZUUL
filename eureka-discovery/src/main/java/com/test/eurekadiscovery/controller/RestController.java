package com.test.eurekadiscovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

	@GetMapping(value = "getusers")
	public String GetUsers() {
		return "Hi There";

	}
}