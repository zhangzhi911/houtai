package com.taipingyang.controller.logistsback;

import com.taipingyang.api.logistsback.Logistics_order_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 12:02
 * To change this template use
 */
@RestController
public class LogisticsOrderController {

    @Autowired
    Logistics_order_api logisticsOrderApi;


    @RequestMapping("/torder/list")
    public Object selectList(@RequestBody Object o) {
        System.out.println(o.toString());
        return logisticsOrderApi.selectLists(o);

    }

    @RequestMapping("/torder/inture")
    public void inture(@RequestParam("order_id") Integer order_id) {
        logisticsOrderApi.inture(order_id);
    }

    @RequestMapping("/torder/infalse")
    public void infalse(@RequestParam("order_id") Integer order_id) {
        logisticsOrderApi.infalse(order_id);
    }


    @RequestMapping("/torder/add")
    public void add(@RequestBody Object o) {
        logisticsOrderApi.addorder(o);
    }
}
