package com.aakash.bank;

import java.util.Scanner;

public class TestbankAccount {
	
	
	public static void testBankAccountmethod(){
		BankAccount acc=new BankAccount();
		acc.setAccountHolderName("Sachin");
	}
	

	public static void testSavingAccount(){
		SavingAccount savingAcc=new SavingAccount("aakash",2000);
	System.out.println("Account No is : "+ savingAcc.getAccountNo());
	System.out.println("Account Holder Name is : "+ savingAcc.getAccountHolderName());
	System.out.println("Account Balance is :"+ savingAcc.getAccountBalance());
	savingAcc.deposit(5000);
	System.out.println("Account Balance is :"+ savingAcc.getAccountBalance());
	System.out.println("===========");
	savingAcc.withdraw(3000);
	System.out.println("Account Balance is :"+ savingAcc.getAccountBalance());
	
	
	}
	
	
	public static void testCurrentAccount(){
	CurrentAccount currentAcc=new CurrentAccount("ashna",40000);
	System.out.println("Account No is : "+ currentAcc.getAccountNo());
	System.out.println("Account Holder Name is : "+ currentAcc.getAccountHolderName());
	System.out.println("Account Balance is : "+ currentAcc.getAccountBalance());
	//currentAcc.deposit(40000);
	//System.out.println("Account Balance is : "+currentAcc.getAccountBalance());
	System.out.println("===========");
	currentAcc.withdraw(50000);
	System.out.println("Account Balance is : "+currentAcc.getAccountBalance());
	System.out.println("odlimit is : "+currentAcc.getOdlimit());
	}
	
	
	
		public static void main(String[] args) {
			
			//testbankAccountMethod();
			testSavingAccount();
			testCurrentAccount();
		}

	}


