package com.yg.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


//-相当于在xml中注入一个bean是RestTemplate

@Configuration

public class ApplicationContextConfig {
    @Bean
   // @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
