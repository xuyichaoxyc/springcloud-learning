package com.xyc.springbootstarterdemo.client;

import com.xyc.springbootstarterdemo.config.UserProperties;

/**
 * @ClassName UserClient
 * @Description 客户端，相当于MongoTemplate
 * @Author admin-xuyichao
 * @Date 2021/7/25 13:41
 * @Version 1.0
 **/

public class UserClient {

    private UserProperties userProperties;

    public UserClient() {

    }

    public UserClient(UserProperties properties) {
        this.userProperties = properties;
    }

    public String getName() {
        return userProperties.getName();
    }
}
