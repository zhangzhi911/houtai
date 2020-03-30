package com.taipingyang.handler;

import com.github.pagehelper.PageInfo;
import com.taipingyang.api.User_api;
import com.taipingyang.config.ReturnEntity;
import com.taipingyang.entity.conUser;
import com.taipingyang.entity.conUserVo;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class User_handler implements User_api {
    @Override
    public String testUser() {
        return "报错的弟弟";
    }

    @Override
    public Map<String, Object> login(conUser user) {
        System.out.println("报错的弟弟");
        return null;
    }

    @Override
    public PageInfo<conUser> findAll(conUserVo userVo) {
        System.out.println("报错的弟弟");

        return null;
    }

    @Override
    public ReturnEntity register(conUser user) {
        System.out.println("报错的弟弟");
        return ReturnEntity.error("系统错误，请联系管理员");
    }

    @Override
    public HashMap<String, Object> validation(String permiss) {
        System.out.println("报错的弟弟");
        return null;
    }

    @Override
    public conUser show(Integer userId) {
        System.out.println("报错的弟弟");
        return null;
    }

    @Override
    public void Flag(Integer userId) {
        System.out.println("报错的弟弟");

    }

    @Override
    public void inFlag(Integer userId) {
        System.out.println("报错的弟弟");

    }

    @Override
    public int save(conUser user) {
        return 0;
    }

    @Override
    public ReturnEntity sendnote(String str) {
        System.out.println("报错的弟弟");

        return null;
    }

    @Override
    public ReturnEntity register2(conUser user) {
        System.out.println("报错的弟弟");

        return null;
    }
//    所有报错的方法在这里实现

}
