package com.wed20;

public class DesingPattern1 {

	public static void main(String[] args) {
		
		for(int row_ind=1; row_ind<=5; row_ind++) {
			for(int col_ind=1; col_ind<=5; col_ind++) {
				
				if(col_ind > 5 - row_ind) {
					System.out.print(row_ind);
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}

}
