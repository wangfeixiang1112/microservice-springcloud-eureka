package com.icecream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//https://blog.csdn.net/zyb2017/article/details/80220071
@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceUserCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceUserCenterApplication.class, args);
    }

}
