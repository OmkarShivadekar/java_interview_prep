package com.prep.java8;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		
		
		//for loop 
		/*for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}*/
		
		//enhanced for loop
		/*for(int i :values)
		{
			System.out.println(i);
		}*/
		
		
		//for each introduced in 1.8
		
		values.forEach(i -> System.out.println(i)); 
		
		
		//inside foreach parameter it is implementation of consumer interface
	
		//it is internal part of collection
		
		//so it will be much faster than external for and enhanced for loop
		
	}

}
