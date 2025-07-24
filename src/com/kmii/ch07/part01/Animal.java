package com.kmii.ch07.part01;

public class Animal {
	
	String name;
	int age;
	double weight;
	String sound;
	
	
	
	
	public Animal() {
		
	}
	
	

	public Animal(String name) {
		this.name = name;
	}


	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = weight ;
	}





	public Animal(String name, int age, double weight, String sound) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.sound = sound;
	}



	public void eat() {
		System.out.println("음식을 먹는다");
	}
	
	public void bark( ) {
		System.out.println("짖는 소리 : "+ this.sound);
	}

}
