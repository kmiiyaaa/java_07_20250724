package com.kmii.ch07.test01;

public class Employee extends Person {
	
	 int haveWorker ; 
	    
	    

	    public Employee() {
			super();
			
		}

		public Employee(String name,int age, int haveWorker) {
	        super(name,age);
	        this.haveWorker = haveWorker;
	    }

	    public void work() {
	        System.out.println(name + "는 " + haveWorker + "명의 직원을 고용하였다.");
	    }

}
