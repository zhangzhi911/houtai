package com.taipingyang.service;

import com.taipingyang.Mapper.goodMapper;
import com.taipingyang.entity.Goods;
import com.taipingyang.entity.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class goodService {

    @Autowired
    private goodMapper good;

//    @Cacheable(cacheNames = "goods", key = "123")

    //列表
    public List<Goods> findList(GoodsVo vo) {
        List<Goods> findList = good.findList(vo);
        return findList;
    }


    //添加
    public Boolean addGoods(Goods goods) {
        int i = good.addGoods(goods);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //修改
    public Boolean updateGoods(Goods goods) {
        int i = good.updateGoods(goods);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //删除
    public Boolean delGoods(Integer t_gid) {
        int delGoods = good.delGoods(t_gid);
        if (delGoods > 0) {
            return true;
        }
        return false;
    }
}
