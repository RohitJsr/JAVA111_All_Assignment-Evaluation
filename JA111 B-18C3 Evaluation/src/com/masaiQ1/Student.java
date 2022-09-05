package com.masaiQ1;

public class Student {
	
	private int roll;
	private String  name;
	private int marks ;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	Student(){
		
	}
	
	public void showDetails() {
		
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		;
		System.out.println("Marks is :"+marks);
	}

	Student(int roll, String name, int marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
}
}
