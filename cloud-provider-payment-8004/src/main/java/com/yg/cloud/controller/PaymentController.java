package com.yg.cloud.controller;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/5/30 8:44
 * @Version 1.0
 **/
@RestController
@Slf4j

public class PaymentController {
    @org.springframework.beans.factory.annotation.Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper:  " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
