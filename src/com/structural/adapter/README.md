# Adapter
- Adapter is a **structural design pattern** that allows objects with incompatible interfaces to collaborate. It acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. Also known as Wrapper.
- Match interfaces of different classes.
- The Adapter acts as a wrapper between two objects. It catches calls for one object and transforms them to format and interface recognizable by the second object. In simple way, it converts the interface of a class into another interface that a client wants.
- The object that joins the unrelated interfaces is an Adapter, while the original interface is an Adaptee.
- Adapter can hold two or more adaptees that are
  needed to implement the target interface.

## Intent
- Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
- Wrap an existing class with a new interface.
- Impedance match an old component to a new system.

## Two version
Learn about both the types of adapter [here](https://www.baeldung.com/java-adapter-pattern).

Adapter must implement the interface expected by the client.
- Object Adapter: 
    - Object adapter we use composition to pass requests to an Adaptee.
    - The object adapter implements the target interface by delegating to an adaptee object at run-time. *(Both the examples are demonstration of object adapter)*
    - The Adapter will have an instance of adaptee class. The adapter method will call the expected functionality method of the inherited adaptee class.
- Class Adapter:
    - Subclass the Target and the Adaptee
    - The class adapter implements the target interface by inheriting from an adaptee class at compiler-time.
    - The Adapter method will call the expected functionality method of the inherited adaptee class.

## When to use:
- We have an existing object that provides the functionality required by the client, but client code cannot use the object because it expects the functionality in a different interface.
- Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
- Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.
- When we want to reuse legacy or 3rd-party code in our application without making any modification in the original code.
- When an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application. A suitable Adapter can be developed to make them compatible with each other.

## Pros
- Helps achieve reusability and flexibility. Allows reusability of existing functionality.
- Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementations of adapters.
- It allows two or more previously incompatible objects to interact.
- Achieves Single Responsibility Principle.
- Achieves Open/Closed Principle.

## Cons
- All requests are forwarded, so there is a slight increase in the overhead.
- Sometimes many adaptations are required along an adapter chain to reach the type which is required.
- The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.

## Useful Links
- [Baeldung blog](https://www.baeldung.com/java-adapter-pattern)
- [Example 1](https://www.adevguide.com/adapter-design-pattern-java/)
