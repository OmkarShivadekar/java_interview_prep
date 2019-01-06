package com.prep.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		
		//both interfaces are used to compare two objects that belong to a Class
		
		/*Comparable<> :
			It is capable of comparing itself with another object
			It is present inside java.lang package
			It has compareTo(para1) method which accept only 1 parameter
		
		*Comparator<> :
		*	It is capable of comparing two different objects
		*	It is present inside java.util package
		*	It has compare(para1,para2) method which accept 2 parameters
		*/
		
		
		//When to use Comparator over Comparable
		
		/*There are 2 scenarios where we can use comparator
		1. If the class already implemented Comparable<> interface and 
		we want to modify our sorting logic.
		
		2. If the class present in external jar which we cannot modify
		then we should go for Comparator<>
		*/
		
		
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 12, 700));
		laps.add(new Laptop("Apple", 8, 7700));
		laps.add(new Laptop("Dell", 16, 800));
		
		System.out.println("Before Sorting : ");
		laps.forEach(i -> System.out.println(i));
		
		Comparator<Laptop> c = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop l1, Laptop l2) {
				
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
					return-1;
			}
		};
		
		System.out.println("After Sorting : ");
		Collections.sort(laps,c);
		laps.forEach(i -> System.out.println(i));
		
	}

}
