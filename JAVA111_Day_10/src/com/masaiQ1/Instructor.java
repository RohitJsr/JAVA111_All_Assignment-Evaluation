package com.masaiQ1;

import java.util.Scanner;

public class Instructor extends Person {

	int instructorId;

	int salary;
	
	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the name of the instructor");
		name=sc1.next();
		System.out.println("Enter the gernder of the Instuctor");
		gender=sc1.next();
		System.out.println("Enter the Instructor Id num");
		instructorId=sc1.nextInt();
		System.out.println("Enter the salary of the Instuctor");
		salary =sc1.nextInt();
		System.out.println("Enter the Instructor city");
		ad.city=sc1.next();
		System.out.println("Enter the state of the Instructor");
		ad.state=sc1.next();
		System.out.println("Enter the pincode of the Instructor");
		ad.pincode=sc1.next();
		
		
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}
	
	
}
