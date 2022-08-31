# Java 8 Interview questions

**1. What are all features of java 8**
- Functional interface (include default & static method)
- Lambda expression
- Stream
- CompletableFuture
- Java DateTime API

**2. What is functional interface**

An interface that contains only one abstract method is known as functional interface. It can have any number of default and static methods.
|⚠️Note |
| :------- |
| <ul> <li>All methods in interface are public and abstract.  </li> <li>Default methods are not forced to override by implementation class. There is no restriction to override it.</li> <li>Static methods are act as utility method for interface.There is no restriction to override it. </li></ul>|
```java
@FunctionalInterface
public interface UPIPayment {

	String doPayment(String source, String destination);

	default double getScratchCard() {
		return new Random().nextDouble();
	}
	
	//act as utility method
	static String datePatternt(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());
	}
}
```

**3. Few functional interface which is already there before java 8**
- Runnable
- Callable
- Comparator  
>Comparator contains only 1 abstract method called compare() and equals() does not belong to the Comparator interface. It is inherited from the Object class. That's why we cannot count it as an abstract method.

**4. Can we extends functional interface from another functional interface** 

Yes we can extend but it’ll not act as a functional interface because it’ll find multiple abstract methods. It’ll behave as a normal interface. 

**5. What are all functional interface introduced in java 8**
- Function ```R apply(T t);```
- Predicate ```boolean test(T t);``` 
- Consumer ```void accept(T t);```
- Supplier ```T get();```

**6. What is lambda expression**

- A short block of code which takes in parameters and returns a value. 
- Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
- Passing functions to the code.
- Express instance of functional interface, in other words it provides a clear and concise way to represent a method of a functional using an expression.
- Simplest way to create lambda is copy the interface method, remove the prefix and datatype of parameters and provide the expression (arrow)

**7. Advantages and disadvantages of lambda expression**
| Advantages | Disadvantages |
| ------- | ---------------|
| <ol><li>Avoid writing anonymous implementation</li><li>It saves lot of code</li><li>The code is directly readable</li></ol> | <ol><li>Hard to use without IDE</li><li>Complex to debug</li></ol> |

**8. What is Stream API**

Stream API introduced in java 8 to process collection of objects with functional style of coding using lambda expression.

**9. What is Stream in java 8**
- A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result
- A stream is not a data structure, instead it takes input from Collections, Arrays or I/O channels.
- Stream don't change the original data structure, they only provide the result as per the pipelined method

**10. What is method reference in java 8**

It is shorthand notation of lambda expression to call a method
```java
numList.stream().filter(n -> n>5).sorted().forEach(System.out::println);
```

