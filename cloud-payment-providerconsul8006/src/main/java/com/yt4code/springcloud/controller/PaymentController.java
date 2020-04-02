package com.yt4code.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author yt
 * @date 2020/4/2 15:25
 * 功能说明
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return "springcloud with consul : " + UUID.randomUUID();
    }
}
