package com.march16;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 */

		String item;
		int price = 0;
		int pay = 0;
		int ttl = 0;
		int left = 0;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter item");
		item = kevin.next();
		System.out.println("enter price");
		price = kevin.nextInt();

		System.out.println("pay for it");

		do {
			pay = kevin.nextInt();
			ttl += pay;
		    left = price - ttl;
			System.out.println("how much left: "+left);

		} while (left>0);//while(ttl<price)

		System.out.println("thx for shopping ");
		if(left<0) {
			System.out.println("Your remaining money is : "+left*-1);
		}

	}

}
