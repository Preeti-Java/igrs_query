package com.cg.neel.igrs.query.exception;

public class UnauthorizedException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	

	public UnauthorizedException() {
		super("Unauthorized Exception on server");
		
	}

	public UnauthorizedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

	public UnauthorizedException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UnauthorizedException(String message) {
		super(message);
		
	}

	public UnauthorizedException(Throwable cause) {
		super(cause);
		
	}
	
	

}
