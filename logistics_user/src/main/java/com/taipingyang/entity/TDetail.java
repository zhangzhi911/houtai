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
 * Time: 13:29
 * To change this template use
 */

@Data
@TableName("order_detail")
public class TDetail extends Model<TDetail> {


    private static final long serialVersionUID = 1L;

    @TableId(value = "order_detail_id", type = IdType.AUTO)
    private Integer order_detail_id;//订单明细id
    private String order_detail_departure;//出发地
    private String order_detail_destination;//到达地
    private String order_detail_addressx;//地址x
    private String order_detail_addressy;//地址y
    private String order_detail_ifarrive;//是否到达
    private String order_detail_drivername;//司机姓名
    private String order_detail_driverphone;//司机电话
    private String order_detail_driverpicture;//车辆照片
    private String order_detail_licenseplatenumber;//车牌号
    private Integer cartype_id;//车辆类型
    private String order_detail_maximum;//最大载重
    private Double order_detail_freightinsurance;//运费险

    @TableField(exist = false)
    private Integer pageNo = 1;
    @TableField(exist = false)
    private Integer pageSize = 5;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
