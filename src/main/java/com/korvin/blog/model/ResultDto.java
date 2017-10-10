package com.korvin.blog.model;

public class ResultDto {
	
	public static final int SUCCESS = 0;
	public static final int FAILURE = 1;

	private int code;
	private String message;
	private Object result;
	
	public ResultDto(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResultDto(int code, Object result) {
		this.code = code;
		this.result = result;
	}

	public ResultDto(int code, String message, Object result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
}
