package com.app.ExceptionHandler;

import javax.validation.ConstraintViolationException;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.app.customexception.*;
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e){
		System.out.println("handle resource not found exception "+e);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Enter valid movie name!!!");
	}
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e){
		System.out.println("Release date is before todays date "+e);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Enter future date!!!! or Movie name Cannot be blank");
	}
 
}
