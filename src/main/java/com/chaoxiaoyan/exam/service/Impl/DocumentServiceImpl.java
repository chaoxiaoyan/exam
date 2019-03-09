package com.chaoxiaoyan.exam.service.Impl;

import com.chaoxiaoyan.exam.dao.DocumentMapper;
import com.chaoxiaoyan.exam.entity.Document;
import com.chaoxiaoyan.exam.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {


    @Autowired
    private DocumentMapper documentMapper;


    @Override
    public List<Document> findAll() {
        return documentMapper.selectAll();
    }

    @Override
    public void add(String name, String descripe, String huanman, String createtime,String type) {
        documentMapper.add(name, descripe,  huanman, createtime,type);
    }

    @Override
    public Document findById(Integer id) {
        return documentMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateBiId(Integer id,String name, String descripe, String huanman, String createtime) {
        documentMapper.updateById(id,name, descripe,  huanman, createtime);
    }

    @Override
    public void deleteById(Integer id) {

        documentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<String> findAllType() {
        return documentMapper.findAllType();
    }

    @Override
    public List<Document> findByType(String type) {
        return documentMapper.selectByType(type);
    }
}
