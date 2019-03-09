package com.chaoxiaoyan.exam.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Document {
    private Integer id;

    private String name;

    private String descripe;

    private String huanman;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe == null ? null : descripe.trim();
    }

    public String getHuanman() {
        return huanman;
    }

    public void setHuanman(String huanman) {
        this.huanman = huanman == null ? null : huanman.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}