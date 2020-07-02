package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: PaymentService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2020/7/2 15:24
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
