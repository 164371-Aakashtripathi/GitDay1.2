package com.collections;
	
	
	import java.util.Arrays;
    import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;


	public class Proof {
	  
	    public static void main(String args[]){             
	        HashSet<String> fruitsStore = new HashSet<String>();
	        LinkedHashSet<String> fruitMarket = new LinkedHashSet<String>();
	     
	      
	        for(String fruit: Arrays.asList("mango", "apple", "banana")){
	            fruitsStore.add(fruit);
	            fruitMarket.add(fruit);
	         
	        }
	       
	        //no ordering in HashSet – elements stored in random order
	        System.out.println("Ordering in HashSet :" + fruitsStore);

	        //insertion order or elements – LinkedHashSet storeds elements as insertion
	        System.err.println("Order of element in LinkedHashSet :" + fruitMarket);

	     

	      
	        
	       
	    }
	}

