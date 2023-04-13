# Spring

| Five Different Spring exceptions | Description |
----|:----
|BeanCreationException | <li>This comes when there are circular dependencies between any two classes. <li> e.g. Employee have dependency on department and department have dependency on Employee and both are created using constructor injections. <li>To solve this we can mark one of the class with `@Lazy` annotation 
|NoSuchBeanDefinationException| <li>This comes when there are circular dependencies between any two classes
|NoUniqueBeanDefinationException| <li> This comes when one interface have two implementations. <li> We can solve this using `@Qulifier` or make one of the implementation annotate as `@Primary`
|BeanInstantiationException|<li> This occurs when we annotate the abstract class as a `@Service` or define it as a bean in the configuration class.
|ApplicationContextException|<li> This occurs when we miss to annotate `@SpringBootApplication`
