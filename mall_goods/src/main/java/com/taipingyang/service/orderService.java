package com.taipingyang.service;

import com.taipingyang.Mapper.BuyOrderMapper;
import com.taipingyang.Mapper.goodMapper;
import com.taipingyang.Mapper.orderMapper;
import com.taipingyang.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderService {

    @Autowired
    private orderMapper mapper;

    @Autowired
    private BuyOrderMapper buyOrderMapper;

    //订单列表
    public List<Order> orderList(OrderVo vo) {
        List<Order> orderList = mapper.orderList(vo);
        return orderList;
    }
    //订单列表
    public  List<BuyOrder>  getBuyOrder(Integer id) {
        List<BuyOrder> buyOrder = buyOrderMapper.getBuyOrder(id);
        return buyOrder;
    }

    ;

    //订单添加
    public Boolean addOrder(Order order) {
        int i = mapper.addOrder(order);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //订单添加
    public Boolean addOrder2(BuyOrder order) {
        int i = mapper.addOrder2(order);
        System.out.println("插入的id是" + i);
        for (Ordersdetails ordersdetails : order.getGoods()
        ) {
            ordersdetails.setBuyOrderId(order.getId());
            addOrdersdetails(ordersdetails);
        }
        return true;
    }

    public Boolean addOrdersdetails(Ordersdetails ordersdetails) {
        int i = mapper.addOrdersdetails(ordersdetails);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //订单修改
    public Boolean updateOrder(Order order) {
        int i = mapper.updateOrder(order);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //订单删除
    public Boolean delOrder(Integer t_id) {
        int delOrder = mapper.delOrder(t_id);
        if (delOrder > 0) {
            return true;
        }
        return false;
    }
}
