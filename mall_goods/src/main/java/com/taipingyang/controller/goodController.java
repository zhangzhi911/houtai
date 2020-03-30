package com.taipingyang.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.Goods;
import com.taipingyang.entity.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class goodController {

    @Autowired
    private com.taipingyang.service.goodService goodService;

    @RequestMapping("/goods/test")
    public String testGoods() {
        return "商品测试=====>来了弟弟?";
    }


    //列表
    @RequestMapping("/goods/findList")
    public PageInfo<Goods> findList(@RequestBody GoodsVo vo) {
        System.out.println("传值是"+vo);
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<Goods> list = goodService.findList(vo);
        PageInfo<Goods> pageInfo = new PageInfo<>(list);
        System.out.println("查完了"+pageInfo);
        return pageInfo;
    }

    //添加
    @RequestMapping("/goods/addGoods")
    public Boolean addGoods(@RequestBody Goods goods) {
        System.out.println(goods);
        Boolean addGoods = goodService.addGoods(goods);
        return addGoods;
    }

    //修改
    @RequestMapping("/goods/updateGoods")
    public Boolean updateGoods(@RequestBody Goods goods) {
        Boolean aBoolean = goodService.updateGoods(goods);
        return aBoolean;
    }

    //删除
    @RequestMapping("/goods/delGoods")
    public Boolean delGoods(@RequestBody Integer t_gid) {
        Boolean delGoods = goodService.delGoods(t_gid);
        return delGoods;
    }


}