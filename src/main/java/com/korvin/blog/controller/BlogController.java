package com.korvin.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korvin.blog.model.Blog;
import com.korvin.blog.service.BlogService;

@Controller
@RequestMapping("/blog")

public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    List<Blog> findAll() {
        return blogService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    @ResponseBody
    Blog findById(@PathVariable Long id) {
        return blogService.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    @ResponseBody
    int delete(@PathVariable Long id) {
        return blogService.delete(id);
    }    
    
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    int findById(@Valid Blog blog) {
        return blogService.update(blog);
    }
    
    @RequestMapping(method= RequestMethod.POST)
    @ResponseBody
    int post(@Valid Blog blog) {
        return blogService.add(blog);
    }
}
