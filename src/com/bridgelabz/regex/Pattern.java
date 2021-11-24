package com.bridgelabz.regex;

import java.util.Scanner;

public class Pattern {
	private String firstName , lastName, email;

	Scanner sc = new Scanner(System.in);

	public void isValidFirstName() {

		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		boolean check = firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid ");
			isValidFirstName();
		}
	}
	
	public void isValidLastName() {

		System.out.print("Enter Last Name : ");
		lastName = sc.nextLine();
		boolean check = lastName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid ");
			isValidLastName();
		}
	}
	
	public void isValidEmail() {
		System.out.print("Enter Email : ");
		email = sc.nextLine();
		boolean check = email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");
		if (check == true) {
		} else {
			System.out.println("Invalid (Eg:abc.xyz@bl.co.in)");
			isValidEmail();
		}
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

	public void print() {
	System.out.println("[firstName=" + firstName + ", lastName=" + lastName + ",email=" + email+"]");
		
	}
}
