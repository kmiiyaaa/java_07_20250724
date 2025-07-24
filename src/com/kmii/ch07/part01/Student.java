package com.kmii.ch07.part01;

public class Student extends Person {

	int grade; //학년

	
	public Student(String name, int grade, int age) { //부모 필드까지 채워지게 같이 넣어준다.
		super(name,age); //부모생성자를 호출하면서 name값을 필드값으로 넘겨준다
		this.grade = grade; 
	}
	
	
	
}
