package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.List;

public class Pattern {
	public static Pattern instance;
	private String firstName, lastName, email, password, phoneNumber;
	static List<String> validEmail;
	static List<String> invalidEmail;

	private Pattern() {
		validEmail = new ArrayList<>();
		invalidEmail = new ArrayList<>();
	}

	public static List<String> getValidEmail() {
		return validEmail;
	}

	public static void setValidEmail(List<String> validEmail) {
		Pattern.validEmail = validEmail;
	}

	public static List<String> getInvalidEmail() {
		return invalidEmail;
	}

	public static void setInvalidEmail(List<String> invalidEmail) {
		Pattern.invalidEmail = invalidEmail;
	}

	public static Pattern getInstance() {
		if (instance == null) {
			instance = new Pattern();
		}
		return instance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void print() {
		System.out.println("[firstName=" + firstName + ", lastName=" + lastName + ",email=" + email + ",phoneNumber="
				+ phoneNumber + ",password=" + password + "]");

	}

}
