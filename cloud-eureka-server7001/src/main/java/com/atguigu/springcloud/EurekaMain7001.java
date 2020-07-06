package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: EurekaMain7001
 * @Description: http://localhost/7001
 * @Author: Administrator
 * @Date: 2020/7/6 0:25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
