package StringRepl;

public class Repl66 {

	public static void main(String[] args) {

		String name = "Timmy";
		int leng = name.length();
		System.out.println(leng);

		/*
		 * Create a String named s1 check weather string is empty or not Create a String
		 * named s2 = "" check weather string is empty or not
		 */
		String name1 = "hello";
		String name2 = "";
		boolean s1 = name1.isEmpty();
		boolean s2 = name2.isEmpty();
		System.out.println(s1);
		System.out.println(s2);

		/*
		 * create first string named convert into SYNTAXSOLUTIONS create first string
		 * named convert into syntaxsolutions
		 */

		String str1 = "syntaxsolutions";
		String str2 = "SYNTAXSOLUTIONS";

		String st = str1.toUpperCase();
		String st1 = str2.toLowerCase();
		System.out.println(st);
		System.out.println(st1);

		//

		String sey1 = "hello how are you";

		boolean flag1 = sey1.endsWith("u");
		boolean flag2 = sey1.endsWith("world");
		boolean flag3 = sey1.endsWith("are");
		boolean flag4 = sey1.endsWith("you");

		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);

		
		// ------------------------------
		String strr = "abracadabra alakazam";
		String target1 = "dab";
		String target2 = "ABRA";

		int index = strr.indexOf("c");
		int index1 = strr.indexOf(" ");
		int index2 = strr.indexOf(target1);
		int index3 = strr.indexOf(target2);
		System.out.println(index);
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);

		// ------------------------
		String str = "laptops out for harambe";
		System.out.println(str.substring(5, 23));
		System.out.println(str.substring(7, 10));
		System.out.println(str.substring(16));
		System.out.println(str.substring(10, 13));

		// ---------tbop------------

		String strg = "boopity bop";

		System.out.print(strg.substring(5, 6));
		System.out.print(strg.substring(8, 9));
		System.out.print(strg.substring(1, 2));
		System.out.print(strg.substring(10, 11));

		String nm = "Banana";
		System.out.println("The first 3 letters of" + nm + nm.substring(0, 3));
	}

}
