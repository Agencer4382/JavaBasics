package com.march16;                                               

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		

		int sec = 15;
		int gues = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		gues=sc.nextInt();
		
		
		for (int x=1; x<11; x++) {
			
			if(gues<sec) {
				System.out.println("too small");
			}else {
				System.out.println("too large");
			}
			System.out.println("try new number: ");
			gues=sc.nextInt();
		}
		

	}

}
