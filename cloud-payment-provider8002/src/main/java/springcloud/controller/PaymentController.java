package springcloud.controller;

import com.yt4code.springcloud.entity.Payment;
import com.yt4code.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * 支付表(Payment)表控制层
 *
 * @author makejava
 * @since 2020-04-01 09:48:01
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("-------插入结果：{}------",result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功,port: " + port,result);
        }else{
            return new CommonResult(999,"插入数据库失败",null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getById(@PathVariable("id") Long id){
        Payment payment = paymentService.getById(id);
        log.info("-------查询结果：{}------",payment);
        if(payment != null ){
            return new CommonResult(200,"查询成功,port: " + port,payment);
        }else{
            return new CommonResult(999,"查询失败，ID: "+id ,null);
        }
    }

}