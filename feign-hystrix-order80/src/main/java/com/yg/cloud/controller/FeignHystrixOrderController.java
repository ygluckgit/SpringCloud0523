package com.yg.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yg.cloud.service.FeignHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FeignHystrixOrderController
 * @Description TODO
 * @Author YGuang
        * @Date 2020/9/21 10:43
        * @Version 1.0
        **/

@RestController
//统一配置降级方法
@DefaultProperties(defaultFallback = "xxxx")
public class FeignHystrixOrderController {
    @Resource
   private FeignHystrixService feignHystrixService;
    @GetMapping("/customer/hystrix/ok/{id}")
    public String isok(@PathVariable("id") Integer id){
       Map<String,String>hashmap=new HashMap<>();

        return feignHystrixService.isok(id);
    }
    //Hashmap
    //默认使用同一方法
    @HystrixCommand
    @GetMapping("/customer/hystrix/nook/{id}")
    public String isNook(@PathVariable("id") Integer id){
        return feignHystrixService.isNotok(id);
    }
    public String xxxx(){
        return "xxxx";
    }
}
