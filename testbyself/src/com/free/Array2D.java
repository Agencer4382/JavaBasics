package com.free;

public class Array2D {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 } };

		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}
			System.out.println();
		}
	}

}
