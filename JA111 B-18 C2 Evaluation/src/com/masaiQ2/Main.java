package com.masaiQ2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of Students you want to enter");
        int st=sc.nextInt();
        Student [] students=new Student[st];

        for(int i=0;i<st;i++)
        {


            System.out.println("Enter the Roll Number :");
            int roll=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name=sc.nextLine();

            System.out.println("Enter Student Marks : ");
            int marks=sc.nextInt();
            students[i]=new Student(roll, name, marks);
       
         
            System.out.println("Student Detail "+i+1);
            System.out.println("Student Name:"+students[i].getStudentName());
            System.out.println("Student Roll Number:"+students[i].getRollNumber());
            System.out.println("Student Mark:"+students[i].getMarks());

            System.out.println("=========================================");

        }

      
		
		
	}

}
