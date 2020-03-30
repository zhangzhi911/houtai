package com.taipingyang.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 19:47
 * To change this template use
 */

@Data
@TableName("t_car")
public class TCar extends Model<TCar> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "car_id", type = IdType.AUTO)

    private Integer car_id;//车辆id
    private String car_name;//车辆名称
    private Integer car_grade;//车辆等级
    private Integer car_type;//车辆类型
    private Integer car_durableyears;//车辆使用年限
    private String car_colour;//颜色
    private Integer car_annualinspection;//年检
    private String car_maximum;//最大载重
    private String car_weight;//重量
    private String car_length;//长度
    private String car_positionx;//车辆位置x
    private String car_positiony;//车辆位置y
    private String car_price;//运送价格
    private String car_licenseplatenumber;//车牌号
    private Integer car_ifunused;//是否闲置
    private String car_remark;//备注

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
