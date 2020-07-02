package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static java.awt.SystemColor.info;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: PaymentController
 * @Description:
 * @Author: Administrator
 * @Date: 2020/7/2 15:29
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 新增
     * @param  payment:
     * @return CommonResult
     * @Date 2020/7/2 17:18
     * http://localhost:8001/payment/create?serial=atguigu002
     */
    @PostMapping(value = "/payment/create") //浏览器不支持Post请求，用postman模拟
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果:" +result);

        if(result > 0) {
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(200,"插入失败",null);
        }
    }
    /**
     *
     * 查询
     * @param  id :
     * @return CommonResult
     * http://localhost:8001/payment/get/32
     * @Date 2020/7/2 17:20
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id ) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*******插入结果"+ payment);
        if(payment != null) {
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(200,"没有查询记录，查询Id:"+id,null);
        }
    }
}
