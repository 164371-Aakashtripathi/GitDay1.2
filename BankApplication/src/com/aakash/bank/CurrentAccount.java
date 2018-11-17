package com.aakash.bank;

public class CurrentAccount extends BankAccount{
	
	
	public double  odlimit; 
	{
		odlimit=20000;
	}
	private boolean isSalaryAccount;
	
	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		
			}
	

			public CurrentAccount(){
				this.isSalaryAccount=false;
			}
			
			public  CurrentAccount(String accountHolderName, double accountBalance, boolean isSalaryAccount){
				super(accountHolderName, accountBalance);
				this.isSalaryAccount=false;
			}
			public boolean isSalaryAccount(){
				return isSalaryAccount;
			}
			
			//override
			public void withdraw(double amount){
				double bal=amount-accountBalance;
			if(amount>=accountBalance )
			{
				 this.odlimit-=amount;	
				}
			 else if (amount<=accountBalance )
			 {
				accountBalance=0;
				 this.odlimit-=amount;
			}
			 else 
			 {
				 System.out.println("invalid");
			 }
			}

public double getOdlimit() {
	return odlimit;
}




}
