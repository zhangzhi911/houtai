package com.taipingyang.api;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.conGoods;
import com.taipingyang.entity.conGoodsVo;
import com.taipingyang.handler.Goods_handler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//这里远程调用 实现业务的模块
// 报错的话走这里car_handler
@FeignClient(value = "mallgoods", fallback = Goods_handler.class)
public interface Goods_api {
    @RequestMapping("/goods/test")
    public String testconGoods();


    //列表
    @RequestMapping("/goods/findList")
    public PageInfo<conGoods> findList(conGoodsVo vo);

    //添加
    @RequestMapping("/goods/addconGoods")
    public Boolean addconGoods(conGoods goods);

    //修改
    @RequestMapping("/goods/updateconGoods")
    public Boolean updateconGoods(conGoods goods);

    //删除
    @RequestMapping("/goods/delconGoods")
    public Boolean delconGoods(Integer t_gid);
}
