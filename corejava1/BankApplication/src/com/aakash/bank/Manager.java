package com.aakash.bank;

public class Manager extends Employee{

	public int incentives; 
	
	

	
	
	public Manager(String empname, double empsalary){
		super(empname, empsalary);
	}
	

		public void totalSalary(double totalsalary){
			
			
			 totalsalary=empsalary + incentives;
			
			
			
		}
		
		
		
		
	
	
}
