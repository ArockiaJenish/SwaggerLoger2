package com.jenish.demo.exceptions;

public class UserException extends Exception{

	
	private String message;
	
	public UserException(String message){
		this.message = message;
	}
	
	UserException(){};
	
	public String getMessage() {
		return this.message;
	}

}
