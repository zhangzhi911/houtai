package com.taipingyang.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Ordersdetails {


    /**
     * 明细id
     */
    private Integer id;

    /**
     * 订单状态
     */
    private Integer detailsStatus=1;

    /**
     * 买家id
     */
    private Integer BuyOrderId;

    /**
     * 卖家订单id
     */
    private Integer salesorderID=1;

    /**
     * 虽有商品外键但商品如下架的话显示为失效
     */
    private Integer t_gid;

    /**
     * 商品名称
     */
    private String t_name;

    /**
     * 数量
     */
    private Integer num=0;

    /**
     * 单价
     */
    private Integer t_price;

    /**
     * 商品状态
     */
    private Integer flag=1;

    /**
     * 品牌
     */
    private String t_brand;
    private String t_image;

    /**
     * 类型
     */
    private String type="商品";

    /**
     * 规格参数
     */
    private Integer t_sales;

    /**
     * 物流单号
     */
    private String logistics="4964919161";

    /**
     * 0、1/2逻辑删除
     */
    private Integer valid=1;

    /**
     * 描述信息
     */
    private String t_document;

    /**
     * 创建时间
     */
    private Date createDate=new Date();

    /**
     * 备注信息
     */
    private String remark="物流会尽快发出";
    /**
     * 创建时间
     */
    private Date createDate2=new Date();
    /**
     * 收货人
     */
    private String tName2;
    /**
     * 联系方式
     */
    private String tPhone;
    /**
     * 修改人
     */
    private String updateUser="无修改";
}