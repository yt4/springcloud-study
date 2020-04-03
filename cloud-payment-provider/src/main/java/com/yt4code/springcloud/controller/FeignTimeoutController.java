package com.yt4code.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author yt
 * @date 2020/4/3 10:43
 * 功能说明 OpenFeign超时模拟
 */
@RestController
public class FeignTimeoutController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/feign/timeout")
    public String timeoutTest(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }
}
