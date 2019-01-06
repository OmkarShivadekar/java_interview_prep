package com.prep.string;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="omkar";
		
		String email = "omkar@ymail.com";
		String reverseString = reverse(input);

		System.out.println("output : "+reverseString);
	
		String op = antiSpecialReplace(email);
		System.out.println("without replacing special : "+op);
	}

	private static String antiSpecialReplace(String email) {

		char arr[] = email.toCharArray();
		
		int l = 0;
		int r = arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(r<=l)
			{
				break;
			}
			else
			{
				if(Character.isAlphabetic(arr[l]) && Character.isAlphabetic(arr[r]))
				{
					char temp = arr[l];
					arr[l]=arr[r];
					arr[r]=temp;
					l++;
					r--;
				}
				else if(!Character.isAlphabetic(arr[r]))
				{
					r--;
				}
				else if(!Character.isAlphabetic(arr[l]))
				{
					l++;
				}

					
			}
		}
		
		return new String(arr);
	}

	private static String reverse(String input) {
		
		char charArray[] = input.toCharArray();
		int l=0;
		int r=charArray.length-1;
		int middle = l+(charArray.length/2);
		
		for(;l<middle;l++,r--)
		{	
			char temp = charArray[l];
			charArray[l] = charArray[r];
			charArray[r] = temp;
			
			//System.out.println(charArray[i]);
		}
		
		
		
		return new String(charArray);
	}

}
