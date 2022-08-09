package cn.mgl.flutterspring.controller;

import cn.mgl.flutterspring.entity.Result;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @PostMapping("login")
    public Result Login(@RequestBody Map<String, Object> usernameAndPassword) {
        String username = (String) usernameAndPassword.get("username");
        String password = (String) usernameAndPassword.get("password");
        if ("admin".equals(username) && "123".equals(password)) {
            return Result.successful(usernameAndPassword);
        }
        return Result.failure("账号名或密码错误", null);
    }

    @GetMapping("getUserInfo")
    public Result getUserInfo(RequestContext requestContext){
        return null;
    }
}
