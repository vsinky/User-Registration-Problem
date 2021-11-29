package com.bridgelabz.regex;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegistrationTest {
	static Pattern patterns;
	static Registration registration;
	
	@BeforeClass
	public static void init() {
		System.out.println("Start");
		patterns = Pattern.getInstance();
		registration = Registration.getInstance();
	}

	@Test
	public void test_Added_FistName_Should_Be_Valid() {
		System.out.println("for valid:");
		registration.isValidFirstName();
		boolean check = patterns.getFirstName().matches(registration.NAME);
		assertEquals(true, check);

	}

	@Test
	public void testAddedFistNameShouldBeInValid() {
		System.out.println("for invalid:");
		registration.isValidFirstName();
		boolean check = patterns.getFirstName().matches(registration.NAME);
		System.out.println(check);
		assertEquals(false, check);
	}

	@Test
	public void testAddedLastNameShouldBeValid() {
		System.out.println("for valid:");
		registration.isValidLastName();
		assertEquals(true,patterns.getLastName().matches(registration.NAME));
	}

	@Test
	public void testAddedLastNameShouldBeInValid() {
		System.out.println("for invalid:");
		registration.isValidLastName();
		assertEquals(false, patterns.getLastName().matches(registration.NAME));
	}

	@Test
	public void testAddedEmailShouldBeValid() {
		System.out.println("for valid:");
		registration.isValidEmail();
		assertEquals(true, patterns.getEmail().matches(registration.EMAIL));
	}

	@Test
	public void testAddedEmailShouldBeInValid() {
		System.out.println("for invalid:");
		registration.isValidEmail();
		assertEquals(false, patterns.getEmail().matches(registration.EMAIL));
	}

	@Test
	public void testAddedPasswordShouldBeValid() {
		System.out.println("for valid:");
		registration.isValidPassword();
		assertEquals(true, patterns.getPassword().matches(registration.PASSWORD));
	}

	@Test
	public void testAddedPasswordShouldBeInValid() {
		System.out.println("for invalid:");
		registration.isValidPassword();
		assertEquals(false, patterns.getPassword().matches(registration.PASSWORD));
	}

	@Test
	public void testAddedPhoneNumberShouldBeValid() {
		System.out.println("for valid:");
		registration.isValidPhoneNumber();
		assertEquals(true, patterns.getPhoneNumber().matches(registration.PHONE_NUMBER));
	}

	@Test
	public void testAddedPhoneNumberShouldBeInValid() {
		System.out.println("for invalid:");
		registration.isValidPhoneNumber();
		assertEquals(false, patterns.getPhoneNumber().matches(registration.PHONE_NUMBER));
	}

	@After
	public void endTask() {
		System.out.println("End task");
	}
}
