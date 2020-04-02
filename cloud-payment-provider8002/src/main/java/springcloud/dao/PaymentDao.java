package springcloud.dao;

import com.yt4code.springcloud.entity.Payment;
import com.yt4code.springcloud.utils.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付表(Payment)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-01 09:47:58
 */
@Mapper
public interface PaymentDao extends BaseMapper<Payment> {

}