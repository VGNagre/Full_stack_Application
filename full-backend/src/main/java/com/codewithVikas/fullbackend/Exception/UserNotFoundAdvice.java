package com.codewithVikas.fullbackend.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codewithVikas.fullbackend.model.User;

@ControllerAdvice
public class UserNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String,String> exceptionHandler(UserNotFoundException exception){
		
		Map<String,String> errorMap = new HashMap<>();
		errorMap.put("errorMessage",exception.getMessage());
		
		return errorMap;
	}
	
	
}