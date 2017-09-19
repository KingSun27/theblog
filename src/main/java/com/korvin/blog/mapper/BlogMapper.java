package com.korvin.blog.mapper;

import com.korvin.blog.model.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface BlogMapper {

    @Select("SELECT * FROM BLOG WHERE ID = ? ")
    Blog findById(@Param("id") String id);

    @Select("SELECT * FROM BLOG  ")
    List<Blog> findAll();
}