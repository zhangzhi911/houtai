package com.taipingyang.entity;


import java.io.Serializable;


import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

/**
 * <p>
 * 普通用户
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
@Data
@TableName("t_user")
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id",type = IdType.AUTO)
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

    @TableField(exist = false)
    private Integer pageNo=1;
    @TableField(exist = false)
    private Integer pageSize=5;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
