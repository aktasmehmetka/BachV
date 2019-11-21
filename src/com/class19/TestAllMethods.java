package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {

		// find the largest from 300 and 500
		// then identify is the largest number is odd

		AllMethods obj = new AllMethods();
		int larger=obj.findLargest(100, 200);
		//System.out.println(larger);
		
		boolean odd=obj.isOdd(larger);
		
		System.out.println(odd);
		
		// call method weekdayname
		// if(tuesday, wednesday, thursday, saturday, sunday)--> we are learning java
		
		
		String day=obj.weekDayName(5);
		if(day.equals("Tuesday") || (day.equals("Thursday") || (day.equals("Wednesday") || (day.equals("Saturday") || (day.equals("Sunday")))))){
			System.out.println("I am learning java");
		}else {
			System.out.println("I am free");
		}
				
	}
}
