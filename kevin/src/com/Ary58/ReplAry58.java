package com.Ary58;

import java.util.Scanner;

public class ReplAry58 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");

		int[] ary = { 1, 2, 3, 4, 5 };

		for (int row = 0; row < ary.length; row++) {

			ary[row] = sc.nextInt();

		}

		for (int b = 0; b < ary.length; b++) {
			System.out.println(ary[b] * 10);

		}

	}

}
