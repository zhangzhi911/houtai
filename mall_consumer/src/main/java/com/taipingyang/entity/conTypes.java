package com.taipingyang.entity;

import lombok.Data;

import java.util.List;

@Data
public class conTypes {

    private Integer type_id;
    private Integer parent_id;
    private String type_name;
    private List<conTypes> typeslist;
}
