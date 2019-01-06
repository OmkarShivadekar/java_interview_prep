package com.prep.concepts;

class Outer{ //Outer.class
	public void show() {
		System.out.println("in outer");
	}
	
	
	//member class
	class Inner{	//Outer$Inner.class
		public void display()
		{
			System.out.println("in inner");
		}
	}
	
	//static class
	static class StaticInner{
		public void publish() {
			System.out.println("in static inner");
		}
	}
}





public class InnerDemo { //InnerDemo.class

	public static void main(String[] args) {

		Outer obj = new Outer();
		obj.show();
		
		//calling member class
		Outer.Inner obj2 = obj.new Inner();
		obj2.display();

		//calling static inner class
		Outer.StaticInner obj3 = new Outer.StaticInner();
		obj3.publish();
		
	}

}
