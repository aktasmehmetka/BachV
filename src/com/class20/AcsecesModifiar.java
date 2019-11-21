package com.class20;

public class AcsecesModifiar {


	 String name;
	 
	 // public can be seen/accessed from everywhere
	   public void add1() {
	        int num1 = 2;             //those are local variable
	        int num2 = 1;
	        int result = num1 + num2;
	    }
	   // this default method can be seen/ accessed within package
	    void add2(int num1, int num2) {
	        int result = num1 + num2;
	    }
	    
	    // protected can be seen/accessed within in package
	   protected int add3() {
	        int num1 = 4;
	        int num2 = 2;
	        int result = num1 + num2;
	        return result;
	    }
	    int add4(int num1, int num2) {
	        int result = num1 + num2;
	        return result;
	    }

}
