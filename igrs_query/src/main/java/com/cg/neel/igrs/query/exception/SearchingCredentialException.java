/**
 * 
 */
package com.cg.neel.igrs.query.exception;

/**
 * @author User
 *
 */
public class SearchingCredentialException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public  SearchingCredentialException() {
		super("Searching Credentials Exception on server");
	}
	
	public SearchingCredentialException(String message) {
		super(message);
	}

}
