package com.yg.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName OrderConsulController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/7/13 23:29
 * @Version 1.0
 **/

@RestController
public class OrderConsulController {
    public static final String INVOKE_URL = "http://consul-provider-payment";
    private final RestTemplate restTemplate;

    public OrderConsulController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        System.out.println("dsadsadsadasdasdsadada");
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        System.out.println(result.substring(1));
        return result;
    }
}
