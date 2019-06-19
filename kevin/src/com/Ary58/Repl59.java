package com.Ary58;

import java.util.Scanner;

public class Repl59 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int myArray[] = new int[5];

		for (int i = 0; i < myArray.length; i++) {

			int number = sc.nextInt();
			myArray[i] = number;
		}

		for (int i = myArray.length-1; i >= 0; i--) {
			System.out.println(myArray[i]);
		}

	}

}
