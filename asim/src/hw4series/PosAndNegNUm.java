package hw4series;

import java.util.Scanner;

public class PosAndNegNUm {

	public static void main(String[] args) {
		// The variable "num" holds an integer user input
		// Write a conditional statement starting on line 9 that does the following:
		// If num is positive, print "__ is positive"
		// If num is negative, print "__ is negative"

		int num;
		Scanner kevin = new Scanner(System.in);
		System.out.println("in:");
		num = kevin.nextInt();
		

		if (num < 0) {
			System.out.println(num + " is negative");

		} else if (num > 0) {
			System.out.println(num + " is positive");
			System.out.println("in: ");
			num = kevin.nextInt();

		}else if (num==0) {
			System.out.println("notr");
		}else {
			System.out.println("nop");
		}

	}

}
