package com.prep.concepts;

public class BookMyShow implements Runnable{

	int avgSeat = 2;
	int reqSeat;
	String movieName;
	
	
	
	public BookMyShow(int reqSeat, String movieName) {
		this.reqSeat = reqSeat;
		this.movieName = movieName;
	}

	@Override
	public void run() {
	
		synchronized (this) {
			
			String threadName = Thread.currentThread().getName();
			
			if(avgSeat>=reqSeat)
			{
				System.out.println("ticket booked for "+threadName);
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
			else
			{
				System.out.println("sorry "+threadName+" no ticket available");
			}
			avgSeat-=reqSeat;
			
		}
	}

	
	
	public static void main(String[] args) {
		
		BookMyShow show = new BookMyShow(2, "Avengers");
		
		Thread t1 = new Thread(show, "Couple 1");
		Thread t2 = new Thread(show, "Couple 2");
		
		t2.start();
		t1.start();
		
		
	}
}
