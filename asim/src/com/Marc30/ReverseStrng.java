package com.Marc30;

public class ReverseStrng {

	public static void main(String[] args) {

		// reverse a string without using a reverse function

		String or = "Today is java class";
		String reverse = "";

		char[] ary = or.toCharArray();
		for (int i = ary.length - 1; i >= 0; i--) {
			reverse += ary[i];

		}
		System.out.println(reverse);

		// 2 charAt()

		String reverse1 = "";

		for (int i = or.length() - 1; i >= 0; i--) {
			reverse1 += or.charAt(i);

		}
		System.out.println(reverse1);

		//substring
		String rev="";
		for (int i = or.length(); i >0; i--) {
			rev += or.substring(i-1,i);

		}
		System.out.println(reverse1);

	}

}
