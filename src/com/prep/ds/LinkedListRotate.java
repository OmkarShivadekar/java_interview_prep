package com.prep.ds;

public class LinkedListRotate {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next = null;
		}
	}
	
	void rotate(int k) {
		
		if(k==0)
			return;
		
		Node current = head;
		
		int count=1;
		while(count<k && current != null)
		{
			current = current.next;
			count++;
		}
		
		if(current == null)
			return;
		
		Node kthNode = current;
		
		while(current.next!=null)
			current = current.next;
			
		current.next = head;
		
		head = kthNode.next;
		
		kthNode.next = null;
		
	}
	
	void push(int new_data) {
		
		Node new_node = new Node(new_data);
		 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
	}
	
	void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	
	public static void main(String[] args) {

		LinkedListRotate list = new LinkedListRotate();
		
		//creating list
		for(int i=60;i>=10;i-=10)
			list.push(i); //10,20,30,40,50,60
		
		System.out.println("Given List : ");
		list.printList();
		
		list.rotate(2);
		
		System.out.println("Rotated Linked List");
        list.printList();
		
	}

}
