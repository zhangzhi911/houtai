package com.taipingyang.entity;

import lombok.Data;

@Data
public class OrderVo extends  Order{

    private Integer pageNum=1;
    private Integer pageSize=5;
}
