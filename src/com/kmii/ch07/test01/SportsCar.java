package com.kmii.ch07.test01;

public class SportsCar extends Car{
	
	
	String oil;  // 넣는 기름종류
	double oilMount; // 넣는 오일의 양
	
		

	public SportsCar() {
		super();
	}


	public SportsCar(String type) {
		super(type);

	}



	public SportsCar(String oil, double oilMount,String type) {
		super(type);
		this.oil = oil;
		this.oilMount = oilMount;
	}


	public void carInfo() {
		System.out.println("이차의 종류 : " + this.type);
		System.out.println("넣는 기름 : " + this.oil + "기름의 양" + this.oilMount);

}
		
  }

