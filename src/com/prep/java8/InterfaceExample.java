package com.prep.java8;

//in java 8 we can define method also

interface A{
	void show();
	
	//to define method default keyword is used
	default void display()
	{
		System.out.println("in interface method");
	}
}

class B implements A{

	@Override
	public void show() {
		System.out.println("in class B method");
	}
	
	//we can also override the interface default method
	/*public void display()
	{
		System.out.println("overriding default method of interface");
	}*/
}


public class InterfaceExample {
	public static void main(String[] args) {

		A obj = new B();
		//calling interface default method
		obj.display();
		
		//calling interface abstract method
		obj.show();
		
		
	}

}
