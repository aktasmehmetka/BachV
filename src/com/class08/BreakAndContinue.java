package com.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		//break keyword break/exist the loop
		for(int i=0; i<10; i++) {
			
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside the loop");
		
		// second keyword continue--it will skip CURRENT iteration
		
		for(int i=1; i<=5; i++) {
			
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I am outside the loop");
		
		// I want to print nums from 1 to 20 expect 5,6,7
		
		for(int a=1; a<=20; a++) {
			if(a==5 || a==6 || a==7) {
				
				continue;
			}
			System.out.println(a);
		}

	}

}
