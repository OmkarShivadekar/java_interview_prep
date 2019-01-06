package com.prep.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Limit");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			System.out.println(fib(i));
		}
	}

	private static int fib(int i) {

		if(i==1 || i==2)
			return 1;
		
		return fib(i-1)+fib(i-2);
	}

}
