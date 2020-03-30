package com.taipingyang.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TOrder;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 13:33
 * To change this template use
 */

public  interface TOrderMapper extends BaseMapper<TOrder> {

    List<TOrder> selectLists(TOrder tOrder);

    void inture(Integer order_id);

    void infalse(Integer order_id);

    void addorder(TOrder tOrder);


}
