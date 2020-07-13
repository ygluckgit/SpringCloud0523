package com.yg.cloud.dao;

import com.yg.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentDao
 * @Description TODO
 * @Author YGuang
 * @Date 2020/5/23 20:33
 * @Version 1.0
 **/


/*@Repository* 插入可能有问题/
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}