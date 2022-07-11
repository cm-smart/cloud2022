package com.chen.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    ServiceInstance select(List<ServiceInstance> serviceInstances);
}
