package cn.mgl.flutterspring.entity;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Result<T> {
    String msg;
    T data;
    Integer status;

    public Result(String msg, T data, Integer status) {
        this.msg = msg;
        this.data = data;
        this.status = status;
    }
    static public <T> Result<T> successful(T data) {
        return new Result("请求成功", data, HttpStatus.OK.value());
    }
}
