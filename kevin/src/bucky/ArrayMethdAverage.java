package bucky;

public class ArrayMethdAverage {

	public static void main(String[] args) {
	System.out.println(average(4,5,6,7,9));

	}
	
	public static int average (int...numbers) {
		int ttl=0;
		for(int x:numbers) 
			ttl+=x;
			return ttl/numbers.length;
			
			
		
		
		
	}

}
