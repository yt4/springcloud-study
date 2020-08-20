package com.yt4code.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * @date 2020/8/20 17:17
 * 功能说明
 */
@Configuration
public class gateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        // 相当于yml配置中的routes属性
        routes.route("custom_routh", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("custom_routh2",r -> r.path("/cloudStudy").uri("https://www.bilibili.com/video/BV18E411x7eT?p=70")).build();
        return routes.build();
    }

}
