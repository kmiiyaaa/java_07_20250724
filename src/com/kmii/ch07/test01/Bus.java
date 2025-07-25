package com.kmii.ch07.test01;

public class Bus extends Car{
	
	int tireCount ; //바퀴갯수


	public Bus() {
	super();
}

	public Bus (int tireCount, String type) {
		super(type);
		this.tireCount = tireCount;
	}
		
	public void tire() {
		System.out.println("타이어 갯수는 :" + this.tireCount );
	}
	}



