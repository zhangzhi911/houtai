package com.taipingyang.web;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TDriver;
import com.taipingyang.entity.TUser;
import com.taipingyang.service.TDriverService;
import com.taipingyang.service.TUserService;
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
public class TDriverController {

    @Autowired
    private TDriverService tDriverService;

    @RequestMapping("/tdriver/list")
    public PageInfo<TDriver> selectList(TDriver tDriver){
        PageInfo<TDriver> info = tDriverService.selectLists(tDriver);
        //System.out.println("车辆 " + info);
        return info;
    }



    @RequestMapping("/tdriver/inture")
    public void inture(@RequestParam("driver_id") Integer driver_id){
        tDriverService.inture(driver_id);
    }

    @RequestMapping("/tdriver/infalse")
    public void infalse(@RequestParam("driver_id") Integer driver_id){
        tDriverService.infalse(driver_id);
    }
}
