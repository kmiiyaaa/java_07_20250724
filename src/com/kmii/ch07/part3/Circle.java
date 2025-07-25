package com.kmii.ch07.part3;

public class Circle extends Shape {
	
	private int radius;
	public static final double PI = 3.14;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() { // 원의 면적 출력으로 
		// TODO Auto-generated method stub
		return 	PI * radius * radius;
	}

	@Override  // 안에 내용이 없어도 오버라이딩은 해야한다.
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("원의 색깔 :"+ color);
		
	}
	
	
	

}
