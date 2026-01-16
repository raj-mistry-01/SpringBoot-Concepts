package com.raj.learningSpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AppConfig {

//    @Bean
//    public ExtrernalConfig_Demo create(){
//        System.out.println("Intializing with custom config");
//        return  new ExtrernalConfig_Demo("defaultUsername");
//    }

    @Bean(name = "myThreadPoolExecutor")
    public Executor taskPoolExecutor(){

        int minPoolSize = 2;
        int maxPoolSize = 4;
        int queueSize = 3;

        ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        poolTaskExecutor.setCorePoolSize(minPoolSize);
        poolTaskExecutor.setMaxPoolSize(maxPoolSize);
        poolTaskExecutor.setQueueCapacity(queueSize);
        poolTaskExecutor.setThreadNamePrefix("mythreadfactory-");
        poolTaskExecutor.initialize();
        return poolTaskExecutor;
    }
}
