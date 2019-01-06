package com.prep.interthread;

public class Friend2 implements Runnable{

	Chat ch;
	
	public Friend2(Chat ch) {
		super();
		this.ch = ch;
	}

	String ans[]= {"Hello","I am Fine","all good","bye"};

	@Override
	public void run() {
		for(int i=0;i<ans.length;i++) {
			try {
				ch.ansQue(ans[i], Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
