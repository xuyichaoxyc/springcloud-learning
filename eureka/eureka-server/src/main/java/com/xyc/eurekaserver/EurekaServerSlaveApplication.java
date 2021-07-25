package com.xyc.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication
public class EurekaServerSlaveApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "slave");
        SpringApplication.run(EurekaServerSlaveApplication.class, args);
    }

}
