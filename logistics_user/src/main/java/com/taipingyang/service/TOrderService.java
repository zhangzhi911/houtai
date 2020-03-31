package com.taipingyang.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TOrder;
import com.taipingyang.mapper.TOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 普通用户 服务实现类
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
@Service
public class TOrderService {

    @Autowired
    private TOrderMapper tOrderMapper;


    public PageInfo<TOrder> selectLists(TOrder tOrder) {
        PageHelper.startPage(tOrder.getPageNo(), tOrder.getPageSize());
        EntityWrapper<TOrder> wrapper = new EntityWrapper<TOrder>();

        List<TOrder> list = tOrderMapper.selectLists(tOrder);
        return new PageInfo<TOrder>(list);
    }


    public void inture(Integer order_id) {
        tOrderMapper.inture(order_id);
    }

    public void infalse(Integer order_id) {
        tOrderMapper.infalse(order_id);
    }

    public void addorder(TOrder tOrder) {
        tOrderMapper.addorder(tOrder);
    }

    public Integer selectmaxId() {
        return tOrderMapper.selectmaxId();
    }

    public void updateOrder(TOrder tOrder) {
        tOrderMapper.updateById(tOrder);
    }

}

