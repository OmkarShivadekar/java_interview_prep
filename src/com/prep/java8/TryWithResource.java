package com.prep.java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {

	
	public static void main(String[] args) throws Exception {
		
		int n=0;
		
		
		System.out.println("enter a number");
		//from 1.7 it is not compulsory to write finally block
		
		//instead of closing resource in finally you can close using try()
		
		//it will close the resource automatically when object goes out of scope 
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			n=Integer.parseInt(br.readLine());
		}
		
		System.out.println(n);

		String o ="om";
		String o1 = new String("om").intern();
		System.out.println(o==o1);
	}

}
