# Singleton pattern
- Creational design pattern as it deals with object creation.
- If you have common sharable data and you want to share across multiple classes in that case we should go for singleton design pattern

Example
> java.lang.Runtime

1. **Eager instantiation**
    - When object creation done at class loading.
    - Always declare constructor as private
    - Create instance of that class at class loading using static final modifier
    - Declare getter method to get the instance
    - There might be some performance issue in eager singleton if object holding some resource.
  
2. **Lazy instantiation**
    - Object creation will be done when its needed.
    - Add null check to verify if object is created or not
    - To avoid race condition in multi thread environment use synchronized keyword on method


<details><summary>Eager instantiation Example</summary>
  
  ```java
  class EagerSinglton{
         private static final EagerSinglton instance = new EagerSinglton();

         private EagerSinglton(){
         }

        public static EagerSinglton getInstance(){
            return instance;
        }
  }
    
  public class MyClass {
    
        public static void main(String args[]) {
            EagerSinglton e1 = EagerSinglton.getInstance();
     
            System.out.println("EagerSinglton " + e1.hashCode());
     
            EagerSinglton e2 = EagerSinglton.getInstance();
     
            System.out.println("EagerSinglton " + e2.hashCode());
        }
  }
  ```
</details>

<details><summary>Lazy instantiation Example</summary>
  
  ```java
    class LazySingleton{
        private LazySingleton(){

        } 

        private static LazySingleton instance;

        public static synchronized LazySingleton getInstance(){
            if(instance == null)
                return instance = new LazySingleton();

            return instance;
        }
    }
    
    public class MyClass {
    
        public static void main(String args[]) {
            LazySingleton l1 = LazySingleton.getInstance();
     
            System.out.println("LazySingleton " + l1.hashCode());
     
            LazySingleton l2 = LazySingleton.getInstance();
     
            System.out.println("LazySingleton " + l2.hashCode());
        }
    }
  ```
</details>
 
<details><summary>Double Check Lazy instantiation Example</summary>
  
  ```java
    class DoubleCheckLazySingleton{
        private DoubleCheckLazySingleton(){

        } 

        private static DoubleCheckLazySingleton instance;

        public static  DoubleCheckLazySingleton getInstance(){
            if(instance == null){
                synchronized(DoubleCheckLazySingleton.class){
                    if(instance == null){
                         return instance = new DoubleCheckLazySingleton();
                    }
                }
            }
            return instance;
        }
    }
    
    public class MyClass {
    
        public static void main(String args[]) {
            DoubleCheckLazySingleton d1 = DoubleCheckLazySingleton.getInstance();
     
            System.out.println("DoubleCheckLazySingleton " + d1.hashCode());
     
            DoubleCheckLazySingleton d2 = DoubleCheckLazySingleton.getInstance();
     
            System.out.println("DoubleCheckLazySingleton " + d2.hashCode());
        }
    }
  ```
</details>

<details><summary>Inner class Lazy instantiation Example</summary>
  
  ```java
    class LazyInnerSingleton{
    
        private LazyInnerSingleton(){

        }
        private static class SingletonHelper{
            private static final LazyInnerSingleton inst = new LazyInnerSingleton();      
        }

        public static LazyInnerSingleton getInstance(){
            return SingletonHelper.inst;
        }
    }
    
     public class MyClass {
    
        public static void main(String args[]) {
            LazyInnerSingleton ll1 = LazyInnerSingleton.getInstance();
     
            System.out.println("LazyInnerSingleton " + ll1.hashCode());
     
            LazyInnerSingleton ll2 = LazyInnerSingleton.getInstance();
     
            System.out.println("LazyInnerSingleton " + ll2.hashCode());
        }
    }
  ```
</details>

#
_There are 3 ways we can break singleton behavior in Java_

<details><summary>Cloneable interface</summary>
    
- To prevent this you can overrride clone() menthod and throw CloneNotSupportedException exception
    
    
  ```java
    class LazySingleton extends MyClone{
    
        private LazySingleton(){

        } 

        private static LazySingleton instance;

        //to prevent this we can overrride clone() menthod and throw CloneNotSupportedException exception
         @Override
        protected Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();   
        }

        public static synchronized LazySingleton getInstance(){
            if(instance == null)
                return instance = new LazySingleton();

            return instance;
        }
    }

    class MyClone implements Cloneable{

        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();    
        }
    }

    public class MyClass {
        public static void main(String args[]) throws CloneNotSupportedException {

         LazySingleton inst1 = LazySingleton.getInstance();
          System.out.println(inst1.hashCode());
         LazySingleton inst2 = (LazySingleton) inst1.clone();
          System.out.println(inst2.hashCode());
        }
    }
  ```
</details>

<details><summary>Reflection API</summary>   
    
  ```java
    import java.lang.reflect.Constructor;
    import java.lang.reflect.InvocationTargetException;

    class LazySingleton extends MyClone{
         private static LazySingleton instance;

         //to prevent new object creation using reflection
        private LazySingleton(){
            if(instance != null){
                throw new IllegalStateException("Object cant be created using reflection");
            }
        }

        //to prevent clone this we can overrride clone() menthod and throw CloneNotSupportedException exception
        @Override
        protected Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();   
        }

        public static synchronized LazySingleton getInstance(){
            if(instance == null)
                return instance = new LazySingleton();

            return instance;
        }
    }

    class MyClone implements Cloneable{

        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();    
        }
    }

    public class MyClass {
        public static void main(String args[]) 
            throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{

         LazySingleton inst1 = LazySingleton.getInstance();
         System.out.println(inst1.hashCode());

         LazySingleton reflectionInst = null;

         Constructor[] consts = LazySingleton.class.getDeclaredConstructors();

         for(Constructor theConst : consts){
             theConst.setAccessible(true);
             reflectionInst = (LazySingleton)theConst.newInstance();
         }
          System.out.println(reflectionInst.hashCode());
        }
    }
  ```
</details>

<details><summary>Serializable interface</summary>
    
  ```java
    import java.lang.reflect.Constructor;
    import java.lang.reflect.InvocationTargetException;
    import java.io.Serializable;
    import java.io.*;

    class LazySingleton extends MyClone implements Serializable{

        private static LazySingleton instance;

        //to prevent new object creation using reflection
        private LazySingleton(){
            if(instance != null){
                throw new IllegalStateException("Object cant be created using reflection");
            }
        }

       //to prevent new object creation by deserializing object
        protected Object readResolve(){
            return instance;
        }

        //to prevent this we can overrride clone() menthod and throw CloneNotSupportedException exception
         @Override
        protected Object clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();   
        }

        public static synchronized LazySingleton getInstance(){
            if(instance == null)
                return instance = new LazySingleton();

            return instance;
        }
    }

    class MyClone implements Cloneable{

        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();    
        }
    }

    public class MyClass {
        public static void main(String args[]) 
            throws FileNotFoundException, IOException, ClassNotFoundException{

         LazySingleton inst1 = LazySingleton.getInstance();
         System.out.println(inst1.hashCode());

         ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
         out.writeObject(inst1);
         out.close();

         ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
         LazySingleton inst2 = (LazySingleton)in.readObject();
         in.close();

         System.out.println(inst2.hashCode());

        }
    }
  ```
</details>
