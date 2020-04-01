package com.taipingyang.web;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TCar;
import com.taipingyang.entity.TDriver;
import com.taipingyang.service.TCarService;
import com.taipingyang.service.TDriverService;
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
public class TCarController {

    @Autowired
    private TCarService tCarService;


    @RequestMapping("tcar/add")
    public void tcar(@RequestBody TCar tCar){
        tCarService.addCar(tCar);
    }
}
