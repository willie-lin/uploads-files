package com.example.file.uploads.service;

import com.example.file.uploads.exception.FileStorageException;
import com.example.file.uploads.exception.MyFileNotFoundException;
import com.example.file.uploads.model.DBFile;
import com.example.file.uploads.repository.DBFileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.StringUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.example.file.uploads.service
 * @auther: YuAn
 * @Date: 2018/9/7
 * @Time: 11:19
 * @Project_name: uploads-files
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Service
public class DBFileStorageService {


    @Autowired
    private DBFileRepository dbFileRepository;

    public DBFile storeFile (MultipartFile file){

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters

            if (fileName.contains("...")){
                throw new FileStorageException("Sorry ! FileName contains invalid path sequence" + fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());

            return dbFileRepository.save(dbFile);


        } catch (IOException e) {
            throw new FileStorageException("Could not store file" + fileName + ". Please try again!" + e);
        }

    }


    public DBFile getFile(String fileId){
        return dbFileRepository.findById(fileId).orElseThrow(() -> new MyFileNotFoundException("File not found with id" + fileId)
        );
    }

}
