package com.task6and7;

import java.util.Scanner;

public class ScannerIf {

	public static void main(String[] args) {

		
		String activity;
		boolean weekend = false;
		boolean week = true;

		Scanner kevin = new Scanner(System.in);
		System.out.println("Is it weekend");
		weekend = kevin.nextBoolean();

		if (!weekend) {
			activity = "manuel testing";
			

		} else {
			activity = "java";

		}

		System.out.println("Today will be learning "+activity);

	}

}
