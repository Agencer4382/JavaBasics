package com.wed20;

import java.util.Scanner;

public class ArrayFoundNum {

	public static void main(String[] args) {
		

		int[] num = {1, 2, 3, 4, 5,6,7,8,9,10};
        int b = 11;
        boolean found = false;

        for (int x : num) {
            if (x == b) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(b+ " is found.");
        else
            System.out.println(b + " is not found.");
		
		}
	}


