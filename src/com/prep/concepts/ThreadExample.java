package com.prep.concepts;


class Hi extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(1000);}catch(Exception e) {}		
		}
	}
}

class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}




public class ThreadExample {

	public static void main(String[] args) throws Exception 
	{

		Hi obj = new Hi();
		Hello obj1 = new Hello();
		
			
		obj.start();
		obj1.start();
		
	}

}
