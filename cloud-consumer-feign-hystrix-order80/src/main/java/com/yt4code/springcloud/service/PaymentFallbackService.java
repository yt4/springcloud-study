package com.yt4code.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author yt
 * @date 2020/4/7 13:49
 * 功能说明
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {


    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fallback for ok()!------";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "------PaymentFallbackService fallback for timeout()!------";
    }
}
