package com.March24;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		String Pasword, conPasword;

		System.out.println("Enter pasword: ");

		Pasword = sc.next();
		String username;

		do {

			System.out.println("Enter username: ");
			username = sc.next();
			System.out.println("Enter conpasword: ");
			conPasword = sc.next();

			if (!(username.isEmpty() && Pasword.isEmpty())) {

				if (Pasword.length() > 8) {
					if (!Pasword.contains(username)) {

						if (Pasword.equals(conPasword)) {
							running = false;

						} else {
							System.out.println("Passwords do not match");
						}

					} else {
						System.out.println("Password cannot contain username");

					}
				} else {
					System.out.println("Password is too short");
				}

			} else {
				System.out.println("Username and Password cannot be empty");
			}
		} while (running);
		System.out.println("Your username and password has been created");
	}
}
