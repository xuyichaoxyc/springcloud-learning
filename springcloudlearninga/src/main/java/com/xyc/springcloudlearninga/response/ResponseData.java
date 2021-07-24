package com.xyc.springcloudlearninga.response;

import lombok.Data;

/**
 * @ClassName ResponseData
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/24 23:56
 * @Version 1.0
 **/
@Data
public class ResponseData {
    private Boolean status = true;
    private int code = 200;
    private String message;
    private Object data;
}
