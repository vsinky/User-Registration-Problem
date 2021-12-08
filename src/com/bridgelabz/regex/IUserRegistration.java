package com.bridgelabz.regex;

@FunctionalInterface
public interface IUserRegistration {

	boolean compare(String inputs) throws InvalideUserDetailsException;
}
