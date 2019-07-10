package com.task6and7;

import java.util.Scanner;

public class ScannerIf2 {

	public static void main(String[] args) {

		int birnum;
		String season = "Unknown";

		Scanner kevin = new Scanner(System.in);
		System.out.println("Please enter your birthday month number");
		birnum = kevin.nextInt();

		if (birnum == 12 || birnum == 1 || birnum == 2) {
			season = "Winter";

		} else if (birnum == 3 || birnum == 4 || birnum == 5) {
			season = "Spring";

		} else if (birnum == 6 || birnum == 7 || birnum == 8) {
			season = "Summer";

		} else if (birnum == 9 || birnum == 10 || birnum == 11) {
			season = "Fall";
		} else {
			System.out.println("Please enter valid month number");
		}
		System.out.println("You were born in " + season);
	}

}
