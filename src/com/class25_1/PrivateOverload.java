package com.class25_1;

public class PrivateOverload {
	
	private void Name() {
		System.out.println("I am non argument method");
	}
	private void Name(String str) {
		System.out.println("I am  method with one string parameter");
	}
	private void Name(String str, String str1) {
		System.out.println("I am  method with two string parameter");
	}
	public static void main(String[] args) {
		
		PrivateOverload obj=new PrivateOverload();
		obj.Name();
		obj.Name("Hello");
		obj.Name("Hello", "Bye");
	}

}
