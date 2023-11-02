package com.cg.neel.igrs.query.exception;

public class BadCredentialsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public  BadCredentialsException() {
		super("Bad Credentials Exception on server");
	}
	
	public BadCredentialsException(String message) {
		super(message);
	}

}
