package com.kmii.ch07.test01;

public class Animal {
	
	// Animal 클래스를 상속 받는 Dog, Cat, Tiger 클래스를 만드시오.
	//bark() -> 오버라이딩

		 String name;
		 String bark;
		    
		    
		    public Animal() {
				super();
				
			}
		   

			public Animal(String name, String bark) {
				this.name = name;
				this.bark = bark;
			}


			public void bark() {
		        System.out.println(name+"이 짖습니다.");
		    }


	//public void a1() {
	//	System.out.println("name");
	//	System.out.println("wight");
		
	// }
	
	

}
