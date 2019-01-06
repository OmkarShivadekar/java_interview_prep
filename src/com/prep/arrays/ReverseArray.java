package com.prep.arrays;

import java.util.Arrays;

public class ReverseArray{
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int op[] = reverseArr(arr);
		System.out.println("Reverse Array : "+Arrays.toString(op));
	}

	private static int[] reverseArr(int[] arr) {

		int end = arr.length-1;
		int middle = arr.length/2;
		
		
		for(int i = 0;i<middle;i++,end--)
		{
			int temp = arr[i];
			arr[i]=arr[end];
			arr[end] = temp;
		}
		
		
		return arr;
	}
}


