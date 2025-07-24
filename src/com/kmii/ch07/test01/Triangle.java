package com.kmii.ch07.test01;

public class Triangle extends Shape{

	
	
	
	@Override
	public double area() {
		double area = this.width*height*0.5;
		return super.area();
	}

	
	
}
