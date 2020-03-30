package com.taipingyang.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 11:47
 * To change this template use
 */
@Data
@TableName("car_type")
public class Type extends Model<Type> {


    private static final long serialVersionUID = 1L;

    @TableId(value = "cartype_id",type = IdType.AUTO)
    private Integer cartype_id;//车辆类型

    private String cartype_name;//类型名称
    private Integer cartype_tyrenumber;//轮胎数量
    private Integer cartype_axle;//轴
    private Integer cartype_deadweight;//官方载重量
    private Integer cartype_displacement;//排量
    private Integer cartype_length;//长度

    @TableField(exist = false)
    private Integer pageNo=1;
    @TableField(exist = false)
    private Integer pageSize=5;

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
