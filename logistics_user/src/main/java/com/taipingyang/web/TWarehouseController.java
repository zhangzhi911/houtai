package com.taipingyang.web;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TOrder;
import com.taipingyang.entity.TWarehouse;
import com.taipingyang.service.TWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 普通用户 前端控制器
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
@RestController
public class TWarehouseController {

    @Autowired
    private TWarehouseService tWarehouseService;
    @RequestMapping("/tware/list")
    public PageInfo<TWarehouse> selectList(TWarehouse tWarehouse){
        PageInfo<TWarehouse> info = tWarehouseService.selectLists(tWarehouse);
        System.out.println("仓库 " + info);
        return info;
    }


}
