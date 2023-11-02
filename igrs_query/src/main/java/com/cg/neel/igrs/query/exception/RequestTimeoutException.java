package com.cg.neel.igrs.query.exception;

public class RequestTimeoutException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public RequestTimeoutException() {
		super("Request Time Out Exception on server");
		// TODO Auto-generated constructor stub
	}

	public RequestTimeoutException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RequestTimeoutException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RequestTimeoutException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RequestTimeoutException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
