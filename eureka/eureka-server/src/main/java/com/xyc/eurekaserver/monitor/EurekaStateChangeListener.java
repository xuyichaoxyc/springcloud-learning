package com.xyc.eurekaserver.monitor;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName EurekaStateChangeListener
 * @Description 服务上下线监控
 * @Author admin-xuyichao
 * @Date 2021/7/26 9:36
 * @Version 1.0
 **/
@Component
public class EurekaStateChangeListener {

    /**
     * @Author xuyichao
     * @Description TODO 服务下线通知
     * @Date 2021/7/26 9:41
     * @param event
     * @return void
     **/
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务下线");
    }

    /**
     * @Author xuyichao
     * @Description TODO 服务注册通知
     * @Date 2021/7/26 9:42
     * @param event
     * @return void
     **/
    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.err.println(instanceInfo.getAppName() + " 进行注册 ");
    }

    /**
     * @Author xuyichao
     * @Description TODO 服务进行续约
     * @Date 2021/7/26 9:43
     * @param event
     * @return void
     **/
    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 服务进行续约");
    }

    /**
     * @Author xuyichao
     * @Description TODO 注册中心启动
     * @Date 2021/7/26 9:44
     * @param event
     * @return void
     **/
    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.err.println("注册中心启动");
    }

    /**
     * @Author xuyichao
     * @Description TODO Eureka Server 启动
     * @Date 2021/7/26 9:45
     * @param event
     * @return void
     **/
    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        System.err.println("Eureka Server 启动");
    }
}
