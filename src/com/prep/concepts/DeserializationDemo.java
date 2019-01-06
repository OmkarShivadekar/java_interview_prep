package com.prep.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("secure.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object emp = ois.readObject();
		
		System.out.println(emp);
		
	}

}
