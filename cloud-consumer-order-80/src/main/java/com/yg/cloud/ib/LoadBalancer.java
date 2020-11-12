package com.yg.cloud.ib;

import lombok.Data;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    ServiceInstance instances (List <ServiceInstance> serviceInstanceList);

}
