package com.xyc.springbootstarterdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName UserProperties
 * @Description 配置类，类似于spring.data.mongo这种形式
 * @Author admin-xuyichao
 * @Date 2021/7/25 13:39
 * @Version 1.0
 **/
@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {
    private String name;
}
