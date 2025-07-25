package com.kmii.ch07.part3;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}



	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	
	//getter,setter로 초기값 설정


	@Override
	public double getArea() { // 사각형 넓이
		// TODO Auto-generated method stub
		return width * height;
	}


	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("사각형 색깔 :"+ color);
		
	}
	
	

}
