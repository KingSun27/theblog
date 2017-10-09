package com.korvin.blog.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class User {

	
	@NotBlank
	@Size(max = 20)
	private String username;
	@NotBlank
	@Size(max = 20)
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
