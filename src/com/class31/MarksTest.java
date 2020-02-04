package com.class31;

public class MarksTest {

	public static void main(String[] args) {
		
		Marks as=new StudentA(12,45,36);
		System.out.println(as.getPercentage());
		Marks as1=new StudentB(12,45,36, 15);
		System.out.println(as1.getPercentage());
	}
}
