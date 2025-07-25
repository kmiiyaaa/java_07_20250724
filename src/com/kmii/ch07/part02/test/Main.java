package com.kmii.ch07.part02.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//****** upcasting **********
		Animal animal = new Dog();  // upcasting
		animal.name = "흰둥이";  // animal. 하면 부모에 있는거만 보임
		// animal.age = 4;  자식 클래스에있는 필드는 접근 불가 - error
		animal.sound(); //멍멍 -> 오버라이딩 된 메서드가 실행됨. / 메서드랑 필드랑 별개?
		
		
		//****** downcasting *******
		Dog dog;
		dog = (Dog) animal; // downcasting
		dog.age = 10;
		dog.name = "똘똘";
		dog.sound(); //멍멍 
		
		Animal animal2 = new Animal(); //인스턴스화 -> 실제 객체가 Animal 클래스로 만들어짐 
		// Dog dog2 = (Dog) animal2;  ClassCastException 에러 난다 --------왜 나는지 다시공부
		
		
		
		//upcasting과 downcasting 자식 접근 연습
		Animal animal3 = new Cat(); //upcasting
		// animal3.eat(); 자식메서드 접근 불가 -> 오류발생	
		
		Cat cat = (Cat) animal3; //downcasting 
		cat.eat(); //자식메서드 접근 가능
		
		Dog dog3;
		//Downcasting 할 때 instanceof 연산자로 확인 후 downcasting하면 안전하게 DOWN가능
		if (animal instanceof Dog) {   // true -> animal이  Dog클래스로 만든 객체를 참조하고 있다는 것을 의미
			dog3 = (Dog) animal; //downcasting
			dog3.sound();
			
		}
		
		
		
	}

}
