package com.class11;

public class TwoDimentialArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
        int row = 2;
        int column = 4;
        int[][] iArrays = new int[row][column]; 
        
    for(int rowCount = 0; rowCount < iArrays.length; rowCount++) {
        for(int columnCount = 0; columnCount < iArrays[0].length; columnCount++) {
              if(columnCount % 2 != 0) {
                iArrays[rowCount][columnCount] = columnCount + 1;
                
                }   
            }
        }

    System.out.println("The array has " + iArrays.length + " rows");
    System.out.println("The array has " + iArrays[0].length + " columns");
    
    for(int rowCount = 0; rowCount < iArrays.length; rowCount++) {
        for(int columnCount = 0; columnCount < iArrays[0].length; columnCount++) {
            System.out.print(iArrays[rowCount][columnCount] + " ");
            sum += iArrays[rowCount][columnCount];
        }
    System.out.println();
    }
    System.out.println("The sum is: " +sum);
	}

}
