package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: OrderMain80
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2020/7/2 23:22
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
