package com.march3;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		String country;
		String language;

		Scanner kevin = new Scanner(System.in);
		System.out.println("enter your country");
		country = kevin.nextLine();

		switch (country) {
		case "usa":
			language = "english";
			break;
		case "turkey":
			language = "turkish";
			break;

		case "afgan":
			language = "lazca";
			break;
			default :
				language="unknown";
				

		}
System.out.println("your language is "+language);

	}

}
