# Factory
 - Factory Method is a **creational design pattern** that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. *(Deals with object creation without providing a specific class type for the object. Factory is responsible to give the object of the type specified at run time.)*
 - It is one of the best ways to create an object where object creation logic is hidden to the client.
 - Scope --> Classes

## Intent
 - Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
 - Defining a "virtual" constructor.
 - The *new* operator considered harmful. When you use *new* you are certainly instantiating a concrete class, so that's definitely an implementation, not an interface. Tying the code to a concrete class make the code more fragile and less flexible and the code will not be "closed for modification".

## When to use:
 - There should be a set of classes which implement a common interface.
 - **You don’t know which object to create (You know which object to create only at run time).**
 - Object initialization is somewhat expensive(Have to do some operations in order to create an object).
 - We need to create different type of objects.
 - Different methods contain same object creation code.
 - Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
 - Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
 - When a class doesn't know what sub-classes will be required to create.
 - When a class wants that its sub-classes specify the objects to be created.
 - When the parent classes choose the creation of objects to its sub-classes.
 - When the implementation of an interface or an abstract class is expected to change frequently.
 - When the current implementation cannot comfortably accommodate new change.
 - When the initialization process is relatively simple, and the constructor only requires a handful of parameters.
 - *This design pattern is commonly utilized in JDK, for example: getInstance() method of java.util.Calendar, NumberFormat, and ResourceBundle use factory method design pattern.*

## Pros
 - Creation of different types of objects is possible at run time.
 - It separates the object creation logic from the object usage logic.
 - Removes duplicate code.
 - Thus, makes changing or addition to object creation easier.
 - You avoid tight coupling between the creator and the concrete products.
 - Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
 - Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.
 - Factory Method Pattern allows the sub-classes to choose the type of objects to create.
 - It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that implement that interface or that extends that abstract class.

## Cons
 - The addition of new classes and interfaces could increase the complexity of the code. The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
 - The different types of objects created must have the same parent class.

## Factory Vs Abstract Factory Design Pattern
- Factory method relies on inheritance: object creation is delegated to subclasses which implement the factory method to create objects. Whereas, Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
- The intent of factory method is to allow a class to defer instantiation to its subclasses. The intent of abstract factory is to create families of related objects without having to depend on their concrete classes.

## Useful Links
 - [Stackoverflow example 1](https://stackoverflow.com/questions/2386125/real-world-examples-of-factory-method-pattern#:~:text=5%20Answers&text=A%20class%20implementing%20factory%20design,like%20SQL%20Server%20and%20Oracle.)
 - [Stackoverflow example 2](https://stackoverflow.com/questions/69849/factory-pattern-when-to-use-factory-methods)
 - [Real life example 1](https://codeburst.io/design-patterns-learning-abstract-factory-method-through-real-life-examples-9d0cc99ef0e8)
 - [Real life example 2](https://stacktraceguru.com/factory-design-pattern/)
 - [Real life example 3](http://www.mukeshkumar.net/articles/designpattern/factory-design-pattern-real-world-example)
 - [Baeldung](https://www.baeldung.com/java-factory-pattern)