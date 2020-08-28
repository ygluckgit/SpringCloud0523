package com.yg.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName CloudConsumerConsulOrder80Application
 * @Description TODO
 * @Author YGuang
 * @Date 2020/7/13 23:29
 * @Version 1.0
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerConsulOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerConsulOrder80Application.class, args);
    }
}
