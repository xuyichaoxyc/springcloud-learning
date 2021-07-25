package com.xyc.eurekaclientarticleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ArticleController
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 16:05
 * @Version 1.0
 **/
@RestController
public class ArticleController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/article/callHello")
    public String callHello() {
        return restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
    }

    @GetMapping("/article/callHello2")
    public String callHello2() {
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }
}
