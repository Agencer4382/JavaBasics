package com.march23Ary;

public class Task3 {

	public static void main(String[] args) {
		// create an array of int find largest num

		int[] ary = { 300,299,140,2009 };
		int max = ary[0];
		int min = ary[0];

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] > min) {
				max = ary[i];

			} else if (ary[i] < min) {
				min = ary[i];

			}

		}
		System.out.println(max + " is the max value ");
		System.out.println(min + " is the min value");

	}

}
