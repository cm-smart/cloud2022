package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9101Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9101Application.class,args);
    }
}
