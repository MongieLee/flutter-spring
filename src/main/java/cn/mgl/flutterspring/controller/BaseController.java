package cn.mgl.flutterspring.controller;

import cn.mgl.flutterspring.entity.CarouselItem;
import cn.mgl.flutterspring.entity.CourseItem;
import cn.mgl.flutterspring.entity.ResponseResult;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static sun.misc.Version.print;

/**
 * @author mongielee
 */
@RestController
@RequestMapping("/api/v1/base")
public class BaseController {
    @GetMapping("/getCarousels")
    public ResponseResult getCarousel(@RequestHeader MultiValueMap<String, String> headers, HttpServletRequest req) {
        List<CarouselItem> carousels = new ArrayList<>();
        System.out.println(req.getRemoteAddr());
//        for (int i = 0; i < 5; i++) {
//            CarouselItem newItem = new CarouselItem();
//            newItem.setId((int) Math.floor((Math.random()) * 1000));
//            newItem.setImg("https://img.alicdn.com/imgextra/i2/6000000000435/O1CN01tZtm9f1F5H3gl3Awd_!!6000000000435-2-octopus.png");
//            newItem.setName("轮播图" + i);
//            carousels.add(newItem);
//        }
        return ResponseResult.successful(carousels);
    }

    @GetMapping("/getCourses")
    public ResponseResult getCourses() {
        List<CourseItem> carousels = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CourseItem newItem = new CourseItem();
            newItem.setId((int) Math.floor((Math.random()) * 1000));
            newItem.setImg("https://img.alicdn.com/imgextra/i2/6000000000435/O1CN01tZtm9f1F5H3gl3Awd_!!6000000000435-2-octopus.png");
            newItem.setName("轮播图" + i);
            carousels.add(newItem);
        }
        return ResponseResult.successful(carousels);
    }

    @PostMapping("/sendLocation")
    public ResponseResult getLocation(@RequestBody Map<String, Object> location) {
        System.out.println(location);
        return ResponseResult.successful(null);
    }

    @PostMapping("test")
    public String testPost(@RequestBody Object body, @RequestParam(value = "a",required = false) String a) {
        System.out.println("body");
        System.out.println(body);
        System.out.println("a");
        System.out.println(a);
        return "123";
    }
}
