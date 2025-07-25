package com.kmii.ch07.test01;

public class Truck extends Car {
	

	int sit ; // 앉는 좌석갯수
	
	
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Truck (int sit, String type) {
		super(type);
		this.sit = sit;
	}
	
	public void truckSit() {
		System.out.println(type +"의 의자갯수는 "+sit+"개");
	}

}
