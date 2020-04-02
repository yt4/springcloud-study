package springcloud.service;

import com.yt4code.springcloud.entity.Payment;

/**
 * 支付表(Payment)表服务接口
 *
 * @author makejava
 * @since 2020-04-01 09:47:59
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getById(Long id);
}