package com.task6and7;

import java.util.Scanner;

public class SwitchBreak4 {

	public static void main(String[] args) {
		String car;
		String model;
		Scanner kevin = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		car = kevin.nextLine();

		switch (car) {
		case "BMW":
			model = "german car";
			break;
		case "Toyota":
			model = "japanese car";
			break;
		case "Maserati":
			model = "italian car";
			break;
		default:
			model = "unknown";

		}
		System.out.println("Your favorite car is " + model);

	}

}
