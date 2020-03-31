package com.taipingyang.service;

import com.taipingyang.entity.TDetail;
import com.taipingyang.mapper.TDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 23:22
 * To change this template use
 */
@Service
public class TDetailService {

    @Autowired
    private TDetailMapper tDetailMapper;

    public Object getById(Integer order_detail_id) {
        return tDetailMapper.selectById(order_detail_id);
    }


    public Object inserdetail(TDetail t) {
        return tDetailMapper.insert(t);
    }
}