package com.icecream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//https://blog.csdn.net/zyb2017/article/details/80220071
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceEurekaRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceEurekaRegisterCenterApplication.class, args);
    }

}
