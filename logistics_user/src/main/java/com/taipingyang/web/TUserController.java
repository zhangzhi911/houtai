package com.taipingyang.web;


import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.TUser;
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
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @RequestMapping("/tuser/list")
    public PageInfo<TUser> selectList(@RequestBody TUser user){
        PageInfo<TUser> info = tUserService.selectAll(user);
        //System.out.println("物流 " + info);
        return info;
    }



    @RequestMapping("/user/inture")
    public void inture(@RequestParam("user_id") Integer user_id){
        tUserService.inture(user_id);
    }

    @RequestMapping("/user/infalse")
    public void infalse(@RequestParam("user_id") Integer user_id){
        tUserService.infalse(user_id);
    }
}
