package cn.mgl.flutterspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mongielee
 */
@RestController
public class BaseController {
    @GetMapping("/getname")
    public Object getName() {
        return "sdjfklsdjf";
    }
}
