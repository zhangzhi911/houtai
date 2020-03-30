package com.taipingyang.entity;

import lombok.Data;

import java.util.List;

@Data
public class conMytype {
    private Integer type_id;
    private Integer parent_id;
    private String label;
    private List<conMytype> children;
}