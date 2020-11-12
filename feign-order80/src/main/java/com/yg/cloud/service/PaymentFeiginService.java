package com.yg.cloud.service;

import com.yg.cloud.entities.CommonResult;
import com.yg.cloud.entities.Payment;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value="CLOUD-PAYMENT")
public interface PaymentFeiginService {
    @GetMapping("/payment/get/{id}")
    public CommonResult <Payment> getPayment(@PathVariable("id") Long id);

    }
