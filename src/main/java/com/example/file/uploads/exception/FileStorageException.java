package com.example.file.uploads.exception;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.file.uploads.exception
 * @auther: YuAn
 * @Date: 2018/9/7
 * @Time: 11:36
 * @Project_name: uploads-files
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
public class FileStorageException extends RuntimeException {


    public FileStorageException(String message){
        super(message);
    }

    public FileStorageException(String message, Throwable cause){
        super(message,cause);
    }
}
