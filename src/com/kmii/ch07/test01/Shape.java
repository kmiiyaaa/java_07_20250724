package com.kmii.ch07.test01;

public class Shape {
	
	//Shape 클래스를 상속 받는 Rectangle, Triangle, Circle 클래스를 만드시오.
//	(면적 계산 메소드가 존재해야 하며, 메소드 오버라이딩을 적용하시오.)
	
	int height;
	int width;
	
	public Shape() {
	
	}

	public Shape(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	
	public double area() {
		return height*width ;
		
	}
	
}
