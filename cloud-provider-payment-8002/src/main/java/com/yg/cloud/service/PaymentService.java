package com.yg.cloud.service;

import com.yg.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author YGuang
 * @Date 2020/5/23 20:46
 * @Version 1.0
 **/


public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}