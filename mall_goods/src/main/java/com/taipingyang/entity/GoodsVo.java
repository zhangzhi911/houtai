package com.taipingyang.entity;

import lombok.Data;

@Data
public class GoodsVo extends Goods {
    private Integer cpt1;
    private Integer cpt2;

    private Integer pageNum=1;
    private Integer pageSize=5;

}
