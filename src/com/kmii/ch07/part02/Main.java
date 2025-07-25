package com.kmii.ch07.part02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double a;
		int b = 10;
		a = b;  // 자동형 변환
		b = (int)a;  // 강제형 변환
		
		/* 참고
		String c = "100";
		Integer d = Integer.parseInt(c);  // 문자열을 정수로 변환
		*/
		
		Person person = new Person();  
		Student student = new Student();
		Soldier soldier = new Soldier();
		
		// 대입(=)한것 -값이 들어가는게 아니라 번지값만 복사 / 참조되는 값만 바뀌는것
		
		person = student;   // 부모는 자식의 모든걸 받아준다!
		student = (Student)person; //강제형 변환
		// soldier = student; // 자식은 형변환이 안된다. - 형변환은 부모자식관계에만 적용
		
		
		Person person2 = new Person(); 
		person2 = new Soldier(); //부모 객체변수 하나만 선언해놓고 자식들은 언제든 쓸수있게..? 
		
		
		Person person3 = new Soldier();
		Person person4 = new Student();
		
		
		System.out.println("----------------------------");
		
		
		Car myCar = new Car();
		
		myCar.carName = "소나타";
		myCar.year = 2010;
		
		myCar.frontTire = new KeumhoTire(); // 설계도가 tire - tire안 객체? 사용가능 - > 부모(tire)안에 자식 (한국,금호)사용가능
		myCar.rearTire = new HankookTire();		
		
		HankookTire hankookTire = new HankookTire();
		KeumhoTire keumhoTire = new KeumhoTire();
		
		
		myCar.tirePrint(hankookTire); // 부모를 써놓으면 여러가지 매개변수를 가져올 수 있다.
		myCar.tirePrint(keumhoTire);
		
		
		
		
		
		
		
		

	}

}
