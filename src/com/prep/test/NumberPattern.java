package com.prep.test;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter rows : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		int num=0;
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(num+" ");
				++num;
			}
			System.out.println();
		}
		
	}

}
