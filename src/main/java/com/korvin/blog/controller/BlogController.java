package com.korvin.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korvin.blog.model.Blog;
import com.korvin.blog.service.BlogService;
import com.korvin.common.Config;

@Controller
@RequestMapping("/blog")
public class BlogController {
	private static final Logger log = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private BlogService blogService;
	
    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    @Cacheable("blogs")
    List<Blog> findAll() {
    	try {
    		log.info("正在寻找blogs——");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
    int update(@Valid Blog blog) {
        return blogService.update(blog);
    }
    
    @RequestMapping(method= RequestMethod.POST)
    @ResponseBody
    int post(@Valid Blog blog) {
        return blogService.add(blog);
    }
}
