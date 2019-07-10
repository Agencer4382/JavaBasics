package com.march10;

import java.util.Scanner;

public class StartingEndingNum {

	public static void main(String[] args) {
		/*let user define a range of numbers to print*/
		
		Scanner kevin=new Scanner(System.in);
		System.out.println("enter starting number");
		int startNum=kevin.nextInt();
		int sum=0;
		System.out.println("enter ending number");
		int endNum=kevin.nextInt();
		
		for(int x=startNum; x<=endNum; x++) {
			sum=sum+x;
			
		}
		System.out.println("sum: "+sum);
	}

}
