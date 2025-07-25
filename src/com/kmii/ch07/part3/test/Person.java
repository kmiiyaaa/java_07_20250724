package com.kmii.ch07.part3.test;

public abstract class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	
abstract void sayHello();


public static void printHi() {
	 System.out.println("안녕하세요 저는 학생입니다.");
 }



}
