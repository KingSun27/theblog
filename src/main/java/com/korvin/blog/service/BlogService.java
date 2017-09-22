package com.korvin.blog.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korvin.blog.mapper.BlogMapper;
import com.korvin.blog.model.Blog;

@Service
public class BlogService {

	@Autowired
	private BlogMapper blogMapper;

	public Blog findById(Long id) {
		return blogMapper.findById(id);
	}

	public List<Blog> findAll() {
		return blogMapper.findAll();
	}
	
	public int update(Blog blog) {
		return blogMapper.update(blog);
	}
	    
	public int delete(Long id) {
		return blogMapper.delete(id);
	}
	/**
	 * id database auto increase  
	 */
	public int add(Blog blog) {
		return blogMapper.add(blog);
	}
}
