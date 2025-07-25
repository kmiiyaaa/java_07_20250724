package com.kmii.ch07.test01;

public class Triangle extends Shape{

	
	public Triangle() {
		super();
		
	}

	public Triangle(int height, int width) {
		super(height, width);
		
	}

	
	@Override
	public double area() {
	return this.height * width * 0.5;  //this로 지정 해도되고 안해도된다?  식에 *0.5 추가
	// 꼭 super.area() 써야하나..?
		
	}
	
}
