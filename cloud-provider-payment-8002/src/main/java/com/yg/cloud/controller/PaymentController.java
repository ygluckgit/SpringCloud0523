package com.yg.cloud.controller;

import com.yg.cloud.entities.CommonResult;
import com.yg.cloud.entities.Payment;
import com.yg.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author YGuang
 * @Date 2020/8/21 23:28
 * @Version 1.0
 **/


@RestController
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;
    @Value("${server.port}")
    private String serverport;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        //Enhancer enhance = new Enhancer();
        log.info("***************插入结果： " + payment);
        return result > 0 ? new CommonResult(200, "插入成功 serverport"+serverport, result) : new CommonResult(444, "插入失败", null);

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***************查询结果： " + payment);
        return payment != null ? new CommonResult(200, "查询成功 serverport :  "+serverport , payment) : new CommonResult(444, "无记录哈", null);

    }
    @GetMapping("/payment/getLB")
    public String getLB(){
        System.out.println("myLB is Success"+serverport);
        return serverport;
    }
}