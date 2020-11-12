package com.yg.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "HYSTRIX-PAYMENT",fallback = PaymentServiceFallback.class)
public interface PaymentService {
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String isok(@PathVariable("id")Integer id);

    @GetMapping(value = "/payment/hystrix/nook/{id}")
    public String isNotok(@PathVariable("id")Integer id);


}
