package com.masaiQ5;


import java.util.*;
public class Main
{
	

	public static void main(String[] args) 
	{

		Employee e=new Employee();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id : ");

		e.setEmployeeId(sc.nextInt());
		
		System.out.println("Enter name : ");

		e.setEmployeeName(sc.next());
		
		System.out.println("Enter Salary : ");
		e.setSalary(sc.nextDouble());
		
		System.out.println("Enter PF percent : ");

		e.calculateNetSalary(sc.nextInt());
		
		System.out.println("Employee details: ");


		
		System.out.println("Id  :"+e.getEmployeeId());
		System.out.println("Name  :"+e.getEmployeeName());
		System.out.println("Salary :"+e.getSalary());
		System.out.println("Net Salary :"+e.getNetSalary());
		
	
	}


}