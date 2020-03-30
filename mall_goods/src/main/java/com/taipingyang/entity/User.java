package com.taipingyang.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    private Integer userId;//用户id
    private String user_name;//用户名
    private String user_password;//密码
    private String sex;//用户性别
    private String age;//用户年龄
    private String permiss;//用户权限
    BigDecimal b = new BigDecimal(0);
    private BigDecimal money;//用户余额
    private String photo;//图片
    private Integer userFlag;//1商家 2用户0管理员3异常
    private String address;//地址
}
