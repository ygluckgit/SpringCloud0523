package com.yg.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderZkController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/6/1 4:33
 * @Version 1.0
 **/

@RestController
@Slf4j
public class OrderZkController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    private final RestTemplate restTemplate;

    public OrderZkController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        System.out.println(result.substring(1));
        return result;
    }
}
