package com.xyc.eurekaclientuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 15:46
 * @Version 1.0
 **/
@RestController
public class UserController {
    @GetMapping("/user/hello")
    public String hello() {
        return "hello";
    }
}
