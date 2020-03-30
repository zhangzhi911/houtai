package com.taipingyang.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class log_user implements Serializable {
    private Integer user_id;//普通用户id
    private String user_account;//账号
    private String user_password;//密码
    private String user_name;//名字
    private Integer user_age;//年龄
    private Integer user_gender;//性别
    private Integer user_ifforbidden;//判断是否被禁用
    private String user_headportrait;//头像
    private String user_phonenumber;//手机号
    private String user_mailbox;//邮箱
    private Integer user_status;//身份


}