package com.korvin.common;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class CentralControllerHandler {

	/**
	 *  捕获到BindException,直接返回会出错
	 *  前台不需要这多异常信息，以后再这里对异常信息进行处理，返回更简要的信息给前台。
	 */
/*	@ExceptionHandler({BindException.class})
	public ResponseEntity<BindException> handleValidationException(BindException e) {

		return new ResponseEntity<BindException>(e, HttpStatus.BAD_REQUEST);
	}*/
}