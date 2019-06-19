package com.Ary58;

public class Repl63 {

	public static void main(String[] args) {
		int[][] a = {{1,1,1},{1,1,1},{1,1,1}};
		boolean flag=false;
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				if(row==col) 
				flag=true;
				if (row!=col)
					flag=false;
				
			}
		}
System.out.println(flag);
	}

}
