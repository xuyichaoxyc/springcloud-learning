package com.xyc.springbootstarterdemo.config;

import com.xyc.springbootstarterdemo.client.UserClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName UserAutoConfigure
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 13:44
 * @Version 1.0
 **/
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {

    @Bean
    @ConditionalOnProperty(prefix = "spring.user", value = "enabled", havingValue = "true")
    UserClient userClient(UserProperties userProperties) {
        return new UserClient(userProperties);
    }
}
