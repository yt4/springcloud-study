package com.yt4code.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yt
 * @date 2020/4/3 14:05
 * 功能说明
 */
@RestController
public class OrderController {
    public static final String INVOKE_URI = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String orderZK(){
        return restTemplate.getForObject(INVOKE_URI + "/payment/zk",String.class);
    }
}
