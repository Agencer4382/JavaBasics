package com.Ary58;

public class Rep64 {

	public static void main(String[] args) {
		int[][] a = {{1,1,2}, {3,1,2},{3,5,3},{0,1,2}};
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=0;
			for(int x=0; x<a[i].length; x++) {
				
					sum+=a[i][x];
			}
			System.out.println(sum);
	}
	}

}
