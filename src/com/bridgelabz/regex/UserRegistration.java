package com.bridgelabz.regex;

public class UserRegistration {

	public static void main(String[] args) {
		Pattern pattern = new Pattern();

		pattern.isValidFirstName();
		pattern.isValidLastName();
		pattern.isValidEmail();
		pattern.isValidPhoneNumber();
        pattern.print();
        
	}
}
