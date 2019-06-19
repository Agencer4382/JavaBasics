package com.Ary58;

public class Rep65 {

	public static void main(String[] args) {
		/*Write a program that prints 
		 * the total number of elements that are negative AND odd*/
		
		int[][] a = {{-5,-2,-3,7},{1,-5,-2,2},{1,-2,3,-4}};
		
		int sumOddNeg=0;
		
		for(int i=0; i<a.length; i++) {
			
			for(int x=0; x<a[i].length; x++) {
				if(a[i][x] <0 && a[i][x] %-2 == -1) {
					sumOddNeg++;
				}
			}
		
	}
		System.out.println(sumOddNeg);
		

	}

}
