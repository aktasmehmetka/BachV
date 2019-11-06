package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {
		
		
		int[] nums=new int[4];
		
		nums[0]=12;
		nums[1]=13;
		nums[0]=14;
		nums[3]=15;
		
		//to find number of elements inside an array we use .length
		
		System.out.println(nums.length);// it will give how many element you have
		System.out.println(nums[0]);
		
		String [] array= {"Winter", "Fall", "Summer", "Spring"};
		// I was born in Summer
		
		System.out.println("I was born in "+array[2]);
		System.out.println(array.length);
		
		// array.length will return an integer
		int arraySize=array.length;
		
		System.out.println(arraySize);
		
		int[] score= {56, 89, 90, 99};
		
		
	}
	
	

}
