package com.march16;

import java.util.Scanner;

public class SecretNum {

	public static void main(String[] args) {
		/*Write a guessing game where the user has to guess a secret number between 1 and 20. 
		 * After every guess input, the program tells the user whether their number was too large or too small. 
		 * The program will keep asking the user to enter the number until he finds the correct number. 
		 * When the correct answer is found the system should display "Congratulations!!. You got it!".
		 */

		int secret=6;
		int guess=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number between 1 and 20 : ");
		guess=sc.nextInt();
		
		while(secret!=guess) {
			if(guess>secret) {
				System.out.println("too large");
				
			}else {
				System.out.println("too small");
			}
			System.out.println("Please try a new number : ");
			guess=sc.nextInt();
			
		}
		
		System.out.println("Congratulations!!. You got it!");
	}

}
