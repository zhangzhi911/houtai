package com.taipingyang.controller;


import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.taipingyang.config.SendMail;
import com.taipingyang.service.UserService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.http.HTTPException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class TOMail {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/validation")
    public HashMap<String, Object> validation(String permiss) {
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


}
