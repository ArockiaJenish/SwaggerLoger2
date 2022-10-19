package com.jenish.demo.exceptions;

public class UserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public UserException(String message){
		this.message = message;
	}
	
	UserException(){};
	
	public String getMessage() {
		return this.message;
	}

}
