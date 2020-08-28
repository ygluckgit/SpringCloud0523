package com.yg.cloud.dao;

import com.yg.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description TODO
 * @Author YGuang
 * @Date 2020/8/21 23:32
 * @Version 1.0
 **/


@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}