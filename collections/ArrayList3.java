package com.collections;

import java.util.*;
public class ArrayList3 {

	
	
	
	
	 public static void main(String args[]){  
	    ArrayList<String> list=new ArrayList<String>(); 
	           list.add("Ankur");
	           list.add("Vijay");  
	           list.add("Aakash");  
	           list.add("Ajay");  
	           list.add("Rajat");
	            
	           System.out.println("Traversing list in List Iterator:");  
	           //Here, element iterates in reverse order  
	              ListIterator<String> list1=list.listIterator(list.size());  
	              while(list1.hasPrevious())  
	              {  
	                  String str=list1.previous();  
	                  System.out.println(str);  
	     
	 }  
	 }
}

