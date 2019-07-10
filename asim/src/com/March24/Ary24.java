package com.March24;

public class Ary24 {

	public static void main(String[] args) {
		
		String[][]grocery= {{"apple","orange"},{"carrot"},{"butter","milk"}};
		
		for(String[] num:grocery) {
			for(String yum:num) {
				System.out.print(yum+"  ");
			}
			System.out.println();
		}

	}

}
