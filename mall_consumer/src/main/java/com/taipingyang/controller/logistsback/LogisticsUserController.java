package com.taipingyang.controller.logistsback;

import com.taipingyang.api.logistsback.Logistics_user_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: jsl
 * Date: 2020/3/27
 * Time: 16:55
 * To change this template use
 */

@RestController
public class LogisticsUserController {

    @Autowired
    private Logistics_user_api logisticsUserApi;

    @RequestMapping("/tuser/list")
    public Object selectList(@RequestBody Object o) {
        return logisticsUserApi.selectList(o);
    }


    @RequestMapping("/user/inture")
    public void inture(@RequestParam("user_id") Integer user_id) {
        logisticsUserApi.inture(user_id);
    }

    @RequestMapping("/user/infalse")
    public void infalse(@RequestParam("user_id") Integer user_id) {
        logisticsUserApi.infalse(user_id);
    }
}
