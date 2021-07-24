package com.xyc.springcloudlearninga.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName AsyncTaskExecutePool
 * @Description TODO
 * @Author admin-xuyichao
 * @Date 2021/7/25 0:13
 * @Version 1.0
 **/
@Configuration
public class AsyncTaskExecutePool implements AsyncConfigurer {

    private Logger log = LoggerFactory.getLogger(AsyncTaskExecutePool.class);

    @Autowired
    private TaskThreadPoolConfig config;

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(config.getCorePoolSize());
        executor.setMaxPoolSize(config.getMaxPoolSize());
        executor.setQueueCapacity(config.getQueueCapacity());
        executor.setKeepAliveSeconds(config.getKeepAliveSeconds());
        executor.setThreadNamePrefix(config.getThreadNamePrefix());
        executor.setRejectedExecutionHandler(
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        // 异步任务中异常处理
        return new AsyncUncaughtExceptionHandler() {
            @Override
            public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
                log.error("=============" +
                        throwable.getMessage() +
                        "================", throwable);
                log.error("exception method: ", method.getName());
            }
        };
    }
}
