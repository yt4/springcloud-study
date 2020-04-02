package com.yt4code.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yt
 * @date 2020/4/2 16:35
 * 功能说明
 */
@Configuration
public class MySelfRule  {

    @Bean
    public IRule getRandomRule(){
        return new RandomRule();
    }
}
