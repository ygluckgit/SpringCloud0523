package com.yg.cloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentServiceFallback
 * @Description TODO
 * @Author YGuang
 * @Date 2020/11/9 15:46
 * @Version 1.0
 **/

@Component
public class PaymentServiceFallback  implements PaymentService{
    @Override
    public String isok(Integer id) {
        return "fallback ok error";
    }

    @Override
    public String isNotok(Integer id) {
        return "fallback nook error";
    }
}
