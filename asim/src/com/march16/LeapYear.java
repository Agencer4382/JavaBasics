package com.march16;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		 /* Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the loop.
		 */
		int leapYear = 0;
		boolean result = false;

		Scanner sc = new Scanner(System.in);

		for (int x = 1; x <= 10; x++) {
			System.out.println("Input a leap year : ");
			leapYear = sc.nextInt();
			if (leapYear % 4 == 0) {
				System.out.println("You got it!!");
				result = true;
				break;
				}
			}
		if (result == false) {
			System.out.println("You  lost the game:(");
		}

	}

}
