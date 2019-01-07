package com.prep.collection;

import java.util.Enumeration;
import java.util.Vector;


	public class Emp{
		
		int id;
		String name;
		long sal;
		
		
		public Emp(int id, String name, long sal) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
		}
		
		public Emp() {}


		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
		}
		
		
		public void addEmp(Vector<Emp> v) {
			
			v.add(new Emp(1,"ABC",10000));
			v.add(new Emp(2,"XYZ",20000));
			System.out.println("Object added");
			
		}
		
		public void displayEmp(Vector<Emp> v) {
			Enumeration<Emp> en = v.elements();
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}
		}
		
		public static void main(String[] args) {
			
			Emp e = new Emp();
			Vector<Emp> v1 = new Vector<>();
			e.addEmp(v1);
			e.displayEmp(v1);

				
		}
	}
	



