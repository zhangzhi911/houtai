package com.taipingyang.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;//用户id
    private String user_name;//用户名
    private String user_password;//密码

    @TableField("user_sex")
    private String sex;//用户性别
    @TableField("user_age")
    private String age;//用户年龄
    @TableField("user_permiss")
    private String permiss;//用户权限
    @TableField(exist = false)
    BigDecimal b = new BigDecimal(0);
    @TableField("user_money")
    private BigDecimal money;//用户余额
    @TableField("user_photo")
    private String photo;//图片

    @TableField("user_flag")
    private Integer userFlag;//1商家 2用户0管理员3异常

    @TableField("user_address")
    private String address;//地址
}