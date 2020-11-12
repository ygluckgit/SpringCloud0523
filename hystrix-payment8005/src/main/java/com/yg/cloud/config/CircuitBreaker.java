package com.yg.cloud.config;

import com.netflix.hystrix.HystrixCircuitBreaker;
import org.springframework.stereotype.Component;

/**
 * @ClassName CircuitBreaker
 * @Description TODO
 * @Author YGuang
 * @Date 2020/11/11 10:00
 * @Version 1.0
 **/


public class CircuitBreaker implements HystrixCircuitBreaker {
    @Override
    public boolean allowRequest() {
        return false;
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void markSuccess() {

    }
}
