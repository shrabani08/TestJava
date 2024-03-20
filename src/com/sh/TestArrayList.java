package com.sh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> arrStr=new ArrayList<String>();
		List<String> arrStr2=new ArrayList<String>();
		arrStr.add("ant");
		arrStr.add("bee");
		arrStr.add("cat");
		
		arrStr2.add("ant");
		arrStr2.add("bee");
		arrStr2.add("cat");
		
	//	System.err.println(arrStr.equals(arrStr2));
		
		
		arrStr.stream().forEach(System.out::println); 
		arrStr.add(1, "dog");
		System.err.println("************");
	//	Collections.sort(arrStr);
		arrStr.stream().forEach(System.out::println); 
		System.err.println("************");
	//	arrStr.remove(1);
		arrStr.set(1, "efg");
		arrStr.stream().forEach(System.out::println); 

		System.err.println("************");
		arrStr.remove(1);
		arrStr.remove("cat");
		arrStr.stream().forEach(System.out::println); 
		System.err.println("************");
	/////////////////////////////////////////////////////////	
		
		arrStr.stream().forEach(s -> System.err.println(s));
		
		arrStr.stream().forEach(s -> System.err.println(s)); //index of element
		
		System.err.println(arrStr.toString()); //to string
		
		////////////////////////////////////////////////////////////
		
		ArrayList<Double> list = new ArrayList<Double>();
		 list.ensureCapacity(30); 
		  System.out.println("Size Of ArrayList = "+list.size());  
        list.add(1.1);
        list.add(2.2); 
        list.add(3.3);
        list.add(4.4);
        list.add(5.5);
        System.out.println(list);     //Output : [1.1, 2.2, 3.3, 4.4, 5.5]
        System.out.println("Size Of ArrayList = "+list.size());   //Output : Size Of ArrayList = 5
        
        //***************************************************************/
        
        //multiply corresponding elements of two list with java 8
	}

}
