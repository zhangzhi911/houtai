package com.taipingyang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.BuyOrder;
import com.taipingyang.entity.Order;
import com.taipingyang.entity.OrderVo;
import com.taipingyang.entity.Ordersdetails;
import com.taipingyang.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class orderController {

    @RequestMapping("/order/test")
    public String testOrder() {
        return "订单测试=====>来了弟弟?";
    }


    @Autowired
    private orderService service;

    //订单列表
    @RequestMapping("/order/orderList")
    public PageInfo<Order> orderList(@RequestBody OrderVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<Order> list = service.orderList(vo);
        System.out.println(list);
        PageInfo<Order> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    //订单列表
    @RequestMapping("/order/getBuyOrder")
    public List<BuyOrder> getBuyOrder(@RequestBody Integer id) {
        List<BuyOrder> buyOrder = service.getBuyOrder(id);
        return buyOrder;
    }


    //订单添加
    @RequestMapping("/order/addOrder2")
    public Boolean addOrder2(@RequestBody BuyOrder buyOrder) {
        System.out.println(buyOrder);
        service.addOrder2(buyOrder);
        return true;
    }


    //订单添加2
    @RequestMapping("/order/addOrder")
    public Boolean addOrder(@RequestBody Order order) {
        System.out.println(order);
        Boolean addOrder = service.addOrder(order);
        return addOrder;
    }


    //订单修改
    @RequestMapping("/order/updateOrder")
    public Boolean updateOrder(@RequestBody Order order) {
        Boolean updateOrder = service.updateOrder(order);
        return updateOrder;
    }

    //订单删除
    @RequestMapping("/order/delOrder")
    public Boolean delOrder(@RequestBody Integer t_id) {
        Boolean delOrder = service.delOrder(t_id);
        return delOrder;
    }
}