package com.march23Ary;

public class MultiDimArray {

	public static void main(String[] args) {

		int a[][] = { { 100, 5000, 7, 9 }, { 15, 6, 8, 1 }, { 30, 56 } };
		int max =Integer.MIN_VALUE;
		int max2=0;

		for (int x = 0; x < a.length; x++) {

			for (int y = 0; y < a[x].length; y++) {
				
				if (a[x][y]>max) {
					max2=max;
					max=a[x][y];

			}else if (a[x][y]>max2&&a[x][y]!=max) {
				max2=a[x][y];
			}
			
				
			}
		}

		System.out.println(max);
		System.out.println(max2);

	}

}
