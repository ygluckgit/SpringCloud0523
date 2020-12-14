package com.yg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignOrder80Application.class, args);
	}

}
