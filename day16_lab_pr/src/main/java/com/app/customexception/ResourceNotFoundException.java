package com.app.customexception;

public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException(String errmsg) {
		super(errmsg);
	}
}
