package com.taipingyang.entity;

import lombok.Data;

@Data
public class conGoods {
    private Integer t_gid;
    private String t_name;
    private String t_brand;
    private String t_document;
    private String t_price;
    private String t_image;
    private Integer t_delete;
    private Integer t_number;
    private Integer t_std;
    private String t_color;
    private Integer t_sales;
    private Integer t_type_id;
    private conTypes Types;
}
