package com.korvin.valid;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.korvin.blog.model.Blog;

public class Demo {

	public static void main(String[] args) {
		Blog blog = new Blog();
		blog.setTitle("test");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		Validator validator = factory.getValidator(); 
		Set<ConstraintViolation<Blog>> violations = validator.validate(blog);
		System.out.println(violations);
	}
}
