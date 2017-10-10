package com.korvin.blog.factory;

import com.korvin.blog.model.ResultDto;

public class ResultFactory {

	public static ResultDto getSuccessDto() {
		return new ResultDto(ResultDto.SUCCESS, null,null);
	}
	public static ResultDto getSuccessDto(String message) {
		return new ResultDto(ResultDto.SUCCESS, message,null);
	}
	public static ResultDto getFailureDto( ) {
		return new ResultDto(ResultDto.FAILURE, null,null);
	}
	public static ResultDto getFailureDto(String message ) {
		return new ResultDto(ResultDto.FAILURE, message,null);
	}
}
