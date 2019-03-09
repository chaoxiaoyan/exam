package com.chaoxiaoyan.exam.dao;

import com.chaoxiaoyan.exam.entity.Document;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    int insertSelective(Document record);

    Document selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);

    List<Document> selectAll();

    int add(@Param("name") String name,@Param("descripe") String descripe,@Param("huanman")
            String huanman,@Param("createtime") String createtime,@Param("type") String type);
    void updateById(@Param("id") Integer id,@Param("name") String name,@Param("descripe") String descripe,@Param("huanman")
            String huanman,@Param("createtime") String createtime);

    List<String> findAllType();

    List<Document> selectByType(@Param("type") String type);
}