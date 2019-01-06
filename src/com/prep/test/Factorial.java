package com.prep.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Factorial of "+number+" is "+fact(number));
		
	}

	private static int fact(int number) {

		if(number<=1)
			return 1;
		else
			return number*fact(number-1);
		
		
	}

}
