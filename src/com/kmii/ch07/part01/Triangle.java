package com.kmii.ch07.part01;

public class Triangle extends Shape {

	@Override
	public double area() {
		double area = this.width*height*0.5;
		return super.area();
	}

	
	
	
	//public double area() {   // 메서드 오버라이딩
 	//	double area = width * height *0.5 ;  //width,height 는 부모에서 가져온것.
	//	return area;
	//  }
	
	
	
	
	
	
}

