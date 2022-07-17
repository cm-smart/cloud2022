package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaProviderPayment9104Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9104Application.class,args);
    }
}
