package com.march23Ary;

public class DimAryTask1 {

	public static void main(String[] args) {
		
String [][]cars= {{"gmc","ford","linconl"},{"bmw","VW","mercedes"},{"hyundai","kia"}};
		
		for(int rows=0; rows<cars.length; rows++) {
			
			for(int col=0; col<cars[rows].length; col++) {
				System.out.print(cars[rows][col]+"\n");
			}
		
		}
			
			
		

	}

}
