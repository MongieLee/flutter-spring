package cn.mgl.flutterspring.entity;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseResult<T> {
    String msg;
    T data;
    Integer status;

    public ResponseResult(String msg, T data, Integer status) {
        this.msg = msg;
        this.data = data;
        this.status = status;
    }

    static public <T> ResponseResult<T> successful(T data) {
        return new ResponseResult("请求成功", data, HttpStatus.OK.value());
    }

    static public <T> ResponseResult<T> failure(String msg, T data) {
        return new ResponseResult(msg, data, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
