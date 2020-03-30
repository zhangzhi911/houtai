package com.taipingyang.controller.logistsback;

import com.taipingyang.api.logistsback.Logistics_driver_api;
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
public class LogisticsDriverController {

    @Autowired
    Logistics_driver_api logistics_driver_api;


    @RequestMapping("/tdriver/list")
    public Object selectList(@RequestBody Object o){
        return logistics_driver_api.selectLists(o);
    }


    @RequestMapping("/tdriver/inture")
    public void inture(@RequestParam("driver_id") Integer driver_id){
        logistics_driver_api.inture(driver_id);
    }

    @RequestMapping("/tdriver/infalse")
    public void infalse(@RequestParam("driver_id") Integer driver_id){
        logistics_driver_api.infalse(driver_id);
    }

}
