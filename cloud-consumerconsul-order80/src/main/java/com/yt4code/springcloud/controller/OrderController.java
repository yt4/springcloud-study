package com.yt4code.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yt
 * @date 2020/4/2 15:32
 * 功能说明
 */
@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String orderConsul(){
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul",String.class);
    }
}
