package com.icecream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//https://blog.csdn.net/zyb2017/article/details/80220071
@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceOrderCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOrderCenterApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
