package com.prep.concepts;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		Employee e1 = new Employee(1, "Omkar", 10000);
		
		System.out.println(e1);

		FileOutputStream fos = new FileOutputStream("secure.txt");
		
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(e1);
		
		System.out.println("Object Persist");
		
		
	}

}
