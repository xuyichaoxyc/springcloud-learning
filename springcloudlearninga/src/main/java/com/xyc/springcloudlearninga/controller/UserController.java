package com.xyc.springcloudlearninga.controller;

import com.xyc.springbootstarterdemo.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 13:54
 * @Version 1.0
 **/
@RestController
public class UserController {
    @Autowired
    private UserClient userClient;
    @GetMapping("/user/name")
    public String getUserName() {
        return userClient.getName();
    }
}
