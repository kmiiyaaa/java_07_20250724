package com.kmii.ch07.part01;

public class Dog extends Animal {
	
	boolean tail;
	String kind;
	
	
	public Dog() {
		super(); //부모클래스의 생성자 호출
		
	}
	
	public Dog(boolean tail) {
		super(); 
		this.tail = tail;
	}
	
	public Dog(String name, int age) {
		super(name,age);
	}
	
	
	public Dog(boolean tail, String kind) {
		this.tail = tail;
		this.kind = kind;
	}


	public void dogRun() {
		System.out.println("강아지 달리기");
	}
	

}

