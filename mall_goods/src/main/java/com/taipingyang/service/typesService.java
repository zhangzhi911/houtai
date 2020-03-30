package com.taipingyang.service;

import com.taipingyang.Mapper.goodMapper;
import com.taipingyang.Mapper.typeMapper;
import com.taipingyang.entity.Mytype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class typesService {

    @Autowired
    private com.taipingyang.Mapper.typeMapper typeMapper;

    public List<Mytype> typelist() {
        return typeMapper.typelist();
    }

    public int insertType(Mytype type) {
        return typeMapper.insertType(type);
    }

    public int updateType(Mytype type) {
        return typeMapper.updateType(type);
    }

    public int deleteType(Integer type_id) {
        return typeMapper.deleteType(type_id);
    }


}
