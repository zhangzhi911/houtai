package com.taipingyang.controller;

import com.github.pagehelper.PageInfo;
import com.taipingyang.config.ReturnEntity;
import com.taipingyang.config.SendMail;
import com.taipingyang.entity.User;
import com.taipingyang.entity.UserVo;
import com.taipingyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rx.observables.SyncOnSubscribe;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class userController {

    @Autowired
    private UserService userService;

    @RequestMapping("user/test")
    public String testUser() {
        return "来了老弟?";
    }

    @Autowired
    private RedisTemplate redisTemplate;


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
                    map.put("flag", true);
                } else if (user1.getUserFlag() == 2) {
                    map.put("code2", "欢迎用户登录！");
                    map.put("flag", true);
                } else if (user1.getUser_name().equals("admin") && user1.getUser_password().equals("123123")) {
                    map.put("code0", "欢迎管理员登录");
                    map.put("admin", "admin");
                }
            }
        } else {
            map.put("code3", "用户名或密码错误！");
            return map;
        }
        return map;
    }

    @RequestMapping("user/find")
    public PageInfo<User> findAll(@RequestBody UserVo userVo) {
        PageInfo<User> info = userService.findAll(userVo);
        System.out.println("登录 " + info);
        return info;
    }

    @RequestMapping("user/validation")
    public HashMap<String, Object> validation(@RequestBody String permiss) {
        HashMap<String, Object> map = new HashMap<>();

        String Verification = UUID.randomUUID().toString(); // UUID.gif
        String content = "您好，这里是<b>太平洋项目组</b><br/> 您此次登录的验证码是 ：" + Verification + " <br/>请保管好您的信息，防止泄露";
        SendMail SendMail = new SendMail();
        try {
            SendMail.SendMail2(permiss, content); //要发送的邮箱 内容
            map.put("send", "验证码已发送请，注意查收");
            map.put("validat", Verification);
            redisTemplate.opsForValue().set(permiss, Verification, 60, TimeUnit.SECONDS);
            Object o = redisTemplate.opsForValue().get(permiss);
            System.out.println("放好了，验证码是:" + o.toString());

        } catch (Exception e) {
            map.put("error", "验证信息错误、重新输入邮箱");
        }
        return map;
    }

    @RequestMapping("user/register")
    public ReturnEntity register(@RequestBody User user) {
        Object o = redisTemplate.opsForValue().get(user.getPermiss());

        System.out.println(o.toString() + "注册 " + user);
        System.out.println(user + " " + o.toString().equals(user.getAddress()));
        if (o.toString().length() < 1) {
            return ReturnEntity.error("验证码过期");
        }
        if (o.toString().equals(user.getAddress())) {
            userService.register(user);
            return ReturnEntity.ok("注册成功");
        } else {
            return ReturnEntity.error("注册失败，验证码错误");
        }
    }


    @RequestMapping("/user/Flag")
    public void Flag(@RequestParam("userId") Integer userId){
        userService.Flag(userId);
    }

    @RequestMapping("/user/inFlag")
    public void inFlag(@RequestParam("userId") Integer userId){
        userService.inFlag(userId);
    }


    @RequestMapping("/user/show")
    public User show(@RequestParam("userId") Integer userId){
        System.out.println("单查"+userService.show(userId));
        return userService.show(userId);
    }

    @RequestMapping("/user/save")
    public int save(@RequestBody User user){
        return userService.save(user);

    }


}