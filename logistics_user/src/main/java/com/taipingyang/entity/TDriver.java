package com.taipingyang.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 11:25
 * To change this template use
 */
@Data
@TableName("t_driver")
public class TDriver extends Model<TDriver> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "driver_id", type = IdType.AUTO)
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

    @TableField(exist = false)
    private Integer pageNo = 1;
    @TableField(exist = false)
    private Integer pageSize = 5;
    @TableField(exist = false)
    private List<TCar> carList;



    @Override
    protected Serializable pkVal() {
        return null;
    }
}