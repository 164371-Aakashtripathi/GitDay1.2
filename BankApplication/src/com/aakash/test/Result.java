package com.aakash.test;

import java.util.Scanner;


public class Result {


		public static void main(String[] args) {
			
			System.out.println("Enter the marks of Physics:  ");
			Scanner sc = new Scanner(System.in);
			int marks1 = sc.nextInt();
			
			System.out.println("Enter the marks of Chemistry:  ");
			int marks2 = sc.nextInt();
			
			System.out.println("Enter the marks of Maths:  ");
			int marks3 = sc.nextInt();
			 
			int total= (marks1+marks2+marks3);
			
			int average= (marks1+marks2+marks3)/3;
			
			
			System.out.println("Total marks" +  total);
			
			System.out.println("Average marks" +   average);
			
			
		}
	}


