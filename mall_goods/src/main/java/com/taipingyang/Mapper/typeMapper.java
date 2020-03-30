package com.taipingyang.Mapper;

import com.taipingyang.entity.Mytype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface typeMapper {
    public List<Mytype> typelist();

    public int insertType(Mytype type);

    public int updateType(Mytype type);

    public int deleteType(Integer type_id);
}
