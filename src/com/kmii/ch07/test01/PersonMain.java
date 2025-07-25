package com.kmii.ch07.test01;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//person
			
			Person p1 = new Person();
			p1.agePerson("홍길동", 15);

		
		
		//student
		
			Student s1 = new Student("김00",15,"정보중학교");
			s1.school();
		
		//soldier
			
			Soldier sol = new Soldier("홍00",30,"서울");
			sol.work();

			
		//employee
			
			Employee em = new Employee("박00",45,50);
			em.work();
			

	}

}
