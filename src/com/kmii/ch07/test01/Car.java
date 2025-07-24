package com.kmii.ch07.test01;

public class Car {
	
	String type; // 차의 종류
	
	

	public Car() {
	}



	public Car(String type) {
		this.type = type;
	}
	
	
	public void carType() {
		System.out.println("이차의 종류는 " + this.type + "입니다." );
	}
	

}
