package com.xyc.eurekaclientuserservice.controller;




import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/user/infos")
    public Object serviceUrl() {
        return eurekaClient.getInstancesByVipAddress("eureka-client-user-service", false);
    }

    @GetMapping("/user/infos2")
    public Object serviceUrl2() {
        return discoveryClient.getInstances("eureka-client-user-service");
    }
}
