package com.Ary58;

public class Repl60 {

	public static void main(String[] args) {
		double[][] a = {{1.4,2.0,3.3,2},{4,1.5,6.1,1},{1.2,3.1,4,1.6}};
		
		for(int x = 0; x< a.length; x++) {
			for(int d=0; d<a[x].length; d++) {
				System.out.print((a[x][d])*2+" ");
			}
			System.out.println();
		}

	}

}
