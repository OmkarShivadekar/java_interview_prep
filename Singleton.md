# Singleton pattern
- Creational design pattern as it deals with object creation.
- If you have common sharable data and you want to share across multiple classes in that case we should go for singleton design pattern

Example
> java.lang.Runtime

1. **Eager Singleton**
    - When object creation done at class loading.
    - Always declare constructor as private
    - Create instance of that class at class loading using static final modifier
    - Declare getter method to get the instance
    - There might be some performance issue in eager singleton if object holding some resource.
  
2. **Lazy Singleton**
    - Object creation will be done when its needed.
    - Add null check to verify if object is created or not
    - To avoid race condition in multi thread environment use synchronized keyword on method


<details>
<summary> Eager Singleton Example </summary>
  
</details>

<details>

<summary> Lazy Singleton Example </summary>
  
</details>
