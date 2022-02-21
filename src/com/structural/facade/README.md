# Facade
- Facade is a **structural design pattern** that provides a simplified interface to a library, a framework, or any other complex set of classes.
- A single class that represents an entire subsystem.
- Instead of making your code work with dozens of the framework classes directly, you create a facade class which encapsulates that functionality and hides it from the rest of the code. This structure also helps you to minimize the effort of upgrading to future versions of the framework or replacing it with another one. The only thing you’d need to change in your app would be the implementation of the facade’s methods.
- Practically, every Abstract Factory is a type of Facade.
- Subsystem may be dependent with one another. In such case, facade can act as a coordinator and decouple the dependencies between the subsystems.
- Provides a simple interface to hide details of the complex system
- Used to provide an abstraction layer over complex classes or subsystems to expose only what is required for the client.
- Reduces the efforts required to make changes if the library changes and the code is highly coupled with each other

## Problem
Imagine that you must make your code work with a broad set of objects that belong to a sophisticated library or framework. Ordinarily, you’d need to initialize all of those objects, keep track of dependencies, execute methods in the correct order, and so on. As a result, the business logic of your classes would become tightly coupled to the implementation details of 3rd-party classes, making it hard to comprehend and maintain.

## Intent
- Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
- Wrap a complicated subsystem with a simpler interface.

## When to use
1. Integration with third party libraries
    - Helps to keep the code loosely coupled between our application and the library version or provider
    - Library could be huge but we only need few features(maybe 1-2 out of 100) of it.
    - Can also protect the code against unstable/on progress API.                                                   
    Ex:

                    Application -------> Facade ---------> Library Impl
                                        getX()             getX(), doX(), getY(), doY().......N other methods
                                        doY()

2. Abstraction layer over complex class
    - Client 1 needs to use 5 methods of a complex class and Client 2 needs to use 100 methods of the system
    - Create two facade layer for each of the 2 clients
    --- As a result, the client does not need to change anything if we refactor/migrate the complex class
    --- Only facade layer will change if required

    Ex:

                    Client1 ---------- > Facade1 -------------> Complex class
                                                                  ^
                    Client2 -----------> Facade2 -----------------|

3. Abstraction layer over a complex subsystem
    - In microservices architecture, there are multiple services interacting with each other. However, client
        need not interact with individual services.
    - A facade can help provide a single entry point to access different services

    Ex: API Gateway

    ```
        Client          ------------->    Facade        ---------->     Class1
         |                                  |                             |
         \/                                 \/                            \/
    Shopping site                      API Gateway                 Order Service

                                                        ---------->     Class 2
                                                                           |
                                                                           \/
                                                                    Payment Service

                                                        ---------->     Class 3
                                                                           |
                                                                           \/
                                                                    Redeem points service
    ```

- Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
- Use the Facade when you want to structure a subsystem into layers.
- The facade pattern is appropriate when you have a complex system that you want to expose to clients in a simplified way, or you want to make an external communication layer over an existing system which is incompatible with the system. Facade deals with interfaces, not implementation. Its purpose is to hide internal complexity behind a single interface that appears simple on the outside.
- When several dependencies exist between clients and the implementation classes of an abstraction.

## Example
- In Java, the interface JDBC can be called a facade because, we as users or clients create connection using the “java.sql.Connection” interface, the implementation of which we are not concerned about. The implementation is left to the vendor of driver.
- Another good example can be the startup of a computer. When a computer starts up, it involves the work of cpu, memory, hard drive, etc. To make it easy to use for users, we can add a facade which wrap the complexity of the task, and provide one simple interface instead.

## Pros
- You can isolate your code from the complexity of a subsystem.
- Facade defines a higher-level interface that makes the subsystem easier to use by wrapping a complicated subsystem. This reduces the learning curve necessary to successfully leverage the subsystem.
- It also promotes decoupling the subsystem from its potentially many clients.
- On the other hand, if the Facade is the only access point for the subsystem, it will limit the features and flexibility that “power users” may need.
- It shields the clients from the complexities of the sub-system components.
- It promotes loose coupling between subsystems and its clients.

## Cons
- A facade can become a god object *(In object-oriented programming, a God object (sometimes also called an Omniscient or All-knowing object) is an object that references a large number of distinct types, has too many unrelated or uncategorized methods, or some combination of both. The God object is an example of an anti-pattern and a code smell)* coupled to all classes of an app.

## Facade Vs Mediator Design Pattern
Mediator design pattern may look very similar to facade design pattern in terms of abstraction. Mediator abstracts the functionality of the subsystems in this way it is similar to the facade pattern. In the implementation of mediator pattern, subsystem or peers components are aware of the mediator and that interact with it. **In the case of facade pattern, subsystems are not aware of the existence of facade. Only facade talks to the subsystems.**

## Useful Links
- [Different use cases](https://levelup.gitconnected.com/3-main-use-cases-of-the-facade-design-pattern-in-enterprise-applications-aa9b290adac6)
- [Quora Example](https://www.quora.com/Can-you-give-a-real-world-example-of-the-usefulness-of-Facade-pattern)
- [Baeldung blog](https://www.baeldung.com/java-facade-pattern)
- [Medium blog](https://medium.com/@andreaspoyias/design-patterns-a-quick-guide-to-facade-pattern-16e3d2f1bfb6)
- [Example 1](https://javapapers.com/design-patterns/facade-design-pattern/)
- [Example 2](https://dotnettutorials.net/lesson/facade-design-pattern/)