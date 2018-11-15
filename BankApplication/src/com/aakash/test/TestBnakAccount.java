package com.aakash.test;

import java.util.Scanner;

import com.aakash.bank.BankAccount;

public class TestBnakAccount {
 
	
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to check:");
	 amount = sc.nextInt();
		b1.withdraw(5000);
		b1.deposit(1000);

	}

}
