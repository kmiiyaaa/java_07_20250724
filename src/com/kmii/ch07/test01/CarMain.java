package com.kmii.ch07.test01;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			
			Car car = new Car("소나타");
				car.carType();
				
			Truck t1 = new Truck(5,"트럭");
			t1.truckSit();
			
			Bus bus = new Bus(8,"버스");
				bus.tire();
				
			SportsCar sc = new SportsCar("고급유", 70,"스포츠카");
			sc.carInfo();
		
		
		
	}

}
