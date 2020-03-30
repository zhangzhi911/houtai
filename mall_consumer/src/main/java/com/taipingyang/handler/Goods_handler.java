package com.taipingyang.handler;

import com.github.pagehelper.PageInfo;
import com.taipingyang.api.Goods_api;
import com.taipingyang.entity.conGoods;
import com.taipingyang.entity.conGoodsVo;
import org.springframework.stereotype.Component;

@Component
public class Goods_handler implements Goods_api {

    @Override
    public String testconGoods() {
        System.out.println("报错了弟弟");
        return null;
    }

    @Override
    public PageInfo<conGoods> findList(conGoodsVo vo) {
        System.out.println("报错了弟弟");

        return null;
    }

    @Override
    public Boolean addconGoods(conGoods goods) {
        System.out.println("报错了弟弟");

        return null;
    }

    @Override
    public Boolean updateconGoods(conGoods goods) {
        System.out.println("报错了弟弟");


        return null;
    }

    @Override
    public Boolean delconGoods(Integer t_gid) {
        System.out.println("报错了弟弟");

        return null;
    }
//    所有报错的方法在这里实现

}
