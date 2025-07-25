package com.kmii.ch07.part02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire tire; //선언만해놓고 // 스택에 null값
		
		tire = new KeumhoTire(); // -> upcasting / 자식객체 번지수 지정, 자동형변환// 2층집 생기면서 스택에 200번지 지정  
		//  new KeumhoTire로 만든게 2층집,  tire -> 2층집의 2층만 가리킬수 있다. 원래 가리키던 객체만 가능 (한층만가능)
		// tire.tireCompanyKh - 자식필드인 tireCompanyKhsms 사용불가
		
		
		//Tire tire2 = new Tire();
		//HankookTire hankook; - 오류 왜?????
		
		
		KeumhoTire keumho2 ;
		keumho2 = (KeumhoTire) tire;//강제형변환 -> downcasting
	
		keumho2.tireName = "스노우타이어"; // 부모 필드 사용 가능

	}

}
