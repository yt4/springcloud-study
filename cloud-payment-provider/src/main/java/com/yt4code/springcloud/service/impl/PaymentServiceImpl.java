package com.yt4code.springcloud.service.impl;

import com.yt4code.springcloud.dao.PaymentDao;
import com.yt4code.springcloud.entity.Payment;
import com.yt4code.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 支付表(Payment)表服务实现类
 *
 * @author makejava
 * @since 2020-04-01 09:48:00
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.insertSelective(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentDao.selectByPrimaryKey(id);
    }
}