package com.taipingyang.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TDriver;
import com.taipingyang.entity.TOrder;

import java.util.List;


/**
 * <p>
 * 普通用户 Mapper 接口
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
public interface TDriverMapper extends BaseMapper<TDriver> {

    List<TDriver> selectLists(TDriver tDriver);


    void inture(Integer driver_id);

    void infalse(Integer driver_id);

    void addDriver(TDriver tDriver);
}
