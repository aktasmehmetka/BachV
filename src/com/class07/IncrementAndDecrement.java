package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
int a=10;
		
		a=a+1;//assignment
		a+=1;//shorthand assigment
		
		System.out.println(a);//2
		a++; 
		System.out.println(a);
		
		int b=10;
		b-=1;
		b--;// decrement operator
		System.out.println(b);
		
		//increment & decrement operators can be used 
		//only with variable
		
		int c=23;
		c++;
		//1++; compiler arror invalid argument
		System.out.println(c);

	}

}
