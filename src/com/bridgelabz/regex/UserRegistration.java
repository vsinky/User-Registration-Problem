package com.bridgelabz.regex;

import java.io.FileNotFoundException;

public class UserRegistration {
	public static void main(String[] args) throws InvalideUserDetailsException, FileNotFoundException {

		Pattern pattern = Pattern.getInstance();
		Registration registration = Registration.getInstance();

		System.out.println(registration.isvalidateFirstName.compare("Sinky"));
		System.out.println(registration.isvalidateLastName.compare("Verma"));
		System.out.println(registration.isvalidateEmail.compare("Sinky@gmail.com"));
		System.out.println(registration.isvalidatePhone.compare("91 8596741236"));
		System.out.println(registration.isvalidatePassword.compare("sinky@123"));

		// registration.readFile();
		pattern.print();

	}
}
