package com.taipingyang.Mapper;

import com.taipingyang.entity.Goods;
import com.taipingyang.entity.GoodsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface goodMapper {
    //列表
    public List<Goods> findList(GoodsVo vo);

    //添加
    public int addGoods(Goods goods);

    //修改
    public int updateGoods(Goods goods);

    //删除
    public int delGoods(Integer t_gid);
}
