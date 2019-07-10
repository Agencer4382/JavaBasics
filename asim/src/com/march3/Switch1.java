package com.march3;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {

		int number;
		String grade;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter your grade");
		number = kevin.nextInt();

		switch (number) {
		case 1:
			grade = "beginner";
			break;
		case 2:
			grade = "medium";
			break;
		case 3:
			grade = "expert";
			break;

		default:
			grade = "not grade";

		}
		System.out.println("your grade is " + grade);

	}

}
