package com.lpu.boot3.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ArithmeticException.class)
	public Map<String,String> handleArithmeticException(ArithmeticException ae) {
		  Map<String,String> map=new HashMap<>();
		  map.put("Error", ae.getMessage());
		  return map;
	}
	
	
	@ExceptionHandler(AgeInvalidException.class)
	public Map<String,String> handleAgeInvalidException(AgeInvalidException a){
		
		 Map<String,String> map=new HashMap<>();
		 map.put("ERROR", a.getMessage());
		 map.put("key", "try to give age greater than 18");
		 return map;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
	   Map<String,String> map=new HashMap<>();
	   
	   ex.getBindingResult().getFieldErrors().forEach(error->map.put(error.getField(),error.getDefaultMessage()));
	   return map;
	   
	}
	
	@ExceptionHandler(Exception.class)
	public Map<String,String> handleAllException(Exception e){
		    Map<String,String> map=new HashMap<>();
		    map.put("error",e.getMessage());
		    return map;
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	  public ResponseEntity<Map<String,String>> handleConstraintException(ConstraintViolationException ex){
 
		  Map<String, String> errors = new HashMap<>();

	        for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {

	            String fieldName = violation.getPropertyPath().toString();
	            String errorMessage = violation.getMessage();

	            errors.put(fieldName, errorMessage);
	        }
		
	        return ResponseEntity.badRequest().body(errors);

		                         
		 
	 }
	

}
