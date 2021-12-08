package com.bridgelabz.regex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class RegistrationTest {

	static Pattern patterns;
	static Registration registration;
	private String email;
	private boolean expectedEmail;

	@BeforeClass
	public static void init() {
		System.out.println("Start");
		patterns = Pattern.getInstance();
		registration = Registration.getInstance();
	}

	@Test
	public void test_Added_FistName_Should_Be_Valid() throws InvalideUserDetailsException {
		System.out.println("for valid:");
		boolean check = registration.isvalidateFirstName.compare("Sinky");
		assertEquals(true, check);

	}

//	@Test
//	public void testAddedFistNameShouldBeInValid() throws InvalideUserDetailsException {
//		System.out.println("for invalid:");
//		boolean check = registration.isvalidateFirstName.compare("aanky");
//		assertEquals(false, check);
//	}

	@Test
	public void testAddedLastNameShouldBeValid() throws InvalideUserDetailsException {
		System.out.println("for valid:");
		boolean check = registration.isvalidateLastName.compare("Verma");
		assertEquals(true, check);
	}

//	@Test
//	public void testAddedLastNameShouldBeInValid() throws InvalideUserDetailsException {
//		System.out.println("for invalid:");
//		boolean check = registration.isvalidateLastName.compare("verma");
//		assertEquals(false,check);
//	}

	@Test
	public void testAddedEmailShouldBeValid() throws InvalideUserDetailsException {
		System.out.println("for valid:");
		boolean check = registration.isvalidateEmail.compare("abc@gmail.com");
		assertEquals(true, check);
	}

//	@Test
//	public void testAddedEmailShouldBeInValid() throws InvalideUserDetailsException {
//		System.out.println("for invalid:");
//		boolean check = registration.isvalidateEmail.compare("abc.abc@gmail.com");
//		assertEquals(false,check );
//	}

	@Test
	public void testAddedPasswordShouldBeValid() throws InvalideUserDetailsException {
		System.out.println("for valid:");
		boolean check = registration.isvalidatePassword.compare("abcD@123");
		assertEquals(true, check);
	}

//	@Test
//	public void testAddedPasswordShouldBeInValid() throws InvalideUserDetailsException {
//		System.out.println("for invalid:");
//	   boolean check = registration.isvalidatePassword.compare("Abc@123");
//		assertEquals(false,check);
//	}

	@Test
	public void testAddedPhoneNumberShouldBeValid() throws InvalideUserDetailsException {
		System.out.println("for valid:");
		boolean check = registration.isvalidatePhone.compare("91 8523697410");
		assertEquals(true, check);
	}

//	@Test
//	public void testAddedPhoneNumberShouldBeInValid() throws InvalideUserDetailsException {
//		System.out.println("for invalid:");
//		boolean check = registration.isvalidatePhone.compare("9178535689");
//		assertEquals(false,check);
//	}

	@After
	public void endTask() {
		System.out.println("End");
	}

}
