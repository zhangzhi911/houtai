package com.taipingyang.controller;

import com.github.pagehelper.PageInfo;
import com.taipingyang.api.User_api;
import com.taipingyang.config.ReturnEntity;
import com.taipingyang.entity.conUser;
import com.taipingyang.entity.conUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private User_api user_api;

    @RequestMapping("user/test")
    public String testconUser() {
        return user_api.testUser();
    }

    @RequestMapping("user/login")
    public Map<String, Object> login(conUser user) {
        return user_api.login(user);
    }


    @RequestMapping("user/find")
    public PageInfo<conUser> findAll(conUserVo conUserVo) {
        PageInfo<conUser> info = user_api.findAll(conUserVo);
        return info;
    }

    @RequestMapping("user/validation")
    public HashMap<String, Object> validation(String permiss) {
        return user_api.validation(permiss);
    }

    @RequestMapping("user/register")
    public ReturnEntity register(conUser user) {
        return user_api.register(user);
    }


    @RequestMapping("/user/Flag")
    public void Flag(@RequestParam("userId") Integer userId) {
        user_api.Flag(userId);
    }

    @RequestMapping("/user/inFlag")
    public void inFlag(@RequestParam("userId") Integer userId) {
        user_api.inFlag(userId);
    }


    @RequestMapping("/user/save")
    public int save(conUser user) {
        return user_api.save(user);
    }

    @RequestMapping("/user/show")
    public conUser show(@RequestParam("userId") Integer userId) {
        return user_api.show(userId);
    }

    @RequestMapping("/send")
    public ReturnEntity sendnote(String str) {
        return user_api.sendnote(str);
    }

    @RequestMapping("/loguser/register")
    public ReturnEntity register2(conUser user) {
        return user_api.register2(user);
    }


}
