package com.prep.interthread;

public class ChatDemo {

	public static void main(String[] args) {

		Chat chat = new Chat();
		Friend1 sarang = new Friend1(chat);
		Friend2 mukesh = new Friend2(chat);
		
		new Thread(sarang, "Sarang").start();
		new Thread(mukesh, "Mukesh").start();
	}

}
