package com.free;

public class StringManupilation {

	public static void main(String[] args) {
				         /* length()
				         * toLowerCase()
				         * toUpperCase()
				         * equals(Object anObject)
				         * equalsIgnoreCase(String anotherString)
				         * contains(String anotherString)
				         * startsWith(String prefix)
				         * endsWith(String suffix) isEmpty()
				         * concat(String str)
				         * trim()
				         * charAt(int index)
				         * indexOf(int ch)
				         * substring(int beginIndex)
				         * substring(int beginIndex, int endIndex)
				       /**
				        * Write a program that:
				        * Converts all the characters in the string to lower case and prints.
				        * Converts all the characters in the string to upper case and prints.
				        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
				        * Counts the number of letter 'a' in the string/paragraph and prints.
				        * Prints the second half of the string/paragraph.
				        * Prints characters between the 10th and 20th indices(inclusive).
				        * Prints the string/Paragraph in reverse order.
				        * Clears/removes all white spaces or tabs on both ends and prints.
				        */

				       String para = "The quick brown fox jumps over the lazy dog.";
				       
				       System.out.println(para.toLowerCase());
				       System.out.println(para.toUpperCase());
				       System.out.println(para.startsWith("The")&&para.endsWith("The"));
				       System.out.println(para.charAt(36));
				       System.out.println(para.substring(para.length()/2));
				       System.out.println(para.substring(10, 20));
				       System.out.println(para.trim());
				       
				       String rev="Sunday";
				       for(int i=rev.length()-1;i>=0;i--) {
				    	   System.out.print(rev.charAt(i));
				    	   
				       }
				       int sum=0;
				       if (para.contains("a")) {
				    	   sum++;
				    	   
				       }
				       System.out.println(sum);

	}

}
