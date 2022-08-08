package cn.mgl.flutterspring.entity;

import lombok.Data;

enum Status {
    SUCCESSFUL, FAILED
}

@Data
public class CarouselItem {
    Integer id;
    String img;
    String name;
}
