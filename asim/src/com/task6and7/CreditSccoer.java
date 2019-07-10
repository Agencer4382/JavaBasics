package com.task6and7;

import java.util.Scanner;

public class CreditSccoer {

	public static void main(String[] args) {
		int loan, score;
		boolean result;
		String eligible = "unknown";

		Scanner kevin = new Scanner(System.in);
		System.out.println("Do you need loan");
		result = kevin.nextBoolean();

		if (result) {

			System.out.println("What is your credit score");
			score = kevin.nextInt();

			if (score < 600) {
				eligible = "Not eligible";

			} else if (score >= 600 && score <= 700) {
				eligible = "Maybe eligible";

			} else if (score >= 701 && score <= 800) {
				eligible = "Eligible";

			} else {
				eligible = "Definitely eligible";

			}

		}
		System.out.println("The eligibility is " + eligible);
	}
}
