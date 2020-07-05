package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: OrderController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2020/7/2 23:29
 */
@Slf4j
@RestController
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    /*
    * http://localhost/consumer/payment/create?serial=111
    * */
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        log.info("**********消费者模块创建支付"+payment);
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }


    /**
     * 消费模块调用支付模块查询
     * @param  id
     * @return CommonResult
     * http://localhost/consumer/payment/get/32
     * @Date 2020/7/3 0:36
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.info("**********消费者模块查询"+id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
