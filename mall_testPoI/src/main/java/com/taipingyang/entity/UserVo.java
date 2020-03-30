package com.taipingyang.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("t_users")
public class UserVo extends User {
    @TableField(exist = false)
    private Integer num = 1;
    @TableField(exist = false)
    private Integer size = 5;
}