package com.taipingyang.api;

import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.BuyOrder;
import com.taipingyang.entity.conOrder;
import com.taipingyang.entity.conOrderVo;
import com.taipingyang.handler.Order_handler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//这里远程调用 实现业务的模块
// 报错的话走这里car_handler
@FeignClient(value = "mallgoods", fallback = Order_handler.class)
public interface Order_api {

    @RequestMapping("/order/test")
    public String testorder();

    //订单列表
    @RequestMapping("/order/getBuyOrder")
    public List<BuyOrder> getBuyOrder(Integer id);


    //订单列表
    @RequestMapping("/order/orderList")
    public PageInfo<conOrder> orderList(conOrderVo vo);

    //订单添加
    @RequestMapping("/order/addOrder")
    public Boolean addOrder(conOrder order);

    //订单添加
    @RequestMapping("/order/addOrder2")
    public Boolean addOrder2(BuyOrder buyOrder);
    //订单修改
    @RequestMapping("/order/updateOrder")
    public Boolean updateOrder(conOrder order);

    //订单删除
    @RequestMapping("/order/delOrder")
    public Boolean delOrder(Integer t_id);

}