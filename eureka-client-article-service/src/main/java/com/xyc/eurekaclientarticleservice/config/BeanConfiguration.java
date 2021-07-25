package com.xyc.eurekaclientarticleservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName BeanConfiguration
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 16:04
 * @Version 1.0
 **/
@Configuration
public class BeanConfiguration {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
