package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetailsValidation {
	static String regex;

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

	/*
	 * @purpose:As a User need to enter a valid email E.g. abc.xyz@bl.co.in - Email
	 * has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @
	 * and . positions
	 * 
	 * @function: To check email is Valid or not
	 */
	public static void isValidEmail(String email) {
		regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	/*
	 * @purpose:As a User need to follow pre defined Mobile Format - E.g. 91
	 * 9919819801 - Country code follow by space and 10 digit number
	 * 
	 * @function: To check MobileNumber is Valid or not
	 */
	public static void isValidMobileNumber(String mobileNumber) {
		regex = "^[91]+[ ]?[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	/*
	 * @purpose:As a User need to follow pre-defined Password rules.- NOTE – All
	 * rules must be passed Rule1 – minimum 8 Characters Rule2 – Should have at
	 * least 1 Upper Case
	 * 
	 * @function: To check password is Valid or not
	 */
	public static void isValidPassword(String password) {
		regex = "^[a-z](?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
