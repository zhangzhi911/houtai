package com.taipingyang.controller;

import com.github.pagehelper.PageInfo;
import com.taipingyang.api.Goods_api;
import com.taipingyang.entity.conGoods;
import com.taipingyang.entity.conGoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoodsController {


    @Autowired
    private Goods_api goods_api;

    @RequestMapping("/goods/test")
    public String testGoods() {
        return goods_api.testconGoods();
    }

    //列表
    @RequestMapping("/goods/findList")
    public PageInfo<conGoods> findList(conGoodsVo vo) {
        PageInfo<conGoods> list = goods_api.findList(vo);
        return list;
    }

    //添加
    @RequestMapping("/goods/addGoods")
    public Boolean addGoods(conGoods goods) {
        System.out.println(goods);
        Boolean addGoods = goods_api.addconGoods(goods);
        return addGoods;
    }

    //修改
    @RequestMapping("/goods/updateGoods")
    public Boolean updateGoods(conGoods goods) {
        Boolean aBoolean = goods_api.updateconGoods(goods);
        return aBoolean;
    }

    //删除
    @RequestMapping("/goods/delGoods")
    public Boolean delGoods(Integer t_gid) {
        Boolean delGoods = goods_api.delconGoods(t_gid);
        return delGoods;
    }


}