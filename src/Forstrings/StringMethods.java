package Forstrings;

public class StringMethods {

	public static void main(String[] args) {

                String str = "this is the test string";
				
			    String str1 = "hello";
				String str2 = "hello";
				String str3 = "WELCOME";
				String str4 = "";
				String str5 = "        spaces allround    ";
				
				System.out.println("length of the string is: " + str.length());
				System.out.println("Character at given index 2: " + str.charAt(2));
				System.out.println(str.concat(str3));
				System.out.println("contains is: " + str.contains("is"));
				System.out.println("string strats with h: " + str.startsWith("h"));
				System.out.println("string strats with t: " + str.startsWith("t"));
				System.out.println("string end with g: " + str.endsWith("g"));
				System.out.println("string end with m: " + str.endsWith("m"));
				System.out.println("compare string 0 and 1: " +str.equals(str2));
				System.out.println("compare string 1 and 2: " +str1.equals(str2));
				System.out.println("Give index of i: " + str.indexOf("i"));
				System.out.println("check string is emoty:" + str4.isEmpty());
				System.out.println("check string is emoty:" + str.isEmpty());
				System.out.println("replace e with d:" + str.replace('e','d'));
				/*
				 * in substring start index is inclusive and end index is exclusive
				 */
				System.out.println("example 1:" +str.substring(5));
				
				char[] charArray = str.toCharArray();
				for(int i =0; i<=charArray.length-1; i++)
				{
					System.out.println("index" + i + "is:" +charArray[i]);
				}
			
				System.out.println("convert to lower case:" + str3.toLowerCase());
				// for permanat change to upper case
				str1=str1.toUpperCase();
				System.out.println(str1);
				
				System.out.println("convert to upper case:" + str.toUpperCase());
				System.out.println("remove the speces:" + str5.trim());
	}

}
