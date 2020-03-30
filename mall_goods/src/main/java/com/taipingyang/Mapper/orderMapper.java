package com.taipingyang.Mapper;

import com.taipingyang.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface orderMapper {
    //订单列表
    public List<Order> orderList(OrderVo vo);

    //订单添加
    public int addOrder(Order order);

    public int addOrder2(BuyOrder order);


    public int addOrdersdetails(Ordersdetails ordersdetails);



    //订单修改
    public int updateOrder(Order order);

    //订单删除
    public int delOrder(Integer t_id);
}
