package com.yg.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author YGuang
 * @Date 2020/9/19 22:57
 * @Version 1.0
 **/

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
