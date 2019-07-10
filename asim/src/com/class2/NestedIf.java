package com.class2;

public class NestedIf {
//write a program to check work 
	// if user is younger<16-->not allowed
	// otherwise allow to work. if younger than 64 ---go to work---otherwise enjoy
	// your life

	public static void main(String[] args) {
		int age = 65;
		int aligableAge = 16;
		int retireAge = 64;

		if (age < aligableAge) {
			System.out.println("you con not work");

		} else {
			System.out.println("you can WORK");
			if (age < retireAge) {
				System.out.println("go work hard");

			} else {
				System.out.println("enjoy life");
			}
		}

	}

}
