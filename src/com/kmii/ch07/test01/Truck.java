package com.kmii.ch07.test01;

public class Truck extends Car {
	
	int sit ; // 앉는 좌석갯수
	
	
	public Truck (int sit, String type) {
		super(type);
		this.sit = sit;
	}	

}
