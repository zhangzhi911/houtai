package com.taipingyang.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TDriver;
import com.taipingyang.entity.TUser;
import com.taipingyang.mapper.TDriverMapper;
import com.taipingyang.mapper.TUserMapper;
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
public class TDriverService {

    @Autowired
    private TDriverMapper tDriverMapper;


    public PageInfo<TDriver> selectLists(TDriver tDriver){
        PageHelper.startPage(tDriver.getPageNo(), tDriver.getPageSize());
        EntityWrapper<TDriver> wrapper = new EntityWrapper<TDriver>();

        List<TDriver> list = tDriverMapper.selectLists(tDriver);
        return new PageInfo<TDriver>(list);
    }
//
//    public PageInfo<TCar> selectAll(TCar tCar) {
//        PageHelper.startPage(tCar.getPageNo(), tCar.getPageSize());
//        EntityWrapper<TCar> wrapper = new EntityWrapper<TCar>();
//
//        List<TCar> list = tCarMapper.selectList(wrapper);
//        return new PageInfo<TCar>(list);
//    }

    public void inture(Integer driver_id) {
        tDriverMapper.inture(driver_id);
    }

    public void infalse(Integer driver_id) {
        tDriverMapper.infalse(driver_id);
    }

    public void addDriver(TDriver tDriver) {
        tDriverMapper.addDriver(tDriver);
    }
}
