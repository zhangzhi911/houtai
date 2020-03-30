package com.taipingyang.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserVo extends User {
    private Integer num = 1;
    private Integer size = 5;
}