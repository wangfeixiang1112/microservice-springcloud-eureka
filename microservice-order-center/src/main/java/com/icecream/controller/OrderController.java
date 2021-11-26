package com.icecream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("getOrder/{orderId}")
    @ResponseBody
    public Map<String,Object> getOrder(@PathVariable("orderId") String orderId){
        System.out.println("订单服务id:"+orderId);
        String[] params = {"wangfeixiang","123456"};
        return restTemplate.getForObject("http://MICROSERVICE-USER-CENTER/user/doLogin/wangfeixiang/123456",Map.class);
    }
}
