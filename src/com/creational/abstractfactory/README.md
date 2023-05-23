# Abstract Factory
- Abstract Factory is a **creational design pattern** that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- Abstract Factory is factory of factories. It is considered as another layer of abstraction over factory pattern.
- It deals with factory creation and Factory deals with objects/instance creation.
- In absence of abstract factory the client would need to be aware which instances to create. Abstract factory allows to move this logic away from the client side into a separate abstraction layer.
- Abstract factory pattern implementation provides us with a framework that allows us to create objects that follow a general pattern. So at runtime, the abstract factory is coupled with any desired concrete factory which can create objects of the desired type.

## Intent
- Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
- A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
- The new operator considered harmful.

## Does abstract factory violate Open/Closed principle?
```
- As per this principle, the class should be open for extension and closed for modification.
- As per our example if we want to setup a new store, we will create new class/factory 
but will need to modify the switch case in our FactoryProvider. 
- Some might argue that this is violation of the principle but we are not modifying existing code we are
 only adding new case. 
 So it is a minor violation.
- Our aim with design principles should be to minimize the number of changes required for extension.
```

### Factory Method vs. Abstract Factory
- The Factory Method uses inheritance as a design tool.
- Meanwhile, Abstract Factory uses delegation. 
- The first relies on a derived class to implement,
whereas the base provides expected behavior. Additionally, it is over-method and not over a class.
- On the other hand, Abstract Factory is applied over a class. 
- Both follow OCP and SRP, producing a loosely coupled code and more flexibility for future changes in our codebase. The creation code is in one place.

## Usage
- An example of the Abstract Factory design pattern in the JDK is the newInstance() of javax.xml.parsers.DocumentBuilderFactory class.
- javax.xml.parsers.DocumentBuilderFactory#newInstance()
- javax.xml.transform.TransformerFactory#newInstance()
- javax.xml.xpath.XPathFactory#newInstance()

## When to use:
- Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.
- The client is independent of how we create, compose and represent the objects in the system. The client doesn’t need to know how the final product is actually created.
- The system consists of multiple families of objects, and these families are designed to be used together.
- We need a run-time value to construct a particular dependency.
- When you want to provide a library of objects that does not show implementations and only reveals interfaces.
- When the system needs to be configured with one of a multiple family of objects.

## Pros
- You can be sure that the products you’re getting from a factory are compatible with each other.
- Good for abstraction and family of similar objects.  
- You avoid tight coupling between concrete products and client code. It provides an approach to code for interface rather than implementation. It isolates the client code from concrete (implementation) classes.
- Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
- Open/Closed Principle. You can introduce new variants of products without breaking existing client code.
- Abstract Factory pattern is "factory of factories" and can be easily extended to accommodate more products, for example, we can add another sub-class CaliforniaStyleVeggiePizza and CaliforniaStyleCheesePizza and a factory CaliforniaStoreFactory.
- Abstract Factory pattern is robust and avoids conditional logic of Factory pattern.
- It eases the exchanging of object families and promotes consistency among objects.
- Uniform object creation methods.
- Uniformity in object management.
- Reduced exposure of underlying base code.
- Abstraction of the object creation methodology.
- Easier development process due to abstraction at object creation layer.

## Cons
- Pattern inside pattern.
- The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.
- This is a lot more complex to implement than the factory method.
- If a product needs to implement new functionality, all concrete products will require to make the change.
- It is difficult to visualize the need for this pattern at the start of system design and also very complex to adapt this into the existing system.
- Abstract Factory Design Method makes sense only when the system has “Product Families“.
- Do not use it when the underlying object factories are not logically connected.
- Do not use it when the underlying object factories are meant to serve objects with different purpose.
- Do not use it in scenarios where the object factory has widely varying attributes.

## Useful Links
- [Scaler Example](https://www.scaler.com/topics/design-patterns/abstract-factory-design-pattern/)
- [Baeldung blog](https://www.baeldung.com/java-abstract-factory-pattern)
- [Factory Vs Abstract Factory Pattern](https://www.baeldung.com/java-factory-pattern)
- [Example 1](https://www.adevguide.com/abstract-factory-design-pattern-java/)
- [Example 2](https://www.geeksforgeeks.org/abstract-factory-pattern/)
- [Stackoverflow example](https://stackoverflow.com/questions/2280170/why-do-we-need-abstract-factory-design-pattern#:~:text=A%20real%20life%20example%20for,Database%20and%20an%20XML%20file)