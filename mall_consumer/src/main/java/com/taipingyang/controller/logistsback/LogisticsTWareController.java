package com.taipingyang.controller.logistsback;

import com.taipingyang.api.logistsback.Logistics_tware_api;
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
public class LogisticsTWareController {

    @Autowired
    Logistics_tware_api logistics_tware_api;


    @RequestMapping("/tware/list")
    public Object selectList(@RequestBody Object o){
        return logistics_tware_api.selectLists(o);
    }




}
