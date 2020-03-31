package com.taipingyang.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TDriver;

import java.util.List;


/**
 * <p>
 * 普通用户 Mapper 接口
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
public interface TCarMapper extends BaseMapper<TCar> {

    void addCar(TCar tCar);
}
