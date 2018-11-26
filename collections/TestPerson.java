package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TestPerson {
	public static void main(String[] args) {
		Set<Person> person = new TreeSet<Person>();

		Person person1 = new Person(55, 160, "Ankur");
		Person person2 = new Person(56, 169, "Ajay");
		Person person3 = new Person(56, 164, "Mayank");
		Person person4 = new Person(54, 162, "Ashish");
		Person person5 = new Person(56, 170, "Braj");

		person.add(person1);
		person.add(person2);
		person.add(person3);
		person.add(person4);
		person.add(person5);

		for (Person per : person)
			per.display();

	}

}