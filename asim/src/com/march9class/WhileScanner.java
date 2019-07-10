package com.march9class;

import java.util.Scanner;

public class WhileScanner {

	public static void main(String[] args) {
		/* user ask  name 3 time..."you are doing great...." */

		String name;
		Scanner kevin=new Scanner(System.in);
		int a=1;
		
		
		while(a<=3) {
			System.out.println("enter name");
			name=kevin.nextLine();
			System.out.println("you are doing great "+name);
			a++;
			
		}
		
		
	}

}
