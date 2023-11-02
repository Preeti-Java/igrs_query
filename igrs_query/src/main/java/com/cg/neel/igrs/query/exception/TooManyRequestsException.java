package com.cg.neel.igrs.query.exception;

public class TooManyRequestsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TooManyRequestsException() {
		super("Too Many Request Exception on server");
		
	}

	public TooManyRequestsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public TooManyRequestsException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public TooManyRequestsException(String message) {
		super(message);
		
	}

	public TooManyRequestsException(Throwable cause) {
		super(cause);
	}
	
	
	
}
