package com.taipingyang.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Goods implements Serializable {
    private Integer t_gid;
    private String t_name;
    private String t_brand;
    private String t_document;
    private String t_image;
    private Integer t_delete;
    private String t_price;
    private Integer t_number;
    private Integer t_std;
    private String t_color;
    private Integer t_sales;
    private Integer t_type_id;
    private Mytype Types;
}
