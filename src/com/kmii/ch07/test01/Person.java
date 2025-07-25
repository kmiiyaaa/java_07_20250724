package com.kmii.ch07.test01;

public class Person {
	
	//Person 클래스를 상속 받는 Student, Solider, Employee 클래스를 만드시오.

		String name;
		int age;
		
		public Person() {
			
		}
		
		public Person(String name) {
			this.name = name;
		}
		
		public Person(int age) {
			this.age = age;
		}


		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void agePerson(String name, int age) {
			if(age>=20) {
				System.out.println(name + "님은 " + "성인 입니다.");
			} else {
				System.out.println(name + "님은 " + "미성년자 입니다.");
			}
		}
	

}
