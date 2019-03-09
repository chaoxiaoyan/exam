package com.chaoxiaoyan.exam.controller;

import com.chaoxiaoyan.exam.content.JsonBean;
import com.chaoxiaoyan.exam.entity.Document;
import com.chaoxiaoyan.exam.service.DocumentService;
import com.chaoxiaoyan.exam.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    JsonBean bean = new JsonBean();

    @RequestMapping("list.do")
    public JsonBean findAll() {
        try {
            List<Document> list = documentService.findAll();
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("add.do")
    public JsonBean add(String name, String descripe, String huanman, String createtime,String type) {
       // System.out.println(createtime);
        try {
            documentService.add(name, descripe,  huanman, createtime,type);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @RequestMapping("update.do")
    public JsonBean update(Integer id, String name, String descripe, String huanman, String createtime) {
       // System.out.println(createtime);
        try {
            documentService.updateBiId(id, name, descripe,  huanman, createtime);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("find.do")
    public JsonBean findDocument(Integer id) {
        try {
            Document document = documentService.findById(id);
            bean = JsonUtils.createJsonBean(1,document);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("type.do")
    public JsonBean findAllTyoe() {
        try {
            List<String> list = documentService.findAllType();
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }
    @RequestMapping("findByType.do")
    public JsonBean findByType(String type) {
        try {
            List<Document> list = documentService.findByType(type);
            bean = JsonUtils.createJsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

    @RequestMapping("delete.do")
    public JsonBean deleteDocument(Integer id) {
        try {
            documentService.deleteById(id);
            bean = JsonUtils.createJsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0,e.getMessage());
        }
        return bean;
    }

}
