package com.bridgelabz.regex;

public class Pattern {
	public static Pattern instance;
	private String firstName, lastName, email, password, phoneNumber;

	private Pattern() {

	}

	public static Pattern getInstance() {
		if (instance == null) {
			instance = new Pattern();
		}
		return instance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void print() {
		System.out.println("[firstName=" + firstName + ", lastName=" + lastName + ",email=" + email + ",phoneNumber="
				+ phoneNumber + ",password=" + password + "]");

	}

}
