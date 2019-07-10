package com.march10;

public class SumEven {

	public static void main(String[] args) {
		int sum=0;
		
		for(int x=1; x<=5; x++) {
			sum=sum+x;
			
		}
System.out.println(sum);

/*find sum of all even number 1 to 100
 * */
int sum1=0;

for(int x=0; x<=100; x+=2) {
	sum1=sum1+x;
	
}
System.out.println(sum1);

	}

}
