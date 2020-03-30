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
 * Time: 13:23
 * To change this template use
 */
@Data
@TableName("t_order")
public class TOrder extends Model<TOrder> implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer order_id;//订单id
    private String order_departure;//出发地
    private String order_destination;//到达地
    private String order_latest;//最迟到达时间
    private String order_cargotype;//货物类型
    private String order_weight;//货物重量
    private String order_volume;//体积
    private String order_linkmanphone;//联系电话
    private String order_linkmanname;//联系人姓名
    private String order_creationtime;//创建订单时间
    private String order_modifytime;//修改订单时间
    private Integer user_id;//用户外键
    private Integer order_isverify;//审核状态
    private Integer order_detail;//订单明细id
    private String order_reason;//备注（驳回原因）
    private Integer cartype_id;//车辆类型

    @TableField(exist = false)
    private Integer pageNo = 1;
    @TableField(exist = false)
    private Integer pageSize = 5;


    @TableField(exist = false)
    private List<TUser> userList;

    @TableField(exist = false)
    private List<TCar> carList;

    @TableField(exist = false)
    private List<TDetail> detailList;

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
