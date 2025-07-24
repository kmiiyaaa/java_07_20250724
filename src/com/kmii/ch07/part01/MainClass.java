package com.kmii.ch07.part01;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		r1.height = 10;  // Rectangle 비어있지만 shape로부터 상속받아서 메서드,필드값 그대로 받아올 수 있다!
		r1.width = 10; 
		r1.recArea = 50.5;
		
		System.out.println("-----------------------");
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("멍멍",5);
		
		
		System.out.println("-----------------------");
		
		Student s1 = new Student("홍길동",5, 12); // 홍길동과 12는 부모(person)한테 들어간다. 5는 자식(student)에게
		
		
		System.out.println("-----------------------");
		
		Triangle t1 = new Triangle();
			t1.width = 10;
			t1.height = 5;
			t1.color = "red";
			
			
			
		//삼각형 면적
			System.out.println(t1.area()); 
			//부모 메소드 -> 삼각형면적 구할 수 없다. -> 그대로 쓸 수 없어서 재정비 = 오버라이딩!!!
		
		//사각형면적
			Rectangle rec1 = new Rectangle();
			rec1.area(); //오버라이딩 필요없다
			
			
			
	}

}
