package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {
	/*
	 * @purpose: As a User need to enter a valid First Name. First name starts with
	 * Cap and has minimum 3 characters
	 * 
	 * @function: To check first name is Valid or not
	 */
	public static void isValidFirstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	/*
	 * @purpose: As a User need to enter a valid Last Name. Last name starts with
	 * Cap and has minimum 3 characters
	 * 
	 * @function: To check last name is Valid or not
	 */
	public static void isValidLastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
