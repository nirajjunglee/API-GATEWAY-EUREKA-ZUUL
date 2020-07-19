package com.test.eurekadiscovery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.core.publisher.Mono;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/ms1")
public class AppController {

	@GetMapping(value = "get-data")
	public Mono<String> GetUsers() {
		System.out.println("Inside ms1 getdata method");
		Mono<String> data = Mono.just("Hello from reative microservices ms1");
		return data;

	}
}
