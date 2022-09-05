package com.masaiQ3;

public class Employe extends Member{
	  String Specialisation;
	  String Department;
	  @Override
		public void printSalary() {
			
			  // TODO Auto-generated method stub
			  System.out.println("Employee Information");
			  System.out.println("Name "+Name+"  Age"+Age+"Address "+Address+"Phone_Number "+Phone_number+" Salary "+Salary);
		  }

}
