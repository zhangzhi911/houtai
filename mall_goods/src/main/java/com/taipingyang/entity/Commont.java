package com.taipingyang.entity;

import lombok.Data;

import java.util.List;


@Data
public class Commont {
    private Integer id;
    private Integer parent_id;
    private String content;
    private String rank;
    private Integer hist;
    private Integer user_id;
    private User user;
    private Integer flag;
    private Integer good_id;
    private List<Commont> commontList;
}