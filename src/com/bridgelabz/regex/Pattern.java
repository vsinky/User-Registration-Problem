package com.bridgelabz.regex;

import java.util.Scanner;

public class Pattern {
	private String firstName;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
