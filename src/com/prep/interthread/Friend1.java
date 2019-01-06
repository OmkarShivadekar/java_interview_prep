package com.prep.interthread;

public class Friend1 implements Runnable{

	Chat ch;
	
	public Friend1(Chat ch) {
		super();
		this.ch = ch;
	}

	String que[] = {"hi","how are you","hows everything","ok bye"};

	@Override
	public void run() {

		for(int i= 0; i<que.length;i++) {
			try {
				ch.askQue(que[i], Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
