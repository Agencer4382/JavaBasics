package com.Ary58;

public class Repl61 {

	public static void main(String[] args) {
		int[][] a = {{5,2,3,7},{1,5,2,2},{1,2,3,4}};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			for(int x=0; x<a[i].length; x++) {
				if(i==2) {
					sum+=a[i][x];
				}
					
			}
			
		}
		System.out.println(sum);
	}

}
