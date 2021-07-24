package com.xyc.springcloudlearninga.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyConfig
 * @Description 自定义配置类
 * @Author admin-xuyichao
 * @Date 2021/7/24 22:05
 * @Version 1.0
 **/
@ConfigurationProperties(prefix = "com.xyc.config")
@Component
@Data
public class MyConfig {
    private String name;
}
