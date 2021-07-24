package com.xyc.springcloudlearninga.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TaskThreadPoolConfig
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 0:09
 * @Version 1.0
 **/
@Configuration
@ConfigurationProperties(prefix = "spring.task.pool")
@Data
public class TaskThreadPoolConfig {

    // 核心线程数
    private int corePoolSize = 5;

    // 最大线程数
    private int maxPoolSize = 50;

    // 线程池维护线程所允许的空闲时间
    private int keepAliveSeconds = 60;

    // 队列长度
    private int queueCapacity = 10000;

    // 线程名称前缀
    private String threadNamePrefix = "FSH-AsyncTask-";
}
