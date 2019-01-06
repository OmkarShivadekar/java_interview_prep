package com.prep.concepts;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	/*The serialVersionUID is a universal version identifier for a Serializable class. 
	Deserialization uses this number to ensure that a loaded class corresponds exactly to a serialized object. 
	If no match is found, then an InvalidClassException is thrown.*/
	
	
	private int eid;
	private String ename;
	private int salary;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	
	

}
