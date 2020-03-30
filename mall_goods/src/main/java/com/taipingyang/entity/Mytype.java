package com.taipingyang.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class Mytype implements Serializable  {
    private Integer type_id;
    private Integer parent_id;
    private String label;
    private List<Mytype> children;
}