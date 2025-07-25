package com.kmii.ch07.test01;

public class Soldier extends Person {
	
	String city; //근무지역
	
	
	public Soldier() {
		super();
	}


	public Soldier(String name, int age, String city) {
        super(name, age);
        this.city = city;
    }
	
	
	public void work() {
		System.out.println(name+"은" + city+ "에서 근무중 입니다.");
	}
	
	

}
