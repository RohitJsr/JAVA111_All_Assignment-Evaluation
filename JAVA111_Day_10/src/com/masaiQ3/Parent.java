package com.masaiQ3;

public  class Parent {
	public  void method1() {
		  System.out.println("Inside Method 1 of parent class");
	}
	private  void method2() {
		  System.out.println("Inside Method 2 of parent class");
		  method1();
	}
	public void method3() {
		  System.out.println("Inside Method 2 of parent class");

	}
	 
	 final int number = 0;
	 
	

}
