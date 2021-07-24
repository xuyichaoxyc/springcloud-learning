package com.xyc.springcloudlearninga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringcloudlearningaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudlearningaApplication.class, args);
    }

}
