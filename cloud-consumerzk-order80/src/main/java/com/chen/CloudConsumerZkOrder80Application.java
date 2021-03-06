package com.chen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerZkOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerZkOrder80Application.class,args);
        System.out.println("启动成功");
    }
}
