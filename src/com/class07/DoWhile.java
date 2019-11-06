package com.class07;

public class DoWhile {

	public static void main(String[] args) {
		
		// mostly
		
				int num=10;
				while(num>=7) {
					System.out.println("Hello");
					num--;
				}
				// rare
				
				int num1=10;
				
				do {
					System.out.println("Bye");
					num1++;
				}while(num1<=7);
				
				System.out.println("++++++++++++++++++++++++");
				
				// print even numbers from 20 to 50 using do while
				
				int num2=20;
				
				do {
					System.out.println(num2);
					num2+=2;
				}while(num2<=50);
				
				System.out.println("==========================Second way+++++++++++++");
				// 2 way
				int num3=20;
				do {
					if(num3%2==0) {
						System.out.println(num3);
						
					}num3++;
				}while(num3<=50);

	}

}
