package com.yg.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName FeignHystrixController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/9/21 10:43
 * @Version 1.0
 **/

@Service
@FeignClient(value = "HYSTRIX-PAYMENT")
public interface FeignHystrixService {
    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String isok(@PathVariable("id")Integer id);

    @GetMapping(value = "/payment/hystrix/nook/{id}")
    public String isNotok(@PathVariable("id")Integer id);
}
