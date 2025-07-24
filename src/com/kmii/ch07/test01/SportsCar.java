package com.kmii.ch07.test01;

public class SportsCar extends Car{
	String oil; //넣는 기름종류
	
	
	public SportsCar (String oil, String type) {
		super(type);
		this.oil = oil;
	}
		
	public void carInfo() {
		System.out.println("이차의 종류 : " + this.type);
		System.out.println("넣는 기름 : " + this.oil);
	}
		
  }

