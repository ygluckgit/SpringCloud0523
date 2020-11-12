package com.yg.cloud.ib;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName MyLb
 * @Description TODO
 * @Author YGuang
 * @Date 2020/9/11 21:45
 * @Version 1.0
 **/

@Component
public class MyLb implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement() {
        int current;
        int next;
        //自旋锁的实现
        do {
            current = this.atomicInteger.get();
            //防止越界
            next = current >= 214743647 ? 0 : current + 1;

        } while (!this.atomicInteger.compareAndSet(current, next));
        return next;
    }


    @Override
    public ServiceInstance instances(List <ServiceInstance> serviceInstanceList) {
        int index = getAndIncrement() % serviceInstanceList.size();


        return serviceInstanceList.get(index);
    }
}
