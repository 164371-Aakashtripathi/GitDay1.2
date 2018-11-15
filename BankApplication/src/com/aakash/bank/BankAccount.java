package com.aakash.bank;

import java.util.Scanner;

public class BankAccount {
	
	//static variable
	private static int autoAccountNo; 

	//instance variable /class variable
	private int accountNo;
	private String accountHolderName;
    private double accountBalance;
   public int amount;
    
    
    //init block/brings reusability
    {
    	accountNo=++autoAccountNo;
    	
    }
     
    //default constructor//
	public BankAccount()
	{
	accountHolderName="unknown";
	accountBalance=0;

	}
	
	//Parameterized constructor
	public BankAccount(String accountHolderName, double accountBalance)
	{
	this.accountHolderName=accountHolderName;
	this.accountBalance=accountBalance;
	
	}
	
	//re-initialize and modifying the member variable using setter method 
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	 
	
 public void withdraw(double amount)
 {
	 if(amount<1000 || amount>accountBalance || amount<0)
	
		 System.out.println("Invalid amount: cant be withdrawn");
	 		
	 else
	 this.accountBalance-=amount;
 }
 
 
 public void deposit(double amount)
 {
	 if(amount<0)
		 System.out.println("Invalid amount:cant be deposited");
	 
	 else
	 this.accountBalance+=amount;
 }
}

public class Account{
 
	
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to check:");
	
		int amount=sc.nextInt();
		
		b1.withdraw(amount);
		b1.deposit(amount);

	}

}

	
	
