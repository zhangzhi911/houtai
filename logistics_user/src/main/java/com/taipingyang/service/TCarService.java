package com.taipingyang.service;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taipingyang.entity.TCar;
import com.taipingyang.mapper.TCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 普通用户 Mapper 接口
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
@Service
public class TCarService {

    @Autowired
    private TCarMapper tCarMapper;
    public void addCar(TCar tCar){
        tCarMapper.addCar(tCar);
    }
}
