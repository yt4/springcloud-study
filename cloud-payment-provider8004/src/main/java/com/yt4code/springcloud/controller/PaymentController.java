package com.yt4code.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yt
 * @date 2020/4/3 13:51
 * 功能说明
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/zk")
    public String paymentZK(){
        return "springcloud with zookeeper: " + port + "\t" + UUID.randomUUID().toString();
    }
}
