package com.masaiQ1;

import java.util.Scanner;

public class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name= sc.next();
		System.out.println("Enter the gender of the student");
		gender=sc.next();
		System.out.println("Enter the student id");
		studentId=sc.nextInt();
		System.out.println("Enter the course Enrolled num of the student");
		courseEnrolled =sc.next();
		System.out.println("Enter the course fee of the student");
		courseFee=sc.nextInt();
		System.out.println("Enter the city of the of Student");
		ad.city=sc.next();
		System.out.println("Enter the state of the student");
		ad.state=sc.next();
		System.out.println("Enter the pincode of the student");
		ad.pincode=sc.next();
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}
	
	

}
