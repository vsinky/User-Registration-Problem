package com.bridgelabz.regex;

import java.io.FileNotFoundException;

public class UserRegistration {
public static void main(String[] args) throws FileNotFoundException {
		 
		Pattern pattern = Pattern.getInstance();
		Registration registration = Registration.getInstance();

	//	registration.isValidFirstName();
	//	registration.isValidLastName();
//		registration.isValidEmail();
//		registration.isValidPhoneNumber();
//		registration.isValidPassword();
		registration.readFile();
//		pattern.print();

	}
}
