package cn.mgl.flutterspring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.mgl.flutterspring.entity.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/file")
public class FileController {
    @PostMapping("singleUpload")
    public ResponseResult singleUpload(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return ResponseResult.failure("请上传文件", null);
        }
        String uploadFilename = file.getOriginalFilename();
        String tempFileName = UUID.randomUUID().toString() + System.currentTimeMillis() + uploadFilename.substring(uploadFilename.lastIndexOf("."));
        String filePath = "D:\\dev\\uploadFiles\\";
        File dir = new File(filePath + tempFileName);
        if (!dir.getParentFile().exists()) {
            dir.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dir);
        } catch (IOException e) {
            file.transferTo(dir);
            return ResponseResult.failure("上传失败", null);
        }
        Map<String, Object> result = new HashMap<>();
        result.put("path", "http://192.168.8.29/assets/" + tempFileName);
        return ResponseResult.successful(result);
    }
}
