package com.class2;

import java.util.Scanner;

public class SalaryCal {

	public static void main(String[] args) {
		int worked;
		int annSalary;
		int bonus1 = 5000;
		int bonus2 = 3000;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter worked number:");
		worked = kevin.nextInt();
		System.out.println("enter annSalary: ");
		annSalary = kevin.nextInt();
		if (worked <= 5) {
			System.out.println("no bonus");
		} else {
			System.out.println("you can get bonus");
			if (annSalary > 50000) {
				System.out.println("get bonus "+bonus1);

			} else {
				System.out.println("get bonus "+bonus2);
			}
		}

	}

}
