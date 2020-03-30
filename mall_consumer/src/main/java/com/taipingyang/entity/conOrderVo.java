package com.taipingyang.entity;

import lombok.Data;

@Data
public class conOrderVo extends conOrder {

    private Integer pageNum = 1;
    private Integer pageSize = 5;
}
