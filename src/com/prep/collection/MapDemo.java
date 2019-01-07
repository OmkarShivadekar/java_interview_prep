package com.prep.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

	
		HashMap<Integer,String> map = new HashMap<>();
		//System.out.println("size "+map.size());
		
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, null);
		map.put(4, "Apr");
		
		//System.out.println("size "+map.size());
		
		System.out.println("Element "+map.get(2));
		//System.out.println("Key "+map.containsKey(1));
		//System.out.println("Value "+map.containsValue("Feb"));
		
		Set<Entry<Integer,String>> entry = map.entrySet();
		
		for(Entry<Integer,String> ent:entry) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
	}

}
