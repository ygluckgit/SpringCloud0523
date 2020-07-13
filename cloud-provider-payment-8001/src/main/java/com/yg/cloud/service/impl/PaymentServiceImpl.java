package com.yg.cloud.service.impl;

import com.yg.cloud.dao.PaymentDao;
import com.yg.cloud.entities.Payment;
import com.yg.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author YGuang
 * @Date 2020/5/23 20:47
 * @Version 1.0
 **/

@Service
public class PaymentServiceImpl implements PaymentService {
    /*  @Resource
      private PaymentDao paymentDao;*/
    private final PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

