package com.korvin.blog.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
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
	/**
	 * id database autoincrement  
	 */
	public int add(Blog blog) {
		return blogMapper.add(blog);
	}
}
