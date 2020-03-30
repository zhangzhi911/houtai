package com.taipingyang.controller;

import com.github.pagehelper.PageInfo;
import com.taipingyang.entity.User;
import com.taipingyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class userController {

    @Autowired
    private UserService userService;


    @Autowired
    private RedisTemplate redisTemplate;


    @RequestMapping("redis/test")
    public Object findById(String id) {
        String Verification = UUID.randomUUID().toString(); // UUID.gif

        String content = "您好，这里是<b>太平洋项目组</b><br/> 您此次登录的验证码是 ：" + Verification + " <br/>请保管好您的信息，防止泄露";

        redisTemplate.opsForValue().set("article_" + id, content, 60, TimeUnit.SECONDS);
        Object o = redisTemplate.opsForValue().get("article_" + id);
        System.out.println(o);
        return o;
    }


    @RequestMapping("user/test")
    public String testUser() {
        SendMail SendMail = new SendMail();
        String Verification = UUID.randomUUID().toString(); // UUID.gif
        String content = "您好，这里是<b>太平洋项目组</b><br/> 您此次登录的验证码是 ：" + Verification + " <br/>请保管好您的信息，防止泄露";
        SendMail.SendMail2("1023904394@qq.com", content); //要发送的邮箱 内容
        System.out.println("发送完成:" + content);
        return "来了老弟?";
    }


    @RequestMapping("user/login")
    public Map<String, Object> login(@RequestBody User user) {
        System.out.println("登录 " + user);
        Map<String, Object> map = new HashMap<>();


        //根据用户查询用户对象
        User user1 = userService.login(user);
        //登录判断
        if (user1 != null) {
            if (user1.getUser_password().equals(user.getUser_password())) {
                map.put("user", user1);
                if (user1.getUserFlag() == 1) {
                    map.put("code1", "欢迎商家登录！");
                } else if (user1.getUserFlag() == 2) {
                    map.put("code2", "欢迎用户登录！");
                } else {
                    map.put("code3", "非法登录，请输入正确的账号密码！");
                }
            }
        } else {
            map.put("code4", "用户名或密码错误！");
        }
        return map;
    }

    @RequestMapping("user/find")
    public PageInfo<User> findAll() {
        PageInfo<User> info = userService.findAll(null);
        System.out.println("登录 " + info);

        return info;
    }

    @RequestMapping("user/register")
    public boolean register(@RequestBody User user) {
        System.out.println("注册 " + user);

        return userService.register(user) > 0;
    }

}