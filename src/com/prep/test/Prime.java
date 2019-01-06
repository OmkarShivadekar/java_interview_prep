package com.prep.test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Limit");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		for(int i=limit;i>=1;i--)
		{
			if(isPrime(i))
				System.out.println(i);
		}


}

	private static boolean isPrime(int i) {

		if(i<=1)
			return false;
		
		for(int j=2;j<=Math.sqrt(i);i++)
		{
			if(i%j==0)
				return false;
		}
		return true;

	}
}