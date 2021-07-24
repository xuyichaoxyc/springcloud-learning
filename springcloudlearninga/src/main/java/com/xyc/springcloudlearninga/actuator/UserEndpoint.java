package com.xyc.springcloudlearninga.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserEndpoint
 * @Description 自定义端点
 * @Author admin-xuyichao
 * @Date 2021/7/24 23:41
 * @Version 1.0
 **/
@Endpoint(id = "user")
@Component
public class UserEndpoint {

    @ReadOperation
    public List<Map<String, Object>> health() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1001);
        map.put("userName", "xyc");
        list.add(map);
        return list;
    }
}
