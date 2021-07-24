package com.xyc.springcloudlearninga.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserHealthIndicator
 * @Description 扩展健康端点
 * @Author admin-xuyichao
 * @Date 2021/7/24 23:35
 * @Version 1.0
 **/
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {

        // up 方法指定应用的状态为健康
        builder.up().withDetail("status", true);
        // down 方法指定应用的状态为不健康
//        builder.down().withDetail("status", false);
    }
}
