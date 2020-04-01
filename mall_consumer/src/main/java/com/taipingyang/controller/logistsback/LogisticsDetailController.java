package com.taipingyang.controller.logistsback;

import com.taipingyang.api.logistsback.Logistics_detail_api;
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
public class LogisticsDetailController {

    @Autowired
    Logistics_detail_api logistics_detail_api;

    @RequestMapping("/detail/byid")
    Object getById(@RequestParam("order_detail_id") Integer order_detail_id) {
        return logistics_detail_api.getById(order_detail_id);
    }

    @RequestMapping("/detail/insert")
    void insertdetail(@RequestBody Object o) {
        logistics_detail_api.insertdetail(o);
    }
}
