package com.class14;

public class StringMinipRecap {

	public static void main(String[] args) {
		
		String str=new String("Hello");
		String str1=new String("Hello");
		
		System.err.println(str==str1);
		// bu degerler birbirinden farkli ama su sekilde esit yapabiliriz
		
		String str2=str;
		System.out.println(str==str2);
		
		System.out.println("\n");
		
		String str3="Hello";
		String str4="Hello";
		System.out.println(str3==str4);// bunlar bir birine esit 
		
		
		
	}
}
