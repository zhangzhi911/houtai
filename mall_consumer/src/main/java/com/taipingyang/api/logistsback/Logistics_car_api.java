package com.taipingyang.api.logistsback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 11:57
 * To change this template use
 */
@FeignClient(value = "logisticsuser")
public interface Logistics_car_api {

    @RequestMapping("tcar/add")
    void addCar(@RequestBody Object o);

}
