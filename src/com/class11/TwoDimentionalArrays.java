package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		
		// Declare 
		
		int [][] array=new int[3][4];
		
		

		// Task create 2D array of 2 rows and 3 columns
		
		String[][] name=new String [2][3];
		
		name[0][0]="ali";
		name[0][1]="kaya";
		name[0][2]="can";
		
		name[1][0]="ali";
		name[1][1]="kaya";
		name[1][2]="can";
		
		System.out.println(name[0][2]);
		
		System.out.println("=======================");
		
		int [][] numbers= {
				{4,5,6,8,9},
				{78,56,8,2,3},
				{12,36,85,3,14}
		};
		
		System.out.println(numbers[1][4]);
		
		System.out.println("The number of rows is "+numbers.length);     // kac tane rows yani satir oldugunu belirler
		System.out.println("The number of columns is "+numbers[1].length);   // sadece ikinci row un kac tane index yani columns icerdigini belirtir;
	}

}
