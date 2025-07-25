package com.kmii.ch07.test01;

public class Tiger extends Animal {

	double weight;

	public Tiger() {
		super();
	}

	public Tiger(String name, String bark,double weight) {
		super(name, bark);
		this.weight= weight;
		
	}
	
	public void tigerWeight() {
	System.out.print(this.name + " : " + weight +" kg");
	}
	
	
}
