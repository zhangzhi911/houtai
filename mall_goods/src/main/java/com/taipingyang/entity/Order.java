package com.taipingyang.entity;

import lombok.Data;

@Data
public class Order {
    private Integer t_id;
    private Integer t_gid;
    private Integer t_uid;
    private String t_sum;
    private Integer t_count;
    private String t_way;
    private String t_message;
    private Goods goods;
    private User user;
}
