package com.taipingyang.controller.logistsback;

import com.taipingyang.api.logistsback.Logistics_car_api;
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
public class LogisticsCarController {

    @Autowired
    private Logistics_car_api logisticsCarApi;


    @RequestMapping("tcar/add")
    public void tcar(@RequestBody Object o){
        logisticsCarApi.addCar(o);
    }

}
