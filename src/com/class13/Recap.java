package com.class13;

public class Recap {

	public static void main(String[] args) {
		
		String str1="Hello";
		
		String str3=str1.concat(" World");
		String str2=new String("Hello");
		
		//System.out.println(str3);
		
		
		
		String city="Fairfax";
		String city1="Fairfax";
		
		System.out.println(city);
		System.out.println(city1);
		
		
		System.out.println("=========================");
		
		String str5="Today is Sturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("=======Concat=========");
		System.out.println(str5.concat(" and we have java class"));
		
		System.out.println("+========Trim===========");
		
		String str6="  It is sunny";
		System.out.println("Before triming: "+str6);
		System.out.println(str6.trim());// trim islemi ilk bastaki bosluklari kaldiriyor
		
		System.out.println("======Index Of and CharAt==========");
		String str7="Tomorrow we will be done with String Manipulation";
		
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
	}
}
