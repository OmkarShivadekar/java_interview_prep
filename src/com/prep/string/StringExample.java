package com.prep.string;

public class StringExample {

	public static void main(String[] args) {

		//store in string constant pool
		String stud1 = "Om";
		String stud2 = "Om";
		String stud3 = "Om";
		String stud4 = "Om";
		
		
		stud4.concat("kar");
		
		//stores in heap area
		String c = new String("Om").intern();
		
		String stud10 = new String("Omkar");
		String stud11 = new String("Omkar");
		
		
		System.out.println(stud1==stud4);
		System.out.println(stud10==stud11);
	}

}
