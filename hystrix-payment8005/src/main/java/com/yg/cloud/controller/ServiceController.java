package com.yg.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yg.cloud.service.HystrixService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ServiceController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/9/21 9:30
 * @Version 1.0
 **/

@RestController
public class ServiceController {
    @Resource
    private HystrixService hystrixService;
    @Value("${server.port}")
    private String serverport;
   @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String isok(@PathVariable("id")Integer id){
    String result=hystrixService.isOk(id);
    return result;
    }
    @HystrixCommand(fallbackMethod = "fallback",commandProperties = {
            //超过多少时间触发fallback
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
            @HystrixProperty(name = "execution.isolation.thread.interruptOnTimeout", value = "false")
    })
    @GetMapping(value = "/payment/hystrix/nook/{id}")
    public String isNotok(@PathVariable("id")Integer id){
        String result=hystrixService.notOk(id);
        return result;

    }

public String fallback(Integer time){

       return  "sorry ,method fallback";
}

}
