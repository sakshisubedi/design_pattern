# Mediator
- Mediator is a **behavioral design pattern** that lets you reduce complexity and dependencies between tightly coupled objects communicating directly with one another. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object. This promotes loose coupling.
- Use the Mediator Pattern to centralize complex
  communications and control between related objects.
- With a Mediator added to the system, all the objects can be greatly simplified:
  - They tell the Mediator when their state changes.
  - They respond to requests from the Mediator.
- Before adding the Mediator, all the objects needed to know about each other, they were all tightly coupled. With the Mediator in place, the objects are all completely decoupled from each other.
- The Mediator pattern suggests that you should cease all direct communication between the components which you want to make independent of each other. Instead, these components must collaborate indirectly, by calling a special mediator object that redirects the calls to appropriate components. As a result, the components depend only on a single mediator class instead of being coupled to dozens of their colleagues.

## Intent
- Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently. 
- Design an intermediary to decouple many peers. 
- Promote the many-to-many relationships between interacting peers to "full object status".

## When to use
- If we have to deal with a set of objects that are tightly coupled and hard to maintain.
- Use the Mediator pattern when it’s hard to change some of the classes because they are tightly coupled to a bunch of other classes.
- Use the pattern when you can’t reuse a component in a different program because it’s too dependent on other components.
- Use the Mediator when you find yourself creating tons of component subclasses just to reuse some basic behavior in various contexts.

## Pros
- Increases the reusability of the objects supported by the Mediator by decoupling them from the system.
- Simplifies maintenance of the system by centralizing control logic.
- Simplifies and reduces the variety of messages sent
  between objects in the system.
- Single Responsibility Principle. You can extract the communications between various components into a single place, making it easier to comprehend and maintain.
- Open/Closed Principle. You can introduce new mediators without having to change the actual components.
- You can reduce coupling between various components of a program.
- You can reuse individual components more easily.

## Cons
- Without proper design, the Mediator object itself can become overly complex.
- Over time a mediator can evolve into a God Object.
- Mediator often needs to be very intimate with all different classes, it can become overly complex. This can make it difficult to maintain.

## Examples
- The Mediator is commonly used to coordinate related GUI components.


## Questions
I’ve seen descriptions of the MVC where the controller is described as a “mediator” between the view and the model. Is the controller implementing the Mediator Pattern?
  - The intent of the mediator is to encapsulate how objects interact and promote loose coupling by keeping two objects from referring to each other explicitly. So, to some degree, the controller can be seen as a mediator, since the view never sets state directly on the model, but rather always goes through the controller. Remember, however, that the view does have a reference to the model to access its state. If the controller were truly a mediator, the view would have to go through the controller to get the state of the model as well.

## Mediator Vs Facade Design Pattern
Mediator is similar to Facade in that it abstracts functionality of existing classes. Mediator abstracts/centralizes arbitrary communication between colleague objects, it routinely "adds value", and it is known/referenced by the colleague objects (i.e. it defines a multidirectional protocol). In contrast, Facade defines a simpler interface to a subsystem, it doesn't add new functionality, and it is not known by the subsystem classes (i.e. it defines a unidirectional protocol where it makes requests of the subsystem classes but not vice versa).

## Useful Links
- [Medium Blog](https://medium.com/@jmeza/mediator-design-pattern-7cc9ee5891d1)
- [Baeldung blog](https://www.baeldung.com/java-mediator-pattern)
- [GeeksforGeeks](https://www.geeksforgeeks.org/mediator-design-pattern/)
- [Example](https://dzone.com/articles/mediator-pattern-1)