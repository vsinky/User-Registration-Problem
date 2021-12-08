package com.bridgelabz.regex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailMultipleTest {
	
	static Pattern patterns;
	static Registration registration;
	private String email;
	private boolean expectedEmail;

	public EmailMultipleTest(String email, boolean expectedEmail) {
		super();
		this.email = email;
		this.expectedEmail = expectedEmail;
	}
	
	@BeforeClass
	public static void init() {
		System.out.println("Start");
		patterns = Pattern.getInstance();
		registration = Registration.getInstance();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc123@gmail.a", false },
				{ "abc.@gmail.com11", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false } });
	}
	@Test
	public void testEmailShouldBeValid() {
		boolean check = registration.addEmail(email);
		System.out.println(email + " " + check + " -" + expectedEmail);
		assertEquals(expectedEmail, check);
	}
}
