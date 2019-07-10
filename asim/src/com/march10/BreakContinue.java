package com.march10;

public class BreakContinue {

	public static void main(String[] args) {


		for(int x=1; x<6; x++) {
			if(x==3||x==4) {
				continue;
			}
			System.out.println(x);
		}

	}

}
