package com.class29;

public class TestFile {
	
	public static void main(String[] args) {
		
		File obj=new JavaFile();
		obj.close();
		obj.edit();
		obj.open();
		
		System.out.println("------------------");
		File obj1=new WordFile();
		obj.close();
		obj.edit();
		obj.open();
		
		System.out.println("==================");
		
		File obj2=new PDFFile();
		obj.close();
		obj.edit();
		obj.open();
	}

}
