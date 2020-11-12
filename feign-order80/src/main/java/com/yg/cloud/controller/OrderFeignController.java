package com.yg.cloud.controller;

import com.yg.cloud.entities.CommonResult;
import com.yg.cloud.entities.Payment;
import com.yg.cloud.service.PaymentFeiginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/9/19 0:39
 * @Version 1.0
 **/

@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    PaymentFeiginService paymentFeiginService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult <Payment> getPayment(@PathVariable("id") Long id){
        return paymentFeiginService.getPayment(id);
    }
}
