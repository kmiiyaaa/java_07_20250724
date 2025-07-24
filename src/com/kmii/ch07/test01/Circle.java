package com.kmii.ch07.test01;

public class Circle extends Shape {

	double radius; //반지름
	final static double PI = 3.14;
	
	public double cirArea(double radius) {
		double cir = PI* (radius*radius);
		return  cir;
		
	}
	
	


}
