package com.yt4code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yt
 * @date 2020/4/3 13:50
 * 功能说明
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PaymentZKMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZKMain8004.class,args);
    }
}
