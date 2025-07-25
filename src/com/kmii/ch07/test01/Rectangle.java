package com.kmii.ch07.test01;

public class Rectangle extends Shape {
	

	String color ; //면의 색
	

	public Rectangle() { //부모클래스 기본생성자 호출
		super();
		
	}
	
	
	public Rectangle(int height, int width) { 
		super(height, width);
	}
	
	
	
	
	public Rectangle(int height, int width, String color) {
		super(height, width);
		this.color = color;
	}


	public double recArea() {
		
		return height * width; 
	}


	/*
	오버로딩으로 하면?
	
	@Override
	public double area() {
	 return super.area();
	}
	*/
	
	

}
