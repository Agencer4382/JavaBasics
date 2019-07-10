package com.march9class;

import java.util.Scanner;

public class DoWhileSoda {

	public static void main(String[] args) {
		/*
		 * ask user to pay for a soda keep asking user to pay for soda until entered
		 * price is not equal to 1.99 after user got a right amount print
		 * "enter enjoy your soda"
		 */

		double price;
		String soda;
		Scanner kevin = new Scanner(System.in);

		do {
			System.out.println("are you pay for soda");
			price=kevin.nextDouble();
			

		} while (price!=1.99);
		System.out.println("enjoy your soda "+price);
	
	

	}
	
}


