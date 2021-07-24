package com.xyc.springcloudlearninga.controller;

import com.xyc.springcloudlearninga.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AsyncController
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 0:07
 * @Version 1.0
 **/
@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/async")
    public void asynctest() {
        asyncService.saveLog();
    }

}
