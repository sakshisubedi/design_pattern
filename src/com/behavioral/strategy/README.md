# Strategy
- Strategy is a **behavioral design pattern** that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
- Strategy is a behavioral design pattern that turns a set of behaviors into objects and makes them interchangeable inside original context object.
- Encapsulates an algorithm inside a class.
- A Strategy Pattern says that "defines a family of functionality, encapsulate each one, and make them interchangeable". Strategy lets the algorithm vary independently from clients that use it. The Strategy Pattern is also known as Policy.

## Intent
- Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.
- Capture the abstraction in an interface, bury implementation details in derived classes.

## There are 2 ways that strategy could be used

- Client directly calls the strategy methods
- Context encapsulates the usage from the client *(We are using this in our example)*
### Why do we need context class? 
```
In second scenario, the client is not aware of when the strategy needs to be called. 
Only thing the client knows is which strategy is to be used. 
Context is useful when you have to load some data and do a bunch of other things pre/post the strategy call.
 As the name suggests, the client does not need to be aware of these functionalites and where the strategy fits among it.

Examples:

Discounts ---- based on time period, festivals. 
Each of these and buisness logic could be defined as individual classes and dynamically changed as required
Maps ----- route calculation via air, bus, train, vehicle.
```

## When to use
- Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
- Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
- Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
- Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.
- When the multiple classes differ only in their behaviors.e.g. Servlet API.

## Pros
- You can swap algorithms used inside an object at runtime.
- You can isolate the implementation details of an algorithm from the code that uses it.
- You can replace inheritance with composition.
- Open/Closed Principle. You can introduce new strategies without having to change the context.
- It provides a substitute to subclassing.
- It defines each behavior within its own class, eliminating the need for conditional statements.
- It makes it easier to extend and incorporate new behavior without changing the application.
- A family of algorithms can be defined as a class hierarchy and can be used interchangeably to alter application behavior without changing its architecture.
- By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.
- The application can switch strategies at run-time.
- Strategy enables the clients to choose the required algorithm, without using a “switch” statement or a series of “if-else” statements.
- Data structures used for implementing the algorithm are completely encapsulated in Strategy classes. Therefore, the implementation of an algorithm can be changed without affecting the Context class.

## Cons
- If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
- Clients must be aware of the differences between strategies to be able to select a proper one.
- A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.
- The application must be aware of all the strategies to select the right one for the right situation.
- Context and the Strategy classes normally communicate through the interface specified by the abstract Strategy base class. Strategy base class must expose interface for all the required behaviours, which some concrete Strategy classes might not implement.
- In most cases, the application configures the Context with the required Strategy object. Therefore, the application needs to create and maintain two objects in place of one.

## Examples
- Java Collections.sort(list, comparator) method where client actually passes suitable comparator based on the requirement in runtime to the method and the method is generic to accept any comparator type. Based on the comparator being passed, same collection can be sorted differently.
- Appenders, Layouts and Filters in Log4j.
- Layout Managers in UI toolkits.

## Strategy Vs State Design Pattern
- The State and Strategy Patterns have the same class diagram, but they differ in intent.
- This structure may look similar to the Strategy pattern, but there’s one key difference. In the State pattern, the particular **states may be aware of each other** and initiate transitions from one state to another, whereas strategies almost **never know about each other**.
- First, the strategy pattern defines a family of interchangeable algorithms. Generally, they achieve the same goal, but with a different implementation, for example, sorting or rendering algorithms.
- In state pattern, the behavior might change completely, based on actual state.
- Next, in strategy, **the client has to be aware of the possible strategies to use and change them explicitly**. Whereas in state pattern, **each state is linked to another and create the flow as in Finite State Machine**.
- State encapsulates state-based behavior and delegate behavior to the current state whereas Strategy encapsulates interchangeable behaviors and use delegation to decide which behavior to use.
- Template Method Subclasses decide how to implement steps in an algorithm.

## Useful Links
- [Baeldung blog](https://www.baeldung.com/java-strategy-pattern)
- [Stackoverflow](https://stackoverflow.com/questions/370258/real-world-example-of-the-strategy-pattern/35180265#35180265)
- [Example](https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/)