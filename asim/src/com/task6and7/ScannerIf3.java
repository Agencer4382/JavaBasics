package com.task6and7;

import java.util.Scanner;

public class ScannerIf3 {

	public static void main(String[] args) {
		boolean thirsty;
		boolean sleepy;
		String drink = "Nothing";
		Scanner kevin = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		thirsty = kevin.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy = kevin.nextBoolean();

		if (thirsty && !(sleepy)) {
			drink = "Water";

		} else if (thirsty && sleepy) {
			drink = "Coffee";
		} else if (!(thirsty) && sleepy) {
			drink = "Tea";

		} else {

		}
		System.out.println("Looks like you need " + drink);

	}

}
