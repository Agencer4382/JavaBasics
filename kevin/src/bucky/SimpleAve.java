package bucky;

import java.util.Scanner;

public class SimpleAve {

	public static void main(String[] args) {
		Scanner kevin = new Scanner(System.in);

		int total = 0;
		int grade;
		int average;
		int counter = 0;

		while (counter < 5) {
			grade = kevin.nextInt();
			total = total + grade;
			counter++;

		}
		average = total / 5;
		System.out.println("your average is " + average);

	}

}
