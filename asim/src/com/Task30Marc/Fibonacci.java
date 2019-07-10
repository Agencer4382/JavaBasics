package com.Task30Marc;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;

		System.out.print(a + " " + b + " ");

		for (int i = 0; i < 10; i++) {

			c = a + b; // c==3 a==1 b==2
			a = b; // c==3 a==2 b==2
			b = c; // c==3 a==2 b==3

			System.out.print(c + " ");

		}

	}

}
