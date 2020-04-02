package com.yt4code.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yt
 * @date 2020/4/2 15:31
 * 功能说明
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class,args);
    }
}
