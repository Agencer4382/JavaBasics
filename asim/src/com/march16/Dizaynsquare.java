package com.march16;

public class Dizaynsquare {

	public static void main(String[] args) {
		// *****
		
		int dizayn=5;
		for(int x=1; x<=dizayn; x++) {
			for(int y=1; y<=dizayn; y++) {
				
				if(x==1||x==dizayn||y==1||y==1) {
					System.out.print(".");
					
				}else {
					System.out.print(x);
				}
				
			}
			System.out.println();
		}

		

	}

}
