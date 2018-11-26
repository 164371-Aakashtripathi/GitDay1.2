package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList  {

	public static void main(String[] args) {
	
		
		
		Set<SavingAccount> person = new TreeSet<SavingAccount>();

		SavingAccount person1 = new SavingAccount(160, "Ankur", 10000, 5000, true);
		SavingAccount person2 = new SavingAccount(169, "Ajay", 2000, 5000, true );
		SavingAccount person3 = new SavingAccount(154, "Mayank", 2000, 5000, true);
		SavingAccount person4 = new SavingAccount(162, "Ashish", 1000, 20000, true);
		SavingAccount person5 = new SavingAccount(170, "Braj", 3000, 5000, true);
		
		person.add(person1);
		person.add(person2);
		person.add(person3);
		person.add(person4);
		person.add(person5);

		for (SavingAccount per : person)
		System.out.println(per.toString());


	}

}
