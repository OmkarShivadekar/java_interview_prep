package com.prep.concepts;

public class InvalidAgeException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public String message;

	public InvalidAgeException(String message) {
		super(message);
		this.message = message;
	}
	
	
}