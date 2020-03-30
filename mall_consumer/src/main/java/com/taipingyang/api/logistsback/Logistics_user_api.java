package com.taipingyang.api.logistsback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/27
 * Time: 16:40
 * To change this template use
 */
@FeignClient(value = "logisticsuser")
public interface Logistics_user_api {


    @RequestMapping("/tuser/list")
    Object selectList(@RequestBody Object o);

    @RequestMapping("/user/inture")
    void inture(@RequestParam("user_id") Integer user_id);

    @RequestMapping("/user/infalse")
    void infalse(@RequestParam("user_id") Integer user_id);

}
