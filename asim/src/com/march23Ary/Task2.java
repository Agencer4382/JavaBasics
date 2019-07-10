package com.march23Ary;

public class Task2 {

	public static void main(String[] args) {
		
		String [] contry= {"usa","turkey","russuia","spain"};
		
		for(int i=0; i<contry.length; i++) {
			
			if(contry[i].equals("usa")) {
				System.out.println("dc");
				
			}else if(contry[i].equals("russuia")) {
				System.out.println("moscow");
			}else if(contry[i].equals("turkey")) {
				System.out.println("ankara");
		}else if(contry[i].equals("spain")) {
			System.out.println("madrid");
			
		}else {
			System.out.println("world");
		}
	
	}
	}
}
