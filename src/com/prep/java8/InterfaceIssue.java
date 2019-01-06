package com.prep.java8;

//because of new feature of defining method inside interface in 1.8 
//there is ambiguity problem arise(multiple inheritance)

interface DemoA{
	default void show()
	{
		System.out.println("in DemoA interface");
	}
}
interface DemoB{
	default void show()
	{
		System.out.println("in DemoB interface");
	}
}

class DemoImpl implements DemoA,DemoB{

	//to solve this issue we can use super keyword with interface as well
	
	@Override
	public void show() {
		//DemoA.super.show();
		DemoB.super.show();
	}
	
}


public class InterfaceIssue {

	public static void main(String[] args) {
		
		DemoImpl obj = new DemoImpl();
		obj.show();
	}

}
