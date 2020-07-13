package com.yg.cloud.controller;

import com.netflix.discovery.DiscoveryClient;
import com.yg.cloud.entities.CommonResult;
import com.yg.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class OrderController {
    private final RestTemplate restTemplate;
    //private final DiscoveryClient discoveryClient;
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-8001";

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        //this.discoveryClient = discoveryClient;
    }

    @PostMapping("/consumer/payment/get/{id}")
    public CommonResult <Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
