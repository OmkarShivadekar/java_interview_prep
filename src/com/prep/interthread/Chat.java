package com.prep.interthread;

public class Chat {

	boolean flag=false;
	
	synchronized void askQue(String que,String threadName) throws InterruptedException {
		
		if(flag) {
			wait();
		}
		System.out.println(que+" : "+threadName);
		flag=true;
		notifyAll();
	}
	
	synchronized void ansQue(String ans,String threadName) throws InterruptedException {
		
		if(!flag) {
			wait();
		}
		System.out.println(ans+" : "+threadName);
		flag=false;
		notifyAll();
	}
}
