package com.task6and7;

import java.util.Scanner;

public class ScannerIf1 {

	public static void main(String[] args) {

		int num1, num2;
		String word1;
		String word2;

		Scanner kevin = new Scanner(System.in);
		System.out.println("Please enter two strings");
		word1 = kevin.nextLine();
		word2 = kevin.nextLine();
		System.out.println("Please enter twonumbers");
		num1 = kevin.nextInt();
		num2 = kevin.nextInt();
		
		if (num1==num2 && word1.equals(word2)) {
			System.out.println("AND");
			
		}else if(num1==num2 || word1.equals(word2)) {
			System.out.println("OR");
			
		}else if(!(num1==num2) && !(word1.equals(word2))) {
			System.out.println("NONE");
		}

	
	}

}
