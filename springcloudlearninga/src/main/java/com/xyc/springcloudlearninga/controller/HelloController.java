package com.xyc.springcloudlearninga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/24 21:53
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @GetMapping("/hello")
    public String hello() {
//        return "hello";
        String port = env.getProperty("server.port");
        return port;
    }
}