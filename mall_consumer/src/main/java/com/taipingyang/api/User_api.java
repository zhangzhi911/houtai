package com.taipingyang.api;


import com.github.pagehelper.PageInfo;
import com.taipingyang.config.ReturnEntity;
import com.taipingyang.entity.conUser;
import com.taipingyang.entity.conUserVo;
import com.taipingyang.handler.User_handler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

//这里远程调用 实现业务的模块
// 报错的话走这里car_handler
@FeignClient(value = "malluser", fallback = User_handler.class)
public interface User_api {

    @RequestMapping("/user/test")
    public String testUser();

    @RequestMapping("user/login")
    public Map<String, Object> login(conUser user);

    @RequestMapping("user/find")
    public PageInfo<conUser> findAll(conUserVo userVo);

    @RequestMapping("user/register")
    public ReturnEntity register(conUser user);

    @RequestMapping("user/validation")
    public HashMap<String, Object> validation(String permiss);

    @RequestMapping("user/show")
    conUser show(@RequestParam("userId") Integer userId);

    @RequestMapping("/user/Flag")
    void Flag(@RequestParam("userId") Integer userId);

    @RequestMapping("/user/inFlag")
    void inFlag(@RequestParam("userId") Integer userId);

    @RequestMapping("/user/save")
    int save(@RequestBody conUser user);

    @RequestMapping("/send")
    public ReturnEntity sendnote(String str);

    @RequestMapping("/loguser/register")
    public ReturnEntity register2(conUser user);
}
