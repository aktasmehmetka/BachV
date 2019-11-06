package com.class12;

public class StringMinipulationDemo2 {

	public static void main(String[] args) {

		/*
		 * .contains
		 * 
		 */

		String sentence = "It was rainig";
		String sen = "raining";
		System.err.println(sen.contains(sentence));

		System.out.println(sentence.contains("w"));

		/*
		 * Create two string and initialize them with some value //implement the
		 * following methods on those string
		 * 
		 * 
		 * sen.length(); sen.concat(s); sen.equals(s); sen.toUpperCase();
		 * sen.toLowerCase(); sen.equalsIgnoreCase(anotherString);
		 */

		String sen1 = "How Are You Today";

		int a = sen.length();

		System.out.println(sen.length());

		System.out.println("=================");

		System.out.println(sentence.contains("w"));
		System.out.println("=================");

		String str = "how are you today";

		boolean isEqual = str.equals(sen1);
		System.out.println(isEqual);

		System.out.println("=================");

		System.out.println(sen1.toUpperCase());
		System.out.println(sen1.toLowerCase());
		System.out.println(sen1.equalsIgnoreCase(str));

		System.out.println("================");
		/*
		 * This method test if a string starts with the specified prefix beginning
		 */

		String str2 = "It is very hot in class";

		System.out.println("it is very hot in class= " + str2.startsWith("It"));
		// System.out.println("it is very hot in class= "+str2.startsWith("It", 0));
		// bunuda kullana biliriz ama diger yol daha kolay
		
		//This method tests if this string ends with the specified suffix
		
		System.out.println("Is the string is and with= "+str2.endsWith("class"));
		
		

	}

}
