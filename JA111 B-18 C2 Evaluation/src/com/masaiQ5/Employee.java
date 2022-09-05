package com.masaiQ5;



public class Employee
{


	private  int  employeeId;
	private  String employeeName;
	private  double salary;
	private  double netSalary;
	
	public Employee()
	{
		super();
	}
	
	
	public void calculateNetSalary(int pfpercentage)
	{
		double  pfamnt=(salary*pfpercentage)/100;
		netSalary=salary-pfamnt;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}
	public void setNetSalary(double netSalary) 
	{
		this.netSalary = netSalary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	public int getEmployeeId() 
	{
		return employeeId;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public double getSalary()
	{
		return salary;
	}
	
	public double getNetSalary() 
	{
		return netSalary;
	}
	
	
	
	
	
	

}


