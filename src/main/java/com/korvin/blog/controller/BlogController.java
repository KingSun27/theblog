package com.korvin.blog.controller;

import com.korvin.blog.mapper.BlogMapper;
import com.korvin.blog.model.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping("/blog")

public class BlogController {

    @Autowired
    private BlogMapper blogMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    List<Blog> findAll() {
        return blogMapper.findAll();
    }

    @RequestMapping("/findById")
    @ResponseBody
    Blog findById(@Param("id") String id) {
        return blogMapper.findById(id);
    }
}
