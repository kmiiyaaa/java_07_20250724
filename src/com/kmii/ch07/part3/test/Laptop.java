package com.kmii.ch07.part3.test;

public class Laptop extends Computer {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("노트북 켜짐");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("노트북 꺼짐");
	}

}
