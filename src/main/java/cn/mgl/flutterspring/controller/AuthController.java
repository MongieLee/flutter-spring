package cn.mgl.flutterspring.controller;

import cn.mgl.flutterspring.entity.ResponseResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @PostMapping("login")
    public ResponseResult Login(@RequestBody Map<String, Object> usernameAndPassword) {
        String username = (String) usernameAndPassword.get("username");
        String password = (String) usernameAndPassword.get("password");
        if ("admin".equals(username) && "123".equals(password)) {
            return ResponseResult.successful(usernameAndPassword);
        }
        return ResponseResult.failure("账号名或密码错误", null);
    }

    @GetMapping("getUserInfo")
    public ResponseResult getUserInfo() {
        Map<String, Object> resultUser = new HashMap();
        resultUser.put("id", (int) Math.floor(Math.random() * 1000));
        resultUser.put("access_token", "这是测试token");
        resultUser.put("username", "MongieLee");
        resultUser.put("phoneNum", "13232251037");
        resultUser.put("gender", Gender.MEN);
        resultUser.put("avatar", "https://profile.csdnimg.cn/7/2/B/1_leeoldc");
        return ResponseResult.successful(resultUser);
    }
}

enum Gender {
    /**
     * 男性
     */
    MEN,

    /**
     * 女性
     */
    WOMEN
}
