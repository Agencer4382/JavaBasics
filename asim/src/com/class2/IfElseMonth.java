package com.class2;
import java.util.Scanner;


public class IfElseMonth {

	public static void main(String[] args) {
		int month = 6;
		Scanner kevin=new Scanner(System.in);
		System.out.println("enter num here");
		month=kevin.nextInt();
		
		if (month == 1) {
			System.out.println("will display january");

		} else if (month == 2) {
			System.out.println("will display february");

		} else if (month == 3) {
			System.out.println("will display march");

		} else if (month == 4) {
			System.out.println("will display april");

		} else if (month == 5) {
			System.out.println("will display may");

		} else if (month == 6) {
			System.out.println("will display jun");

		} else if (month == 7) {
			System.out.println("will display july");

		} else if (month == 8) {
			System.out.println("will display august");

		} else if (month == 9) {
			System.out.println("will display september");

		} else if (month == 10) {
			System.out.println("will display october");

		} else if (month == 11) {
			System.out.println("will display november");
		} else if (month == 12) {
			System.out.println("will display december");
		}else {
			System.out.println("Invalid");
		}
	}
}
