package com.yt4code.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yt4code.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yt
 * @date 2020/4/3 15:40
 * 功能说明
 */
@RestController
@Slf4j
public class OrderController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @HystrixCommand(fallbackMethod = "fallbackMethod" ,commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_Timeout(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_Timeout(id);
    }

    public String fallbackMethod(Integer id){
        return "80客户端：线程池： " + Thread.currentThread().getName() + "paymentInfo_TimeoutHandler,id: " + id;
    }
}
