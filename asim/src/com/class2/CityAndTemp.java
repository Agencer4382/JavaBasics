package com.class2;
import java.util.Scanner;


public class CityAndTemp {

	public static void main(String[] args) {
		//enter city and temp in fahren
		//your pro convert f-->c
		//your pro say "the temp in the city-----is---"
		
		String cityName;
		int temp;
		
	
		Scanner kevin = new Scanner(System.in);
		System.out.println("enter the city");
		cityName=kevin.nextLine();
		System.out.println("enter temp in F");
		temp=kevin.nextInt();
		//formula (F-32)*5/9;
		
		int convTemp=(temp-32)*5/9;
		System.out.println("temp in the city "+cityName+" is "+convTemp);
		
	}

}
