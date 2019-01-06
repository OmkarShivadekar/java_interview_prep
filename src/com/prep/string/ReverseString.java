package com.prep.string;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String demo = "omkar@ymail.com";
		System.out.println(demo);
		
		char charArray[] = demo.toCharArray();
		int length = charArray.length;
		char temp;
		int l=0;
		int r=length-1;
		
		for(int i=0;i<length;i++)
		{
			if(r<=l)
			{
				break;
			}
			if(Character.isAlphabetic(charArray[l]) && Character.isAlphabetic(charArray[r]))
			{

				temp=charArray[l];
				charArray[l]=charArray[r];
				charArray[r]=temp;
				l++;
				r--;
			}
			else if(!Character.isAlphabetic(charArray[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(charArray[r]))
			{
				r--;
			}
		}
		System.out.println(charArray);
		
	}

}
