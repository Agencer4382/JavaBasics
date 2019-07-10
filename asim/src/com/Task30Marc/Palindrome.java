package com.Task30Marc;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		/* 6. Write a Java Program to find whether a String is palindrome or not?
		 * 7.Write a java program to check whether a given number is prime or not? 
		 * 8.Write a Java Program to print first 10 numbers of Fibonacci series.
		 */
     

		String str="kabak";
		
		
		String rev ="";


		for (int i =str.length()-1; i >= 0; i--) {
			rev+= str.charAt(i);
		}
			

		if (rev.matches(str)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}
	}
	

}
