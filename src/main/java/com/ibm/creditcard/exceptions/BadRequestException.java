package com.ibm.creditcard.exceptions;

public class BadRequestException extends RuntimeException{

	public BadRequestException(String message) {
		super(message);
	}
	
	private static final long serialVersionUID = 8623273960307424434L;
}
