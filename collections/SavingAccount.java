package com.collections;

public class SavingAccount implements Comparable<SavingAccount>{

	// instance variable /class variable
	public int acc_id;
	public String accountHolderName;
	public double acc_balance;
	public int amount;
	public boolean isSalaryAccount;

	
	
	
	
	public SavingAccount(int acc_id, String accountHolderName,
			double acc_balance, int amount, boolean isSalaryAccount) {
		super();
		this.acc_id = acc_id;
		this.accountHolderName = accountHolderName;
		this.acc_balance = acc_balance;
		this.amount = amount;
		this.isSalaryAccount = isSalaryAccount;
	}

	
	
	public int getAcc_id() {
		return acc_id;
	}



	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public double getAcc_balance() {
		return acc_balance;
	}



	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}



	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}



	@Override
	public String toString() {
		return "SavingAccount [acc_id=" + acc_id + ", accountHolderName="
				+ accountHolderName + ", acc_balance=" + acc_balance
				+ ", amount=" + amount + ", isSalaryAccount=" + isSalaryAccount
				+ "]";
	}



	public void withdraw(double amount) {
		if (amount < 1000 || amount > acc_balance || amount < 0)

			System.out.println("Invalid amount: cant be withdrawn");

		else
			this.acc_balance -= amount;
	}

	public void deposit(double amount) {
		if (amount < 0)
			System.out.println("Invalid amount:cant be deposited");

		else
			this.acc_balance += amount;
	}



	@Override
	public int compareTo(SavingAccount per) {
	if (this.acc_id == per.getAcc_id()){
		return 1;
	}
	else{
		return 0;
	}

	

}
}
