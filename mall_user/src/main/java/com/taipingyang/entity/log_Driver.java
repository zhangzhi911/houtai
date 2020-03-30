package com.taipingyang.entity;

import lombok.Data;

@Data
public class log_Driver {
    private Integer driver_id;//司机id
    private Integer car_id;//车辆id
    private String driver_account;//账号
    private String driver_password;//密码
    private String driver_name;//名字
    private Integer driver_age;//年龄
    private Integer driver_gender;//性别
    private Integer driver_ifforbidden;//判断是否被禁用
    private String driver_headportrait;//头像
    private String driver_phonenumber;//手机号
    private String driver_mailbox;//邮箱
    private Integer driver_status;//身份
    private Integer driver_level;//驾照等级
}