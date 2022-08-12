package cn.mgl.flutterspring.controller;

import cn.mgl.flutterspring.entity.CarouselItem;
import cn.mgl.flutterspring.entity.CourseItem;
import cn.mgl.flutterspring.entity.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mongielee
 */
@RestController
@RequestMapping("/api/v1/base")
public class BaseController {
    @GetMapping("/getCarousels")
    public ResponseResult getCarousel() {
        List<CarouselItem> carousels = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CarouselItem newItem = new CarouselItem();
            newItem.setId((int) Math.floor((Math.random()) * 1000));
            newItem.setImg("https://img.alicdn.com/imgextra/i2/6000000000435/O1CN01tZtm9f1F5H3gl3Awd_!!6000000000435-2-octopus.png");
            newItem.setName("轮播图" + i);
            carousels.add(newItem);
        }
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
}
