package Employ;


public class Labour extends Employee{

public double overtime; 
public int days;
	

	
	
	public Labour(String empname, double empsalary){
		super(empname, empsalary);
	}
	
	
	public labourSalary()
	{
		double laboursalary;
		
		laboursalary=totalsalary+overtime;
		
	}
	
	

		public void totalSalary(double totalsalary){
			
			
			if (hours>10)
			{
				System.out.println("The manger salary is:"+ labourSalary());
			}
			else if(hours>10 && hours<20){
				{
				System.out.println("The manger salary is:"+ labourSalary);
			}
			else 
			{
				System.out.println("Overtime not provided");
			}
		}
		
			
			
			
		}
		
	
	
}
