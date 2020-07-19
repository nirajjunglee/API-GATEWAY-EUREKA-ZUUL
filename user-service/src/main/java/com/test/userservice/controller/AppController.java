package com.test.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.core.publisher.Mono;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/ms2")
public class AppController {

	@GetMapping(value = "get-data")
	public Mono<String> getData() {
		System.out.println("Inside ms2 getdata method");
		Mono<String> data = Mono.just("Hello from reative microservices ms2");
		return data;

	}
	
}
