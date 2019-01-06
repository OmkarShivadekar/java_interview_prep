package com.prep.string;

public class HashMapInternal {

	public static void main(String[] args) {
		
		
		// The default size of hashmap is 16
		
		//hashmap internally uses linked list 
		
		/*it stores 4 types of data
		1 : hashcode
		2 : key
		3 : value
		4 : next*/
		
		//"next" is used when there is some hashcode collision occurs
		//(same hashcode of two or more than two keys e.g. "FB" & "Ea" )
		
		//it supports null keys
		
		//null keys stores in 0th index of array buckets
		
		/*for dynamically growing it uses 3 elements
		1 : size of hashmap
		2 : Max capacity also known as "loadFactor = 0.75" which is 75%
		3 : thresHold which tells when to increase the hashMap size*/
		
		//threshold calculated by "loadFactor*size of hashmap"
		//	                        0.75*16 = 12 is threshold
		//means after 12 element insertion it increase(16*2) size of hash map
		//current size*2
		
				// \u000d System.out.println("dssddssd");
				

	}

}
