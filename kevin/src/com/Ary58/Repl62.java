package com.Ary58;

public class Repl62 {

	public static void main(String[] args) {
		int[][] arr = {{5,2,3,7},{1,5,1,1},{8,3,1,2}};
		int max = 0;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				max = Math.max(max, arr[row][col]);
			}
		}
		System.out.println(max);
	}

}
