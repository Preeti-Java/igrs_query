package com.cg.neel.igrs.query.exception;

public class BadRequestException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public  BadRequestException() {
		super("Bad Request Exception on server");
	}
	
	public BadRequestException(String message) {
		super(message);
	}

}
