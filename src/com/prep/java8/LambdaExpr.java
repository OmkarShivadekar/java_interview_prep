package com.prep.java8;

/*in java 8 there are 3 types of interfaces
1.Normal
2.Marker
3.Single Abstract method(SAM) - functional interface
*/

//to use lamda expression we must use functional interface because it has only one method 

//java 8 gives annotation called
@FunctionalInterface
interface Abc{
	void show(int i);
}

public class LambdaExpr {

	public static void main(String[] args) {

	//it helps to remove biolar-plate code like this
		
	//when we create annonymus inner class the class file which is generated LambdaExpr$1.class	
		Abc obj = new Abc() {
			public void show(int i)
			{
				System.out.println("without lambda " +i);
			}
		};
		obj.show(5);
		
		//Abc obj1 = () -> System.out.println("by using lambda expression");
		Abc obj1 = i -> System.out.println("by using lambda expression "+i);
		obj1.show(4);
		
		//when we use lambda expression for interface it doesn't create annonymous inner class file
		
	}

}
