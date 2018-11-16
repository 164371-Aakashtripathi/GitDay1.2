package com.aakash.bank;

public class Labour extends Employee{

public int overtime; 
	

	
	
	public Labour(String empname, double empsalary){
		super(empname, empsalary);
	}
	

		public void totalSalary(double totalsalary){
			
			
			totalsalary= empsalary + overtime;
			
			
			
		}
		
	
	
}
