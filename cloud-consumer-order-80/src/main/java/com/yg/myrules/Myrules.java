package com.yg.myrules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName Myrules
 * @Description TODO
 * @Author YGuang
 * @Date 2020/8/29 1:08
 * @Version 1.0
 **/

@Configuration
public class Myrules {
    @Bean
    public IRule myRule(){
        //随机算法
        return new RandomRule();
    }
}
