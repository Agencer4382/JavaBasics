package com.march16;

import java.util.Scanner;

public class Itempay {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!
		 */
		String item;
		int price = 0;
		int pay = 0;
		int ttl = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item : ");
		item = sc.next();
		System.out.println("Enter the price :  ");
		price = sc.nextInt();

		while(price>ttl) {
			System.out.println("Please pay it");
			pay=sc.nextInt();
			ttl+=pay;
			if (price==ttl) {
				System.out.println("Your payment is done");
				
				
			}else if (price<ttl) {
				System.out.println("Take your cash back please : "+(ttl-price));
				
			}else {
				System.out.println("How much left: "+(price-ttl));
			}
		}
	}

}
