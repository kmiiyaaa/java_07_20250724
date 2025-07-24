package com.kmii.ch07.part01;

public class Shape { //부모클래스
	
	
	int width;  
	int height;  
	String color;  // 도형면 색

	
	public double area() {  // 도형의 면적 계산 메소드
		double area =  this.width * height;
		return area;
	}
	
	

}
