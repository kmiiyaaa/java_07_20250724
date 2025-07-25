package com.kmii.ch07.test01;

public class Circle extends Shape {

	int radius;
	final static double PI = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
		
	}
	
	public double cirArea() {
		return PI * radius * radius;
	}
	
	
	


}
