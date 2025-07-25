package com.kmii.ch07.part02;

public class Car {

	//필드
	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
	
	
	// 같은 패키지 안에 다른 클래스 불러옴
	Tire frontTire;
	Tire rearTire;
	
	// 둘중에 어떤게 더 가독성 좋은지 줌7/25 듣고 정리
	/*다른방법
	Tire frontTire = new Tire(); // 앞바퀴 -> 금호
	Tire rearTire = new Tire(); // 뒷바퀴 -> 한국
	 */

	
	
}
