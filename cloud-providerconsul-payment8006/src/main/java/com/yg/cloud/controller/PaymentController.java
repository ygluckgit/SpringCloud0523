package com.yg.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/6/2 20:00
 * @Version 1.0
 **/

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul() {
        System.out.println("YGYGYGYGYG");
        return "springcloud with Consul:  " + serverPort + "\t" + UUID.randomUUID().toString();
    }
    @RequestMapping(value = "/demo")
    public String va(){
        return "sdsada";
    }
}
