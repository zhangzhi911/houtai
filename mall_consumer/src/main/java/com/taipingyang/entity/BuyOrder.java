package com.taipingyang.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BuyOrder {

    private List<Ordersdetails> goods;
    /**
     * 买家id
     */
    private Integer id;

    /**
     * 下单时间
     */
    private Date oCreatedate=new Date();

    /**
     * 订单状态
     */
    private Integer flag=1;


    /**
     * 订单总数量
     */
    private Integer num;

    /**
     * 支付状态
     */
    private Integer oPayStatus=1;

    /**
     * 支付方式
     */
    private String Payment;

    /**
     * 支付渠道
     */
    private String oPayCahnnel="第三方付款";

    /**
     * 支付时间
     */
    private Date o_pay_time=new Date();

    /**
     * 用户Id
     */
    private Integer user_id;

    /**
     * 是否开发票
     */
    private String fapiao;

    /**
     * 有无赠品
     */
    private String complimentary="无";

    /**
     * 运费险
     */
    private String freight="有";

    /**
     * 折扣价
     */
    private String discount="200";

    /**
     * 实际价格
     */
    private String totalPrice;

    /**
     * 抵扣价格
     */
    private String youhuiPrice;

    /**
     * 优惠卷
     */
    private String discounts="太平洋优惠等";

    /**
     * 收货地址
     */
    private String t_address;

    /**
     * 物流信息
     */
    private String tMessage="会员尽快会安排送货";

    /**
     * 是否有效
     */
    private String valid="是";

    /**
     * 备注信息
     */
    private String remark="会员尽快发货";

    /**
     * 创建时间
     */
    private Date createDate=new Date();

    /**
     * 收货人
     */
    private String t_name;

    /**
     * 联系人
     */
    private String t_phone;

    /**
     * 修改人
     */
    private String updateUser="无修改";

}
