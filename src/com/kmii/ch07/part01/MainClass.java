package com.kmii.ch07.part01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		r1.height = 10;  // Rectangle 비어있지만 shape로부터 상속받아서 메서드,필드값 그대로 받아올 수 있다!
		r1.width = 10; 
		r1.recArea = 50.5;
		
		
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("멍멍",5);
		
	}

}
