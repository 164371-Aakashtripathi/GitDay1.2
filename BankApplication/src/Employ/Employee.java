package Employ;


public class Employee {
	
	
	private static int autoempid; 
	
	private int empid;
	private String empname;
    protected double totalsalary;
    
    
   
    
   
    //init block
    {
    	empid=++autoempid;
    	
    }
     
    //default constructor//
	public Employee()
	{
	empname="unknown";
	totalsalary=0;

	}
	
	//Parameterized constructor
	public Employee(String empname, double totalsalary)
	{
	this.empname=empname;
	this.totalsalary=0;
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
	public double getTotalSalary() {
		return totalsalary;
	}
	 

	
	
	
	
         abstract totalSalary(){
	
}
	
	
	public static void main(String[] args) {
		
		
		
		Manager man=new Manager();
		man.totalSalary();
		
		
		Labour lab=new Labour();
		lab.totalSalary();
		
	}
	
	
	
	
	
	
SS
}




 
  
    
    
    
    
    

