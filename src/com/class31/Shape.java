package com.class31;

public interface Shape {

	/*
	 * Create an Interface ‘Shape’ with undefined methods as calculateArea and
	 * calculatePerimiter . Create 2 child classes: Circle & Square that should have
	 * an implementation of area and perimeter calculation. Test your code
	 */
	
	public void calculateArea();
	
	public void calculatePerimiter();
	
}
class Circle implements Shape{

	@Override
	public void calculateArea() {
		double PI=3.14;
		int radius=5;
		double area=PI*radius;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimiter() {
		double PI=3.14;
		int radius=5;
		double perimiter=PI*radius;
		System.out.println(perimiter);
		
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea() {
		int w=5;
		int area=w*w;
		System.out.println(area);
		
	}

	@Override
	public void calculatePerimiter() {
		int wh=5;
		int perimiter=4*wh;
		System.out.println(perimiter);
	}
	
}
