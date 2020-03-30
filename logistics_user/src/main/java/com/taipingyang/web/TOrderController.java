package com.taipingyang.web;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TOrder;
import com.taipingyang.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 普通用户 前端控制器
 * </p>
 *
 * @author Jsl
 * @since 2020-03-27
 */
@RestController
public class TOrderController {

    @Autowired
    private TOrderService tOrderService;

    @RequestMapping("/torder/list")
    public PageInfo<TOrder> selectLists(@RequestBody TOrder tOrder) {
        System.out.println(tOrder);
        PageInfo<TOrder> info = tOrderService.selectLists(tOrder);
        // System.out.println("订单 " + info);
        return info;
    }


    @RequestMapping("/torder/inture")
    public void inture(@RequestParam("order_id") Integer order_id) {
        tOrderService.inture(order_id);
    }

    @RequestMapping("/torder/infalse")
    public void infalse(@RequestParam("order_id") Integer order_id) {
        tOrderService.infalse(order_id);
    }


    @RequestMapping("/torder/add")
    public void add(@RequestBody TOrder tOrder) {
        tOrderService.addorder(tOrder);

    }
}