package com.taipingyang.Mapper;


import com.taipingyang.entity.BuyOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyOrderMapper {
    public List<BuyOrder> getBuyOrder(Integer id);
}
