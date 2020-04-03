package com.yt4code.springcloud.service;

/**
 * @author yt
 * @date 2020/4/3 15:15
 * 功能说明
 */
public interface PaymentService {
    String paymentInfo_OK(Integer id);

    String paymentInfo_Timeout(Integer id);
}
