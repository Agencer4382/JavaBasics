package com.march16;

public class Dizayntask3 {

	public static void main(String[] args) {
	

		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {

				System.out.print("*");
			}
			System.out.println();
		}
		for (int x = 1; x <= 4; x++) {
			for (int y = 4; y >= x; y--) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
