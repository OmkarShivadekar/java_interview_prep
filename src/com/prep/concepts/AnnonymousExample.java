package com.prep.concepts;


class A{
	//data members
	
	public void show() {
		System.out.println("in class A");
	}
}

class B extends A{
	//if the only purpose is to override the parent class method like
	public void show() {
		System.out.println("in class B");
	}
	//then go for annonymous inner class
}



public class AnnonymousExample {

	public static void main(String[] args) {

		//for calling parent class method
		A obj = new A();
		obj.show();
		
		//for calling child class method
		A obj1 = new B();
		obj1.show();
		
		//for annonymous inner class
		A obj2 = new A()
				{
					public void show() {
						System.out.println("in Annonymous inner class");
					}
				};
		obj2.show();		
				
	}

}
