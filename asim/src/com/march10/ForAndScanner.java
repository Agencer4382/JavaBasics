package com.march10;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		/*
		 * promtp user to enter2 int and compare at the and print largest
		 */
		Scanner kevin = new Scanner(System.in);

		int num1, num2;
		int largest = 0;
		for (int x = 1; x <= 5; x++) {
			System.out.println("enter  num1");
			num1 = kevin.nextInt();
			System.out.println("enter  num2");
			num2 = kevin.nextInt();

			if (num1 > num2) {
				largest = num1;

			} else if (num2 > num1) {
				largest = num2;
			} else {
				System.out.println(num1 + "" + num2);

			}
			System.out.println(largest + " is the largest");
		}
	}

}
