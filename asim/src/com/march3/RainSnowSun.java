package com.march3;

import java.util.Scanner;

public class RainSnowSun {

	public static void main(String[] args) {
		boolean rain;
		boolean snow;
		boolean sunny;
		int temp;
		String activity;
		
		Scanner kevin = new Scanner(System.in);
        System.out.println("enter temperature");
		temp = kevin.nextInt();

		if (temp >= 40 && temp <= 80) {
			System.out.println("it is rainning");
			rain = kevin.nextBoolean();
			if (rain) {
				System.out.println("I will not go hiking");

			} else {
				System.out.println("I will go hiking");
			}
		} else if (temp <= 25 && temp >= 40) {
			snow = kevin.nextBoolean();
			if (snow) {
				System.out.println("I will go snowbording");

			} else {
				System.out.println("I will not go snowbording ");
			}
		} else if (temp >= 80) {

			sunny = kevin.nextBoolean();
			if (sunny) {
				System.out.println("I will go to beach");

			} else {
				System.out.println("I will not go the beach");
			}
		}

	}
}