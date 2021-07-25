package com.xyc.springcloudlearninga.util;

import java.util.Random;

/**
 * @ClassName ServerPortUtils
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 13:04
 * @Version 1.0
 **/
public class ServerPortUtils {

    public static int getAvailablePort() {
        int max = 65535;
        int min = 2000;

        Random random = new Random();

        int port = random.nextInt(max)%(max-min+1) + min;
        boolean using = NetUtils.isLocalPortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }
    }
}
