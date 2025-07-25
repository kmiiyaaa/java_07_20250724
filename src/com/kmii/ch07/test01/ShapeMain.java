package com.kmii.ch07.test01;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rectangle
		Rectangle r1 = new Rectangle(4,5);	
		System.out.println("사각형의 넓이 : " + r1.area());	
			
		//Triangle
			
		Triangle tr = new Triangle(3,5);
		System.out.println("삼각형의 넓이 : " + tr.area());
		
		
		//circle
		Circle c1 = new Circle(4);
		System.out.println("원의 넓이 : " + c1.cirArea());
			

	}

}
