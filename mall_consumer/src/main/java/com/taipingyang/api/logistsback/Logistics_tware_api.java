package com.taipingyang.api.logistsback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/29
 * Time: 11:57
 * To change this template use
 */
@FeignClient(value = "logisticsuser")
public interface Logistics_tware_api {

    @RequestMapping("/tware/list")
    Object selectLists(@RequestBody Object o);


}
