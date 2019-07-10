package march2;

import java.util.Scanner;

public class NestedIfLargestNum {

	public static void main(String[] args) {

		int x,y,z;
		System.out.println("Enter three numbers");
		Scanner kevin= new Scanner(System.in);
		
		x=kevin.nextInt();
		y=kevin.nextInt();
		z=kevin.nextInt();
		
		if (x>y && x>z) {
			System.out.println("fnum is largest number");
			
		}else if (y<x || y>z ) {
			System.out.println("snum is medium number");
			
		}else if (z<y && z<x) {
			System.out.println("tnum is smallest number");
		}
		else {
			System.out.println("no numbers compere");
		}
	}

}
