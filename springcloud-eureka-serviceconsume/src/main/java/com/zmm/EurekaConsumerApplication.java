package com.zmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: YZJ
 * @time: 2021/10/18
 */
@SpringBootApplication
@EnableDiscoveryClient //当前使用eureka的server
//@EnableEurekaClient
public class EurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication.class,args);
    }
}
