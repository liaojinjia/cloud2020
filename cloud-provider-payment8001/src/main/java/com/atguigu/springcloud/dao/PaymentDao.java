package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: PaymentDao
 * @Description: 支付Dao
 * @Author: Administrator
 * @Date: 2020/7/2 14:59
 */
@Mapper
public interface PaymentDao {
    /**
     * 插入数据
     * @Date 2020/7/2 17:22
     */
    public int create(Payment payment);
    /**
     * 根据id查询
     * @Date 2020/7/2 17:22
     */
    public Payment getPaymentById(@Param("id") Long id);
}
