package com.taipingyang.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TWarehouse;
import com.taipingyang.mapper.TWarehouseMapper;
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
public class TWarehouseService {

    @Autowired
    private TWarehouseMapper tWarehouseMapper;


    public PageInfo<TWarehouse> selectLists(TWarehouse tWarehouse){
        PageHelper.startPage(tWarehouse.getPageNo(), tWarehouse.getPageSize());
        EntityWrapper<TWarehouse> wrapper = new EntityWrapper<TWarehouse>();

        List<TWarehouse> list = tWarehouseMapper.selectLists(tWarehouse);
        return new PageInfo<TWarehouse>(list);
    }

}
