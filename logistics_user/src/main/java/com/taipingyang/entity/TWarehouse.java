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
 * Time: 16:06
 * To change this template use
 */

@Data
@TableName("t_warehouse")
public class TWarehouse extends Model<TWarehouse> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "warehouse_id", type = IdType.AUTO)
    private Integer warehouse_id;//仓库



    private String warehouse_name;//仓库名称
    private String warehouse_type;//仓库类型
    private String warehouse_floorspace;//占地面积
    private String warehouse_address;//仓库地址
    private Integer order_id;//订单外键



    @TableField(exist = false)
    private Integer pageNo = 1;
    @TableField(exist = false)
    private Integer pageSize = 5;
    @TableField(exist = false)
    private List<TOrder> orderList;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
