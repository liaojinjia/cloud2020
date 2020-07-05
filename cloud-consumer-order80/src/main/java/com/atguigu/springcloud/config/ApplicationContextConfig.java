package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: ApplicationContextConfig
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2020/7/2 23:55
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
