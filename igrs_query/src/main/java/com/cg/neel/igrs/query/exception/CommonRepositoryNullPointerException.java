package com.cg.neel.igrs.query.exception;

public class CommonRepositoryNullPointerException extends Exception {

	private String msg;
	
	public CommonRepositoryNullPointerException(String msg) {
		this.msg=msg;
	}

	private static final long serialVersionUID = -2013800762967246160L;

	@Override
	public String getMessage() {
		
		return this.msg;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		return super.getStackTrace();
	}

}
