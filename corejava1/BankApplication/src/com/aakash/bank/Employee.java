package com.aakash.bank;

public class Employee {
	
	
	private static int autoempid; 
	
	private int empid;
	private String empname;
    protected double empsalary;
    protected double totalsalary;
    
   
    
   
    //init block
    {
    	empid=++autoempid;
    	
    }
     
    //default constructor//
	public Employee()
	{
	empname="unknown";
	empsalary=0;

	}
	
	//Parameterized constructor
	public Employee(String empname, double empsalary)
	{
	this.empname=empname;
	this.empsalary=0;
	}
	
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	 
public void totalSalary(double empsalary){
	

}




 
  
    
    
    
    
    

}
