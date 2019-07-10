package com.Marc30;

public class SwapNumAndString {

	public static void main(String[] args) {
		/*
		 * 1.Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable? 
		 * 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		 * 3.Find out how many alpha characters present in a string? 
		 * 4.How to find out the part of the string from a string? What is substring? Find number of wordsin string? 
		 * 5.Write a java program to reverse String? Reverse a string word by word?
		 */
		// --------------Task1------------------
		int a = 15;
		int b = 10;	
		
		a = a - b; //5
		b = a + b; //15
		a = b - a;//10

		System.out.println("After the swap a is : " + a);
		System.out.println("After the swap b is : " + b);

		// ----------------------------------
		String str = "kel";
		String str1 = "ali";

		System.out.println("After swap str is: " + str.replace("kel", "ali"));
		System.out.println("After swap str1 is: " + str.replace("ali", "kel"));
		// --------------Task3---------------
		String str2 = "Hello guys**-$$$";
		System.out.println((str2.replaceAll("[A-Za-z]", "").replace(" ", "").length()));

		// -------------Task4---------------

		String str3 = "Hello World I am Asim";
		if (str3.contains("")) {
			int index = str3.lastIndexOf("World");
			String str4=str3.substring(index);
			String str5=str3.substring(0, index);
			System.out.println("str3 = "+str3+"\n"+"str4 = "+str4+"\nstr5 = "+str5);
			
		}
		
		String[] words=str3.split(" ");
		int count=words.length;
		System.out.println("word count : "+count);
		
		for(int x=0; x<words.length; x++) {
			
			System.out.println(words[x]);
		}
		

	}

}
