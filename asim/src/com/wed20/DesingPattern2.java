package com.wed20;

public class DesingPattern2 {

	public static void main(String[] args) {
		/* ....1
...2.
..3..
.4...
5....
 */
		for( int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++ ) {
				
				if(y == 5 - x + 1) {
					System.out.print(x);
				}
				else {
					System.out.print(".");
				}
			}
			
			System.out.println();
		}
    

	}

}
