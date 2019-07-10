package com.march16;

import java.util.Scanner;

public class Sumevenandodd {

	public static void main(String[] args) {
		// 1. Write a program that reads a set of integers, provided by a user and then
		// prints the sum of the even and odd integers.

		int sumEven = 0;
		int sumOdd = 0;
		int num1,num2=0;
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter start num");
		num1 = kevin.nextInt();
		System.out.println("enter end num");
		num2 = kevin.nextInt();

		for (int x = num1; x < num2; x++) {
			if (x%2==0) {
				sumEven+=x;
			
			}else {
				sumOdd+=x;
			
			}
		}
System.out.println("sum of odd : "+sumOdd);
System.out.println("sum of even : "+sumEven);
	}

}
