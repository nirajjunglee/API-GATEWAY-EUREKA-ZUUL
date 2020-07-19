package com.test.apigatewayreactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class AppController {
	
	@GetMapping(value="ms2fallback")
	public Mono<String> ms2Fallback(){
		
		return Mono.just("Got FALLBACK WITH MS2");
	}
	@GetMapping(value="ms1fallback")
	public Mono<String> ms1Fallback(){
		
		return Mono.just("Got FALLBACK WITH MS1");
	}

}
