package com.Task30Marc;

public class ArrayMinMax {

	public static void main(String[] args) {
		// * 2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] num = { 45, 4, 75, 5, 32, 3 };

		int max = Integer.MIN_VALUE; // 75
		int min = Integer.MAX_VALUE; // 3
		int max2 = 0; // 45
		int min2 = 0; // 4

		for (int row = 0; row < num.length; row++) {

			if (num[row] > max) {

				max2 = max;

				max = num[row];

			} else if (num[row] > max2 && num[row] != max) {
				max2 = num[row];

			}
			if (num[row] < min) {

				min2 = min;

				min = num[row];

			} else if (num[row] < min2 && num[row] != min) {
				min2 = num[row];
			}
		}

		System.out.println(max);
		System.out.println(max2);
		System.out.println(min);
		System.out.println(min2);

	}

}
