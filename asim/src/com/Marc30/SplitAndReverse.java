package com.Marc30;

public class SplitAndReverse {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		*Write a program to get a new String without any spaces.
        *Create a String that should be combination of letters, numbers and special characters. 
        *Find out how many alpha characters are there in the String.
		*You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” 
		*How would you find out how many sentences are in that String?*/
		
		String str3="Hello Class1231!";
		String sr3=str3.replace(" ","");
		System.out.println(sr3);

		
		String str="Hello Class1231!";
		String[] ary=str.split("");
		System.out.println(ary.length);
		
	String a="Is it saturday? Is it raining? Do we have a Java Class today?";
	String[] ary1=a.split(" ");
	
	System.out.println(ary1.length);
	}

}
