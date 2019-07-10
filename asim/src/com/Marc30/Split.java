package com.Marc30;

public class Split {

	public static void main(String[] args) {
		
		String str="Welcome Syntax Students Batch 4";
		String[] ary=str.split(" ");
		System.out.println(ary.length);
		for(String sub:ary) {
			System.out.println(sub);
		}
	
	}

}
