package com.example.file.uploads.payload;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.file.uploads.payload
 * @auther: YuAn
 * @Date: 2018/9/7
 * @Time: 15:48
 * @Project_name: uploads-files
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Data
public class UploadFileResponse {

    private String fileName;

    private String fileDownloadUri;

    private String fileType;

    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }
}
