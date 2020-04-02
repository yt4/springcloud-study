package springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yt
 * @date 2020/4/2 16:58
 * 功能说明 演示自定义负载均衡算法
 */
@RestController
public class LBController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/lb")
    public String getLBPayment(){
        return "本次请求端口: " + port;
    }
}
