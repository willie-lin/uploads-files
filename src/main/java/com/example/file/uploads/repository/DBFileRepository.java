package com.example.file.uploads.repository;

import com.example.file.uploads.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.example.file.uploads.repository
 * @auther: YuAn
 * @Date: 2018/9/7
 * @Time: 11:17
 * @Project_name: uploads-files
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}
