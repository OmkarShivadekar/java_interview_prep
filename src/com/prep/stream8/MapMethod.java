package com.prep.stream8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(40,50,60,70,80);
		
		System.out.println(marks);
		
		List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		
		System.out.println(updatedMarks);
	}

}
