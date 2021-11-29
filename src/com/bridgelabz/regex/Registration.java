package com.bridgelabz.regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	public void isValidFirstName() {
		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		Pattern pattern = Pattern.getInstance();
		pattern.setFirstName(firstName);
		boolean check = firstName.matches("NAME");
//		if (check == true) {
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid ");
//			isValidFirstName();
//		}
	}

	public void isValidLastName() {

		System.out.print("Enter Last Name : ");
		lastName = sc.nextLine();
		Pattern pattern = Pattern.getInstance();
		pattern.setLastName(lastName);
		boolean check = lastName.matches("NAME");
//		if (check == true) {
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid ");
//			isValidLastName();
//		}
	}

	public void isValidEmail() {
		System.out.print("Enter Email : ");
		email = sc.nextLine();
		Pattern pattern = Pattern.getInstance();
		pattern.setEmail(email);
		boolean check = email.matches("EMAIL");
//		if (check == true) {
//			System.out.println("Valid");
//		} else {
//			System.out.println("Invalid (Eg:abc.xyz@bl.co.in)");
//			isValidEmail();
//		}
	}

	public void isValidPhoneNumber() {
		System.out.print("Enter Phone Number : ");
		phoneNumber = sc.nextLine();
		Pattern pattern = Pattern.getInstance();
		pattern.setPhoneNumber(phoneNumber);
		boolean check = phoneNumber.matches("PHONE_NUMBER");
//		if (check == true) {
//		} else {
//			System.out.println("Invalid");
//			isValidPhoneNumber();
//		}
	}

	public void isValidPassword() {
		System.out.print("Enter Password : ");
		password = sc.nextLine();
		Pattern pattern = Pattern.getInstance();
		pattern.setPassword(password);
		boolean check = password.matches("PASSWORD");
//		if (check == true) {
//		} else {
//			System.out.println("Invalid [Atleast 8 char / 1 Upper Case / 1 numaeric number]");
//			isValidPassword();
//		}
	}

	public void readFile() throws FileNotFoundException {
		File file = new File("E:\\RFP_Java_80\\user-registration-problem\\src\\DifferentEmail.txt");

		Scanner sc = new Scanner(file);

		String emails = null;
		while (sc.hasNextLine())
			emails = sc.nextLine();
		System.out.println("Total email:-\n" + emails);

		String[] emailArr = emails.split(",");
		List<String> validEmail = new ArrayList<>();
		List<String> invalidEmail = new ArrayList<>();
		Pattern pattern = Pattern.getInstance();
		for (String a : emailArr) {
			boolean check = a.matches(EMAIL);
			if (check == true) {
				pattern.validEmail.add(a);

			} else {
				pattern.invalidEmail.add(a);
			}
		}
		System.out.println("\n-Valid Email- :");
		for (String a : pattern.validEmail)
			System.out.println(a);

		System.out.println("\n-InValid Email- :");
		for (String a : pattern.invalidEmail)
			System.out.println(a);
		sc.close();
	}

	public boolean addEmail(String email2) {
		email = email2;
		boolean check = email.matches(EMAIL);
		return check;
	}

}
