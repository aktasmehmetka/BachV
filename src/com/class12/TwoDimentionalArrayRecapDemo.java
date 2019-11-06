package com.class12;

public class TwoDimentionalArrayRecapDemo {

	public static void main(String[] args) {

		int[][] arra1 = new int[2][3];

		// first row
		arra1[0][0] = 9;
		arra1[0][1] = 10;
		arra1[0][2] = 11;

		// second row
		arra1[1][0] = 9;
		arra1[1][1] = 10;
		arra1[1][2] = 11;

		for (int i[] : arra1) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		int [][] array2= {
				{44,55,66},
				{11,22,32}
		};
		
		for(int[] i:array2) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
