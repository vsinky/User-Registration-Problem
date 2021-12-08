package com.bridgelabz.regex;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.regex.InvalideUserDetailsException.Exception;

public class Registration {
	public static Registration instance;
	public final static String NAME = "^([A-Z]{1}+[a-z]{2,})*$";
	public final static String EMAIL = "^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
	public final static String PHONE_NUMBER = "^([0-9]{1,2})\\s([0-9]{10})$";
	public final static String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@]).{8,}$";

	private String firstName, lastName, email, phoneNumber, password;

	Scanner sc = new Scanner(System.in);

	public static Registration getInstance() {
		if (instance == null) {
			instance = new Registration();
		}
		return instance;
	}

	// public static void validatePattern() {
	// Scanner sc = new Scanner(System.in);
	Pattern pattern = new Pattern();

	IUserRegistration isvalidateFirstName = (FirstName) -> {
		System.out.print("Enter First Name : ");
		String firstName = sc.nextLine();
		pattern.setFirstName(firstName);
		if (FirstName.matches(NAME))
			return true;
		throw new InvalideUserDetailsException("First Name Invalid Exception", Exception.FirstName);
	};

	IUserRegistration isvalidateLastName = (LastName) -> {
		System.out.println("Enter Last Name :  ");
		String lastName = sc.nextLine();
		pattern.setLastName(lastName);
		if (LastName.matches(NAME))
			return true;
		throw new InvalideUserDetailsException("Last Name Invalid Exception", Exception.LastName);
	};

	IUserRegistration isvalidateEmail = (Email) -> {
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		pattern.setEmail(email);
		if (Email.matches(EMAIL))
			return true;
		throw new InvalideUserDetailsException("Email Invalid Exception", Exception.Email);
	};

	IUserRegistration isvalidatePhone = (phone) -> {
		System.out.println("Enter PhoneNumber:  ");
		String phoneNumber = sc.nextLine();
		pattern.setPhoneNumber(phoneNumber);
		if (phone.matches(PHONE_NUMBER))
			return true;
		throw new InvalideUserDetailsException("Mobile Phone Number Invalid Exception", Exception.PhoneNumber);
	};

	IUserRegistration isvalidatePassword = (pass) -> {
		System.out.println("Enter Password:  ");
		String password = sc.nextLine();
		pattern.setPassword(password);
		if (pass.matches(PASSWORD))
			return true;
		throw new InvalideUserDetailsException("Password Invalid Exception", Exception.Password);
	};

	public boolean addEmail(String email2) {
		email = email2;
		boolean check = email.matches(EMAIL);
		return check;
	}

}
