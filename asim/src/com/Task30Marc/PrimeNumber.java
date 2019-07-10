package com.Task30Marc;

public class PrimeNumber {

	public static void main(String[] args) {

		int num =17;

		boolean Prime = true;
		for (int x = 2; x < num; x++) {

			if (num % x == 0) {
			Prime = false;
				break;

			}
		}
		if (Prime) {

			System.out.print("This is a Prime Number");
		} else {
			System.out.print("This is not a Prime Number");
		}

	}

}
