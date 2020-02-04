package com.class32;

import java.util.ArrayList;

public class Task {

	/*
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<String> array=new ArrayList<>();
		
		array.add("ALI");
		array.add("Kasim");
		array.add("Fatma");
		array.add("Cem");
		array.add("Buket");
		
		System.out.println(array.isEmpty());
		System.out.println(array.contains("ALI"));
		System.out.println(array.size());
		
		System.out.println(array);
		
		for(String str:array) {
			System.out.print(str+" ");
		}
		
		
		
	}

}
