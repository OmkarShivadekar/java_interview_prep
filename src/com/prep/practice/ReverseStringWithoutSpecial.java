package com.prep.practice;

public class ReverseStringWithoutSpecial {

	public static void main(String[] args) {

		String email="omkar@ymail.com";
		String op = reverseString(email);
		
		System.out.println(op);
		
		
	}

	private static String reverseString(String email) {

		char arr[]=email.toCharArray();
		
		int left=0;
		int right=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(right<=left) {
				break;
			}
			else
			{
				if(Character.isAlphabetic(arr[left]) && Character.isAlphabetic(arr[right]))
				{
					char temp=arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
					right--;
					left++;
				}
				else if(!Character.isAlphabetic(arr[left]))
				{
					left++;
				}
				else if(!Character.isAlphabetic(arr[right]))
				{
					right--;
				}
			}
			
		}
		
		
		
		return new String(arr);
	}

}
