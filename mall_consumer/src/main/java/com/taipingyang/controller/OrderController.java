package com.taipingyang.controller;

import com.github.pagehelper.PageInfo;
import com.taipingyang.api.Order_api;
import com.taipingyang.entity.BuyOrder;
import com.taipingyang.entity.conOrder;
import com.taipingyang.entity.conOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private Order_api service;

    @RequestMapping("/order/test")
    public String testorder() {
        return service.testorder();
    }

    //订单列表
    @RequestMapping("/order/orderList")
    public PageInfo<conOrder> orderList(conOrderVo vo) {
        PageInfo<conOrder> conOrderPageInfo = service.orderList(vo);
        return conOrderPageInfo;
    }

    @RequestMapping("/order/getBuyOrder")
    public List<BuyOrder> getBuyOrder(Integer id) {
        return service.getBuyOrder(id);
    }


    //订单添加
    @RequestMapping("/order/addOrder")
    public Boolean addOrder(conOrder order) {
        System.out.println(order);
        Boolean addOrder = service.addOrder(order);
        return addOrder;
    }


    //订单添加
    @RequestMapping("/order/addOrder2")
    public Boolean addOrder2(BuyOrder buyOrder) {
        System.out.println(buyOrder);
        return service.addOrder2(buyOrder);
    }

    //订单修改
    @RequestMapping("/order/updateOrder")
    public Boolean updateOrder(conOrder order) {
        Boolean updateOrder = service.updateOrder(order);
        return updateOrder;
    }

    //订单删除
    @RequestMapping("/order/delOrder")
    public Boolean delOrder(Integer t_id) {
        Boolean delOrder = service.delOrder(t_id);
        return delOrder;
    }
}
