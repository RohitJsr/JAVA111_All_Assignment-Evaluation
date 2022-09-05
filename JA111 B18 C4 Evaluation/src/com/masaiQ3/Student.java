package com.masaiQ3;

import java.util.Objects;

public class Student {
	private int rollNo;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	
	public Student() {
		super();
	}
	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(engMarks, mathsMarks, name, rollNo, scienceMarks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return engMarks == other.engMarks && mathsMarks == other.mathsMarks && Objects.equals(name, other.name)
				&& rollNo == other.rollNo && scienceMarks == other.scienceMarks;
	}
	
	

}
