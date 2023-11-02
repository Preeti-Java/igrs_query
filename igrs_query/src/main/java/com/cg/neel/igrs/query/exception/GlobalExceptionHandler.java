/**
 * 
 */
package com.cg.neel.igrs.query.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.neel.igrs.query.utils.GenericResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Preeti
 * @Des Handle all the exception 
 *
 */
@RestControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	private final MessageSource messageSource;
	
	
	@ExceptionHandler({ ResourceNotFoundException.class })
	@ResponseStatus(value =  HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handlerResourceNotFoundException(final ResourceNotFoundException ex, final WebRequest request){
		log.error("404 Not Found",ex);
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.userNotFound", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
	
	@ExceptionHandler({ BadRequestException.class })
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> handlerBadRequestException(final BadRequestException ex, final WebRequest request){
		log.error("400 Bad Request",ex);
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.badRequest", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	

	@ExceptionHandler({ BadCredentialsException.class })
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> handlerBadCredentialsException(final BadCredentialsException ex, final WebRequest request){
		log.error("400 Bad Request",ex);
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.badCredentail", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
	
	@ExceptionHandler({ UnauthorizedException.class })
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	public ResponseEntity<Object> handlerUnauthorizedException(final UnauthorizedException ex, final HttpServletRequest request) {
		log.error("401 Unauthorized",ex);
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.unauthorized", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.UNAUTHORIZED, (WebRequest) request);
			
	}
	
	@ExceptionHandler({ InternalServerErrorException.class })
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Object> handlerInternalServerErrorException(final InternalServerErrorException ex, final WebRequest request) {
		log.error("500 Internal Server Error",ex);
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.internalServerError", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}
	
	@ExceptionHandler({ RequestTimeoutException.class })
	@ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
	public ResponseEntity<Object> handlerRequestTimeoutException(final RequestTimeoutException ex, final WebRequest request) {
		log.error("408 Request Timeout",ex);
		final GenericResponse bodyResponse = new GenericResponse(messageSource.getMessage("message.requestTimeout", null, request.getLocale()));
		return handleExceptionInternal(ex, bodyResponse, new HttpHeaders(), HttpStatus.REQUEST_TIMEOUT, request);	        
	}
	
}
