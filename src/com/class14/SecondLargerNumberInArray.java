package com.class14;

public class SecondLargerNumberInArray {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?
		
		int[] arr= {23,45,76,32,99,456};
		
		int larger=arr[0];
		int second=arr[0];
		int min=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>larger) {
				second=larger;
				larger=arr[i];
			}else if(second<arr[i]) {
				second=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(larger);
		System.out.println(second);
		System.out.println(min);
	}
}
