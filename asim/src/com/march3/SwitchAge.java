package com.march3;

import java.util.Scanner;

public class SwitchAge {

	public static void main(String[] args) {
		int age;
	    Scanner bhavya = new Scanner(System.in);
	    System.out.println("enter your age:");
	    age = bhavya.nextInt();
	    switch (age) {
	        case 1:
	            System.out.println("you can crawl");
	            break;
	        case 2:
	            System.out.println("you can talk");
	            break;
	        case 3:
	            System.out.println("you can get in trouble");
	            break;
	        default:
	            System.out.println("i dnt know how old you are");
	            break;
	    }
	}

	}


