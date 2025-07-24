package com.kmii.ch07.part01;

public class Dog extends Animal {
	
	boolean tail;
	String kind;
	
	
	public Dog() {
		
	}
	
	
	public Dog(boolean tail, String kind) {
		this.tail = tail;
		this.kind = kind;
	}


	public void dogRun() {
		System.out.println("강아지 달리기");
	}
	

}

