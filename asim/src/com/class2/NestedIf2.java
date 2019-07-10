package com.class2;

public class NestedIf2 {
	// declare variable for gpa and having a diploma
	// if user has a diploma -->congratulations--> if gpa is higher
	// 3.5-->hire....else don hire

	public static void main(String[] args) {
		double gpa = 3.6;
		double exGpa = 3.7;
		boolean hasDiploma = true;

		if (hasDiploma) {
			System.out.println("congratulations");
			if (gpa > exGpa) {
				System.out.println("you are hired");
			} else {
				System.out.println("we con not hired");
			}

		} else {
			System.out.println("get your degree");
		}

	}

}
