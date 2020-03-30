package com.taipingyang.Mapper;

import com.taipingyang.entity.Commont;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommontMapper {
    public List<Commont> getList(Commont commont);
}