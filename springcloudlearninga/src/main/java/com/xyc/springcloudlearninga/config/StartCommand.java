package com.xyc.springcloudlearninga.config;

import com.xyc.springcloudlearninga.util.ServerPortUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @ClassName StartCommand
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 12:58
 * @Version 1.0
 **/
public class StartCommand {

    private Logger logger = LoggerFactory.getLogger(StartCommand.class);

    public StartCommand(String[] args) {

        Boolean isServer = false;
        String serverPort = "";
        if (args != null) {
            for (String arg : args) {
                if (StringUtils.hasText(arg) && arg.startsWith("--server.port")) {
                    isServer = true;
                    serverPort = arg;
                    break;
                }
            }
        }

        if (!isServer) {
            int port = ServerPortUtils.getAvailablePort();
            logger.info("current server.port=" + port);
            System.setProperty("server.port", String.valueOf(port));
        } else {
            logger.info("current server.port=" + serverPort.split("=")[1]);
            System.setProperty("server.port", serverPort.split("=")[1]);
        }
    }
}
