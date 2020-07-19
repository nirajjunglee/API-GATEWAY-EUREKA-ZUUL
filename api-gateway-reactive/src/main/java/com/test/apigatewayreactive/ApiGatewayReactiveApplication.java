package com.test.apigatewayreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayReactiveApplication.class, args);
	}

}
