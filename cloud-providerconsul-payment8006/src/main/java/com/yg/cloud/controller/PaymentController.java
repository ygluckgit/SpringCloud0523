package com.yg.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/6/2 20:00
 * @Version 1.0
 **/


public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "springcloud with Consul:  " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
