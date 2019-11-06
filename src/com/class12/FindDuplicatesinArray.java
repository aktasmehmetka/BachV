package com.class12;

public class FindDuplicatesinArray {

	public static void main(String[] args) {
		int [] array2= {2,5,4,7,2,5};
		
		for (int i = 0; i < array2.length; i++) { // burada bize esit olan indexleri va
			for(int j=i+1;j<array2.length;j++) {  /// yapmamiz gereken sadece +1 eklemek ve tabiki if kulllanmak
				if(array2[j]==array2[i]) {
					System.out.println(array2[j]);
				}
			}
		}
	}
}
