package com.yt4code.springcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yt4code.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author yt
 * @date 2020/4/3 15:15
 * 功能说明
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_OK(Integer id){
        return "线程池： " + Thread.currentThread().getName() + "paymentInfo_OK,id: " + id;
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 5;
        try {
            Thread.sleep(timeNumber * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName() + "paymentInfo_Timeout,id: " + id + ",耗时： " + timeNumber + "秒！";
    }


    public String paymentInfo_TimeoutHandler(Integer id){
        return "8001服务端：线程池： " + Thread.currentThread().getName() + "paymentInfo_TimeoutHandler,id: " + id;
    }
}
