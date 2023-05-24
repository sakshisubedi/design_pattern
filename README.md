# Design Pattern
- Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.
- Design patterns are a toolkit of tried and tested solutions to common problems in software design. Even if you never encounter these problems, knowing patterns is still useful because it teaches you how to solve all sorts of problems using principles of object-oriented design.
- Design patterns define a common language that you and your teammates can use to communicate more efficiently.
- Patterns are often classified by a second attribute: whether or not the pattern deals with classes or objects
- Knowing the OO basics does not make you a good designer.
- Good OO designs are reusable, extensible and maintainable.
- Patterns show you how to build systems with good OO design qualities.
- Patterns are proven object-oriented experience.
- Patterns don't give you code, they give you general solutions to design problems. You apply them to your specific application.
- Patterns aren't invented, they are discovered.
- Most patterns and principles address issues of change in software.
- Most patterns allow some part of a system to vary independently of all other parts.
- We often try to take what varies in a system and encapsulate it.
- Patterns provide a shared language that can maximize the value of your communication with other developers.

## Types
### Creational Patterns
- Creational patterns involve object instantiation and all provide a way to decouple a client from the objects it needs to
  instantiate.
- It increases flexibility and reuse of existing code. 
- Different ways to create objects.
- Create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.
- These design patterns are used when a decision must be made at the time of instantiation of a class (i.e. creating an object of a class).
- Class
  - [Factory Method](./src/com/creational/factory)
- Object
  - [Abtsract Factory](./src/com/creational/abstractfactory)
  - [Builder](./src/com/creational/builder)
  - [Prototype](./src/com/creational/prototype)
  - [Singleton](./src/com/creational/singleton)
 
### Structural Patterns
- Structural patterns let you compose classes or objects
  into larger structures while keeping these structures flexible and efficient.
- It is all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality. 
- It eases the design by identifying a simple way to realize relationships between entities.
- They are concerned with how classes and objects can be composed, to form larger structures. The structural design patterns simplifies the structure by identifying the relationships. These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
- Class
  - [Adapter](./src/com/structural/adapter)
- Object
  - [Adapter](./src/com/structural/adapter)
  - [Bridge](./src/com/structural/bridge)
  - [Decorator](./src/com/structural/decorator)
  - [Facade](./src/com/structural/facade)
  - [Composite](./src/com/structural/composite)
  - [Flyweight](./src/com/structural/flyweight)
  - [Proxy](./src/com/structural/proxy)

### Behavioral Patterns
- Any pattern that is a Behavioral Pattern is concerned with how classes and objects interact and distribute responsibility.
- In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.
- Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.
- Behavioral design patterns are concerned with the interaction and responsibility of objects. In these design patterns, the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled. That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.
- Class
  - [Template Method](./src/com/behavioral/templatemethod)
  - Interpreter
- Object
  - [State](./src/com/behavioral/state)
  - [Observer](./src/com/behavioral/observer)
  - [Command](./src/com/behavioral/command)
  - [Strategy](./src/com/behavioral/strategy)
  - [Chain of Responsibility](./src/com/behavioral/chainofresponsibility)
  - [Command](./src/com/behavioral/command)
  - [Iterator](./src/com/behavioral/iterator)
  - [Mediator](./src/com/behavioral/mediator)
  - [Memento](./src/com/behavioral/memento)
  - [Visitor](./src/com/behavioral/visitor)

### Useful Links
- [Baeldung Github](https://github.com/eugenp/tutorials/tree/master)
- [Refactoring guru](https://refactoring.guru/design-patterns/what-is-pattern)
- [Sourcemaking](https://sourcemaking.com/design_patterns)
- [Baeldung](https://www.baeldung.com/design-patterns-series)
- [Git link](https://github.com/sy117/design-patterns)

### Prefer Composition over Inheritance
- Advantages
  - Better design
  - Scale easily
  - Follows SOLID principles better than Inheritance
  - Does not need to change many classes. In inheritance, change in base class requires changes in concrete classes.
  - Change behavior at Runtime.
  - Go with compostion first and then inheritance.

### Power of a shared pattern vocabulary
- Shared pattern vocabularies are powerful.
- Patterns allow you to say more with less.
- Talking at the pattern level allows you to stay "in the design" longer.
- Shared vocabularies can turbo charge your development team.
- Shared vocabularies encourage more junior developers to get up to speed.