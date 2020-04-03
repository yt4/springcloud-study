package com.yt4code.springcloud.controller;

import com.yt4code.springcloud.service.PaymentFeignService;
import com.yt4code.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author yt
 * @date 2020/4/3 10:03
 * 功能说明
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}",produces = { "application/json;charset=UTF-8" })
    public CommonResult getById(@PathVariable("id") Long id){
        return paymentFeignService.getById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String timeoutTest(){
        return paymentFeignService.timeoutTest();
    }
}
