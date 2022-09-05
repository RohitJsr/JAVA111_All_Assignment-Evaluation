package com.masaiQ3;

public class Main {
   public static void main(String[]args) {
	   Employe e=new Employe();
	   e.Name="Robert";
	   e.Age=35;
	   e.Address="Surat";
	   e.Phone_number="235687";
	   e.Salary=29000;
	   e.printSalary();
	   
	   Manager m=new Manager();
	   m.Name="Sahil";
	   m.Age=58;
	   m.Address="Delhi";
	   m.Phone_number="58962";
	   m.Salary=65000;
	   m.printSalary();
   }
}
