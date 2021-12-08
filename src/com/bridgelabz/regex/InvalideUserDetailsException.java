package com.bridgelabz.regex;

public class InvalideUserDetailsException extends Exception {
	enum Exception {
		FirstName, LastName, Email, Password, PhoneNumber
	};

	Exception exception;

	InvalideUserDetailsException(String message, Exception exception) {

		super(message);
		this.exception = exception;
	}

}
