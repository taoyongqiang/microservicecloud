package com.tao.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRule
 * @Description
 * @Author tyq
 * @Date 2020-05-15 3:00
 * @Version V1.0
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myrule () {
        // Ribbon默认是轮询，可自定义
        return new RandomRule();
    }
}
