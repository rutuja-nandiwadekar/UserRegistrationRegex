package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
	static Scanner scanner = new Scanner(System.in);
	static String firstName, lastName;

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Problem");
		// calling method
		userFirstName();
		userLastName();
	}

	// UC1 Ability to add first name
	public static void userFirstName() {
		System.out.println("Enter your First Name");
		firstName = scanner.next();
		UserDetailsValidation.isValidFirstName(firstName);
	}

	// UC2 Ability to add last name
	public static void userLastName() {
		System.out.println("Enter your Last Name");
		lastName = scanner.next();
		UserDetailsValidation.isValidFirstName(lastName);
	}
}
