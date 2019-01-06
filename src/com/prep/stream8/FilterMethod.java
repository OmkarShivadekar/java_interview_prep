package com.prep.stream8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethod {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> collect = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		/*Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> newMap = new HashMap<>();
		
		map.put("one", 1000);
		map.put("two", 2000);
		map.put("three", 3000);
		map.put("four", 4000);
		map.put("five", 5000);
		
		newMap.putAll(map); //to copy
		
		System.out.println(map);
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> ent:entrySet) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}*/
	}

}
