package com.prep.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {

		String str = "I am am learning java java";
		
		System.out.println("Input : "+str);
		
		String output[] = removeDuplicates(str);
		
		List<String> op = duplicateOccurance(str);
		
		if(op.isEmpty())
		{
			System.out.println("There are no duplicate words");
		}
		else
		{
			System.out.println(String.join("", op));
		}
		
		String sentence = String.join(" ", output);
		
		System.out.println("After removing Duplicates : "+sentence);
		
	}

	private static List<String> duplicateOccurance(String str) {

		HashMap<String, Integer> map = new HashMap<>();
		
		String words[] = str.split(" ");
		
		for(String temp:words)
		{

			if(map.containsKey(temp))
			{
				int count = map.get(temp);
				count++;
				map.put(temp, count);
			}
			else
			{
				map.put(temp,1);
			}
		}
		
		 Set<Entry<String, Integer>> entrySet = map.entrySet();

		 List<String> list = new ArrayList<>();
		 
		 for (Entry<String, Integer> entry : entrySet) {
		
			 if(entry.getValue()>1)
			 {
				 list.add("Word : "+entry.getKey()+" appears "+entry.getValue()+" times\n");
			 }
			 
			 //System.out.println("Word : "+entry.getKey()+" appears "+entry.getValue()+" times");
		 }
		
		return list;
	}

	private static String[] removeDuplicates(String str) {

		String[] words = str.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String temp:words)
		{
			set.add(temp);
		}
		
		return set.toArray(new String[set.size()]);
	}

}
