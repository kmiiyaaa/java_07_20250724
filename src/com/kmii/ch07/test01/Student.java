package com.kmii.ch07.test01;

public class Student extends Person {
	
String school ;
	
	
	public Student() {
		super();
	}


	public Student(String name , int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	
	public void school (){
		System.out.println(school + "에 다닙니다.");
	}
	
	
	}


