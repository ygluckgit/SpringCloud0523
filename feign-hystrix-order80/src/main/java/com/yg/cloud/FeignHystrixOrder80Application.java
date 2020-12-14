package com.yg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class FeignHystrixOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignHystrixOrder80Application.class, args);
	}

}
