package com.taipingyang.entity;

import lombok.Data;

@Data
public class Car {
    private Integer t_id;
    private Integer t_gid;
    private Integer t_uid;
    private Integer t_sum;
    private Integer t_count;
    private Goods goods;
    private User user;
}