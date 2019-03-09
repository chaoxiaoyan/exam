package com.chaoxiaoyan.exam.service;

import com.chaoxiaoyan.exam.entity.Document;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentService {

    public List<Document> findAll();


    public void add(String name, String descripe, String huanman, String createtime,String type);


    public Document findById(Integer id);


    public void updateBiId(Integer id,String name, String descripe, String huanman, String createtime);


    public void deleteById(Integer id);

    public List<String> findAllType();


    public List<Document> findByType(String type);
}
