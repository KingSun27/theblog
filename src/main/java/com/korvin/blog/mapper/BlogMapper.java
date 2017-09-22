package com.korvin.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.korvin.blog.model.Blog;


@Mapper
public interface BlogMapper {

    @Select("SELECT * FROM BLOG WHERE ID = #{id} ")
    Blog findById(Long id);

    @Select("SELECT * FROM BLOG ")
    List<Blog> findAll();
    
    @Insert("insert into BLOG(title,content)values( #{title} ,#{content})")
    int add(Blog blog);
    
    @Insert("update BLOG set title=#{title} ,content = #{content})"
    		+ "where  ID = #{id}")
    int update(Blog blog);
    
    @Insert("delete from BLOG where id = = #{id}")
    int delete(Long id);
    
    @Insert("select max(id) from BLOG ")
    int getMaxId();
}