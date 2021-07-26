package com.xyc.eurekaclientuserservice.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @ClassName CustomHealthIndicator
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/26 9:31
 * @Version 1.0
 **/
@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("status", true);
    }
}
