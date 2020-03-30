package com.taipingyang.entity;

import lombok.Data;

@Data
public class conAddress {
    private Integer t_id;
    private String t_name;
    private String t_address;
    private Integer user_id;
    private conUser user;
    private Integer flag;
    private Integer t_phone;

}
