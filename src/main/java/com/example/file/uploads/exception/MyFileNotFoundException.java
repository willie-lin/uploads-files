package com.example.file.uploads.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.file.uploads.exception
 * @auther: YuAn
 * @Date: 2018/9/7
 * @Time: 11:53
 * @Project_name: uploads-files
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException {

    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

}
