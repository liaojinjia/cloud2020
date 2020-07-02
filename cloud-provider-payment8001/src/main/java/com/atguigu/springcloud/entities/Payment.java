package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version v1.0
 * @ProjectName: cloud2020
 * @ClassName: Payment
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2020/7/2 14:14
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id; //Long对应数据库bigInt
    private String serial;
}
