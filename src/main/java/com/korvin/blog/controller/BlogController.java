package com.korvin.blog.controller;

import com.korvin.blog.mapper.BlogMapper;
import com.korvin.blog.model.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping("/blog")

public class BlogController {

    @Autowired
    private BlogMapper blogMapper;

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    List<Blog> get() {
        return blogMapper.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    @ResponseBody
    Blog findById(@PathVariable Long id) {
        return blogMapper.findById(id);
    }
}
