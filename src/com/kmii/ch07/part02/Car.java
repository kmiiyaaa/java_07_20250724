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
	Tire frontTire = new KuemhoTire(); // 앞바퀴 -> 금호
	Tire rearTire = new HankookTire(); // 뒷바퀴 -> 한국
	 */

	
	//매개변수에 인수로  금호타이어 객체가 들어오면 - 금호, 한국타이어 객체가 들어오면 - 한국 으로 출력하는 메서드
	public void tirePrint(Tire tire) { // 어떤것이든 받아주는 게 부모(tire) 
		//타이어의 이름을 출력
		tire.tireName();
	}
	
}
