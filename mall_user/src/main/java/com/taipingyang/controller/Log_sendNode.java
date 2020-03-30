package com.taipingyang.controller;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.taipingyang.config.ReturnEntity;
import com.taipingyang.entity.User;
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
import java.util.concurrent.TimeUnit;

@RestController
public class Log_sendNode {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("loguser/register")
    public ReturnEntity register2(@RequestBody User user) {
        Object o = redisTemplate.opsForValue().get(user.getPermiss());

        System.out.println(o.toString() + "注册 " + user.getAddress());

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

    @RequestMapping("/send2")
    public ReturnEntity sendnote2(@RequestBody String str) {
        System.out.println("来注册了" + str);
        if (str.length() != 11) {
            return ReturnEntity.error("请输入正确的手机号!!!");
        }
        int num = (int) ((Math.random() * 9 + 1) * 100000);
        String ran = String.valueOf(num);
//        redisTemplate.opsForValue().set(str, "用户" + str + "验证码是:" + ran + "时间是:" + new Date(), 60, TimeUnit.SECONDS);
        redisTemplate.opsForValue().set(str, ran);
        Object o = redisTemplate.opsForValue().get(str);
        System.out.println("这是redis" + o);
        return ReturnEntity.ok("200", "尊敬的客户：" + str + "您好,验证码已发送到您的手机，请尽快查收");

    }

    @RequestMapping("/send")
    public ReturnEntity sendnote(@RequestBody String str) {
//        userService.testuser(null);
        System.out.println("来注册了" + str);
        if (str.length() != 11) {
            return ReturnEntity.error("请输入正确的手机号!!!");
        }
        // 短信应用SDK AppID
        int appid = 1400332571; // 1400开头

        // 短信应用SDK AppKey
        String appkey = "ca72f260795a2cd79b25da53911f4db4";

        // 需要发送短信的手机号码
        String[] phoneNumbers = {"18662746291"};

        // 短信模板ID，需要在短信应用中申请
        // NOTE: 这里的模板ID`7839`只是一个示例，
        // 真实的模板ID需要在短信控制台中申请
        int templateId = 564425;

        // 签名
        // NOTE: 这里的签名"腾讯云"只是一个示例，
        // 真实的签名需要在短信控制台中申请，另外
        // 签名参数使用的是`签名内容`，而不是`签名ID`
        String smsSign = "002睿智";

        try {
            int num = (int) ((Math.random() * 9 + 1) * 100000);
            String ran = String.valueOf(num);
            String[] params = {ran, "2"};
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", str, templateId, params, smsSign, "", "");
            redisTemplate.opsForValue().set(str, ran);
//            redisTemplate.opsForValue().set(str, "用户" + str + "验证码是:" + ran + "时间是:" + new Date(), 60, TimeUnit.SECONDS);
            Object o = redisTemplate.opsForValue().get(str);
            System.out.println("这是redis" + o);
            System.out.println(result + "完成了");
            if (result.errMsg.equals("OK")) {
                return ReturnEntity.ok("200", "尊敬的客户：" + str + "您好,验证码已发送到您的手机，请尽快查收");
            } else {
                return ReturnEntity.error("尊敬的客户：" + str + "您好,今日您的手机验证已到上限，请改日再来");
            }

        } catch (HTTPException e) {
            // HTTP 响应码错误
            System.out.println("响应码错误");
            e.printStackTrace();
//            return "响应码错误";
            return ReturnEntity.error("响应码错误~请联系管理员");
        } catch (JSONException e) {
            System.out.println(" 解析错误");
            // JSON 解析错误
            e.printStackTrace();
//            return "解析错误";
            return ReturnEntity.error("解析错误~请联系管理员");


        } catch (IOException e) {
            System.out.println(" 网络 IO 错误");
            // 网络 IO 错误
            e.printStackTrace();
//            return "网络 IO 错误";
            return ReturnEntity.error("网络 IO 错误~请联系管理员");


        } catch (com.github.qcloudsms.httpclient.HTTPException e) {
            e.printStackTrace();
//            return "网络 IO 错误";
            return ReturnEntity.error("网络 IO 错误~请联系管理员");
        }

    }

}
