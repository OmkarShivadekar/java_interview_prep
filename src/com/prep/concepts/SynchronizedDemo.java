package com.prep.concepts;

class Counter{
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) throws Exception 
	{

		
		Counter c = new Counter();
		Thread t1 = new Thread(() ->
			
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
				);
		Thread t2 = new Thread(() ->
			
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
			}
				);
		
		t1.start();
		t2.start();
		
		//one thread value/process will reflect/override with other thread if we don't use join method
		
		t1.join();
		t2.join();
		
		System.out.println("Count "+c.count);
	}

}
