package com.march23Ary;

public class DimAry3 {

	public static void main(String[] args) {
		int[][] num= {{11,12,13,14},{21},{31,32,33,34}};
		
		//int rows=num.length;
		//System.out.println(rows);
		
		//int cols=num[1].length;
		//System.out.println(cols);
		
		for(int row=0; row<num.length; row++) {
			
			for(int cols=0; cols<num[row].length; cols++) {
				System.out.print(num[row][cols]+" ");
			}
			System.out.println();
		}
		String [][]food= {{"burger","fries","hot dog","meatloaf"},{"lo mein","fried rice","white rice"},{"briyani","korma","naan","chich peas"}};
		
		for(int rows=0; rows<food.length; rows++) {
			
			for(int col=0; col<food[rows].length; col++) {
				System.out.print(food[rows][col]+" ");
			}
			
			System.out.println();
		}

	}

}
