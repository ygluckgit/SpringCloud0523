package com.yg.cloud;

import com.yg.myrules.Myrules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name ="CLOUD-PAYMENT",configuration = Myrules.class)
public class CloudConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
    }

}
