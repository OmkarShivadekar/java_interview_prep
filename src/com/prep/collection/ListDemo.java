package com.prep.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Omkar");
		list.add("Mayur");
		list.add("Prachi");
		list.add("Neha");
		
		Iterator<String> itr = list.iterator();
		System.out.println("Using iterator");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ListIterator<String> lItr = list.listIterator();
		
		System.out.println();
		
		System.out.println("Using list iterator");
		while(lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
		
		System.out.println();
		while(lItr.hasPrevious())
		{
			System.out.println(lItr.previous());
		}
		
		
		

	}

}
