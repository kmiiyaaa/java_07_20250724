package com.kmii.ch07.part3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Shape shape = new Shape();  // 추상클래스 - 메모리에 객체 생성 할수 없다. (인스턴스생성x)
		
		Rectangle rectangle = new Rectangle(10,20); //생성자로 초기화
		System.out.println("사각형의 넓이:" + rectangle.getArea());
		
		
		Circle circle= new Circle();
		circle.setRadius(10);
		//System.out.println("원의 넓이 : "+shape.sha());

		
		
		
		Shape shape = new Triangle(10,20); //up
		System.out.println("삼각형의 넓이 : "+ shape.getArea());
		
		
		Triangle tri;
		tri = (Triangle) shape; //down
		tri.getArea();
		//System.out.println("삼각형의 넓이" : tri.getArea());

	}

}
