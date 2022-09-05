package com.masaiQ1;

public class Main {
	public static Person generatePerson(Person person) {
		person.setDetails();
		return person;
	}
	
	
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());
		Person newInstructor = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newInstructor);
		 
	}

}
