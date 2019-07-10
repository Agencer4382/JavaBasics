package com.wed20;

public class DesingPattern {

	public static void main(String[] args) {
	
		for(int x=1; x<=5; x++) {
			for(int y=5; y>=x; y--) 
				
				if (x>y) {
					System.out.print(x);
					
				}else {
					System.out.print(".");
				}
			System.out.println();
			}
			
		}
		
			
	}


