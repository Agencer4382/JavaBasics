package com.class2;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		int mortgagePrice;
		double mortgageRate;
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter mortgage rate:");
		mortgageRate = kevin.nextDouble();
		System.out.println("enter mortgage price here:");
		mortgagePrice = kevin.nextInt();

		if (mortgageRate > 4.5) {

			System.out.println("do not buy house");

		} else {
			System.out.println("buy it house");
			if (mortgagePrice > 200000) {
				System.out.println("take a loan");

			} else {
				System.out.println("pay cash");
			}
		}

	}

}
