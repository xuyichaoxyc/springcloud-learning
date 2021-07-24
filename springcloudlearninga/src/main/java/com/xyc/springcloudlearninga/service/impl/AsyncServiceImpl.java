package com.xyc.springcloudlearninga.service.impl;

import com.xyc.springcloudlearninga.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName AsyncServiceImpl
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 0:06
 * @Version 1.0
 **/
@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    @Async
    public void saveLog() {
        System.err.println(Thread.currentThread().getName());
    }
}
