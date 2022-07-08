# Design Pattern
- Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.
- Design patterns are a toolkit of tried and tested solutions to common problems in software design. Even if you never encounter these problems, knowing patterns is still useful because it teaches you how to solve all sorts of problems using principles of object-oriented design.
- Design patterns define a common language that you and your teammates can use to communicate more efficiently.

## Types
### Creational Patterns
- Creational Patterns provide object creation mechanisms that increase flexibility and reuse of existing code. Different ways to create objects. These design patterns are all about class instantiation. 
- In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.
- Creational design patterns are concerned with the way of creating objects. These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).
  - [Factory Method](./src/com/creational/factory)
  - [Abtsract Factory](./src/com/creational/abstractfactory)
  - [Builder](./src/com/creational/builder)
  - [Prototype](./src/com/creational/prototype)
  - [Singleton](./src/com/creational/singleton)
 
### Structural Patterns
- These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality. 
- In Software Engineering, Structural Design Patterns are Design Patterns that ease the design by identifying a simple way to realize relationships between entities. 
- Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.
- Structural design patterns are concerned with how classes and objects can be composed, to form larger structures. The structural design patterns simplifies the structure by identifying the relationships. These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
  - [Adapter](./src/com/structural/adapter)
  - [Bridge](./src/com/structural/bridge)
  - [Decorator](./src/com/structural/decorator)
  - [Facade](./src/com/structural/facade)
  - [Composite](./src/com/structural/composite)
  - [Flyweight](./src/com/structural/flyweight)

### Behavioral Patterns
- In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.
- Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.
- Behavioral design patterns are concerned with the interaction and responsibility of objects. In these design patterns, the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled. That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.
  - [State](./src/com/behavioral/state)
  - [Observer](./src/com/behavioral/observer)
  - [Command](./src/com/behavioral/command)
  - [Strategy](./src/com/behavioral/strategy)

### Useful Links
- [Refactoring guru](https://refactoring.guru/design-patterns/what-is-pattern)
- [Sourcemaking](https://sourcemaking.com/design_patterns)
- [Baeldung](https://www.baeldung.com/design-patterns-series)
- [Git link](https://github.com/sy117/design-patterns)