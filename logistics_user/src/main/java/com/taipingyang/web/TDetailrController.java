package com.taipingyang.web;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TDetail;
import com.taipingyang.entity.TDriver;
import com.taipingyang.entity.TOrder;
import com.taipingyang.service.TDetailService;
import com.taipingyang.service.TDriverService;
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
public class TDetailrController {

    @Autowired
    private TDetailService tDetailService;
    @Autowired
    private TOrderService tOrderService;


    @RequestMapping("/detail/byid")
    Object getById(@RequestParam("order_detail_id") Integer order_detail_id) {
        return tDetailService.getById(order_detail_id);
    }

    @RequestMapping("/detail/insert")
    void insertdetail(@RequestBody TDetail t) {
        Object o = tDetailService.inserdetail(t);
        Integer id = tOrderService.selectmaxId();
        TOrder tOrder = new TOrder();
        tOrder.setOrder_id(t.getCartype_id());
        tOrder.setOrder_detail(id);
        tOrder.setOrder_isverify(3);
        System.out.println(id + "========================>>>>>>>>>>>>>>>>>>>>>" + t.getCartype_id());
        tOrderService.updateOrder(tOrder);

    }

}