package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		
		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		
		System.out.println(array1[2]);
		
		int sum=0;

		for(int i=0; i<4; i++) {
			
			sum=sum+array1[i];
			System.out.println(array1[i]+" ");
		}
		System.out.println("The sum of arra1 is = "+sum);
		System.out.println("=================");
		
		for(int j:array1) {
			System.out.print(j+" ");
		}
	}

}
