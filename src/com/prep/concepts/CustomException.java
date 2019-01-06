package com.prep.concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


interface ABC{
	static float a=10;
	
}

public class CustomException extends Something implements ABC{
	
	
	
	@Override
	public void show() throws ArrayIndexOutOfBoundsException {
		
		System.out.println("Hoello");
	}
	
	
	public int returnValue()
	{
		try {
			int res = 12/2;
			return res;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			return 0;
		}
		finally {
			return 1;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		int age = 10;
		
		CustomException ce = new CustomException();
		//ce.show();
		System.out.println(ce.returnValue());
		/*if(age<18) {
			try {
				throw new InvalidAgeException("sorry");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			finally {
				System.out.println("bye");
			}
		}
		else
		{
			System.out.println("please vote");
		}*/
	}
}

class Something{
	
	public void show() 
	{
		System.out.println("World");
	}
}
