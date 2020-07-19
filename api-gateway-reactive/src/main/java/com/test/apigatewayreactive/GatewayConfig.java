package com.test.apigatewayreactive;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableHystrix
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p
            .path("/ms1/**") // intercept calls to the /get path
            .filters(f -> f.addRequestHeader("Hello", "World")
            		.hystrix(config -> config.setName("MS1")
            				.setFallbackUri("forward:/ms1fallback")))
            // add header
            .uri("lb://client-service"))
            .route(p -> p
            .path("/ms2/**") // intercept calls to the /get path
            .filters(f -> f.addRequestHeader("Hello", "World")
            		.hystrix(config -> config.setName("MS2")
            				.setFallbackUri("forward:/ms2fallback")))
            .uri("lb://user-service"))
            .build();
    }
}
