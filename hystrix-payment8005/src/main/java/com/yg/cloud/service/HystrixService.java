package com.yg.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sun.deploy.util.ArrayUtil;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import cn.hutool.core.*;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName HystrixService
 * @Description TODO
 * @Author YGuang
 * @Date 2020/9/21 9:31
 * @Version 1.0
 **/

@Service
public class HystrixService {
    public String isOk(int id) {
        return "is OK:  " + Thread.currentThread().getName() + "paymentid:  " + id + "O(∩_∩)O哈哈~";
    }

    public String notOk(int id) {
        int num = 3;
        try {
            TimeUnit.SECONDS.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "is NO OK:  " + Thread.currentThread().getName() + "paymentid:  " + id + "O(∩_∩)O哈哈~";
    }
    //熔断配置 10s内访问10次失败率60-per 以上跳闸
    @HystrixCommand(fallbackMethod = "fallback-paymentCircuitBreaker", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enable", value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInmilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPrecentage", value = "60"),//失败率达到多少跳闸

    })
    public String paymentCircuitBreaker(@PathVariable Integer id) {
        if(id<0){
            throw  new RuntimeException("error id coudnt be <0 ");
        }

        String s = IdUtil.simpleUUID();
        
        return "";
    }

}
