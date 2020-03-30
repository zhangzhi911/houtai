package com.taipingyang.handler;

import com.github.pagehelper.PageInfo;
import com.taipingyang.api.Order_api;
import com.taipingyang.entity.BuyOrder;
import com.taipingyang.entity.conOrder;
import com.taipingyang.entity.conOrderVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order_handler implements Order_api {

    @Override
    public String testorder() {
        return "报错了老弟";
    }

    @Override
    public List<BuyOrder> getBuyOrder(Integer id) {

        System.out.println("报错了");
        return null;
    }

    @Override
    public PageInfo<conOrder> orderList(conOrderVo vo) {
        System.out.println("报错了");
        return null;
    }

    @Override
    public Boolean addOrder(conOrder order) {
        System.out.println("报错了");

        return null;
    }

    @Override
    public Boolean addOrder2(BuyOrder buyOrder) {
        System.out.println("报错了");

        return null;
    }

    @Override
    public Boolean updateOrder(conOrder order) {
        System.out.println("报错了");

        return null;
    }

    @Override
    public Boolean delOrder(Integer t_id) {
        System.out.println("报错了");

        return null;
    }

}
