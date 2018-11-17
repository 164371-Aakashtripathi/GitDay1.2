package Employ;


public class Manager extends Employee{

	public double incentives;
	public double sales;
	
	

	
	
	public Manager(String empname, double empsalary){
		super(empname, empsalary);
	}
	
	public managerSalary()
	{
		double mangersalary;
		
		mangersalary=totalsalary+incentives;
		
	}
	
	
		public  totalSalary(double totalsalary){
		
			if (sales>12000)
			{
				System.out.println("The manger salary is:"+ mangerSalary());
			}
			else if(sales >10000 && sales <50000){
				{
				System.out.println("The manger salary is:"+ mangerSalary);
			}
			else 
			{
				System.out.println("Incentives not provided");
			}
		}
		
		
		
		}		
}
	

