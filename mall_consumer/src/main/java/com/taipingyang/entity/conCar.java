package com.taipingyang.entity;

import lombok.Data;

@Data
public class conCar {
    private Integer t_id;
    private Integer t_gid;
    private Integer t_uid;
    private Integer t_sum;
    private Integer t_count;
    private conGoods goods;
    private conUser user;
}
