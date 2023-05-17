# Memento (Snapshot Pattern)
- Use the Memento Pattern when you need to be able to return an object to one of its previous states; for instance, if your user requests an **undo.** It is a **behavioral design pattern** used to save and restore previous state of an object without revealing the details of its implementation.
- The Memento has two goals:
  - Saving the important state of a system’s key object. Keeping the single responsibility principle in mind, it’s also a good idea to keep the state that you’re saving separate from the key object. This separate object that holds the state is known as the Memento object.
  - Maintaining the key object’s encapsulation
- It has 3 components:
  - **Originator**: The object that we need to maintain the state. Basically, the Originator object creates a memento object to store its internal state. As a result, the Originator object knows how to save and restore itself. *has createMemento() and setMemento()*
  - **Caretaker**: The object that keeps the track about Originator. Basically, Caretaker knows why and when the Originator needs to save and restore itself. It is the object triggering the save and restore of the state, which is called the Memento. *Has memento variable*
  - **Memento**: The object that contains basic state storage and retrieval capabilities. Usually, the Memento object is immutable and pass it’s the data only once, through the constructor. It should expose as little information as possible to the Caretaker. This is to ensure that we don't expose the internal state of the Originator to the outside world, as it would break encapsulation principles. However, the Originator should access enough information in order to restore to the original state. *has state variable*
- When implementing Memento Design pattern, the Originator coupled with the Memento and pass the state into the Caretaker. So, whenever we need go back into the previous state, we have to talk to the Caretaker and we check the previous state, then move.

## Intent
- Without violating encapsulation, capture and externalize an object's internal state so that the object can be returned to this state later.
- A magic cookie that encapsulates a "check point" capability.
- Promote undo or rollback to full object status.

## When to use
- When you want to develop an application, that has undo or rollback functionality.
- Use the Memento pattern when you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
- Use the pattern when direct access to the object’s fields/getters/setters violates its encapsulation.

## Pros
- Keeping the saved state external from the key object
  helps to maintain cohesion. 
- Keeps the key object’s data encapsulated.
- Provides easy-to-implement recovery capability.
- We can use Serialization to achieve memento pattern implementation that is more generic rather than Memento pattern where every object needs to have it’s own Memento class implementation.
- The biggest advantage is that you can always discard the unwanted changes and restore it to an intended or stable state. 
- You do not compromise the encapsulation associated with the key objects that are participating in this model. 
- You can simplify the originator’s code by letting the caretaker maintain the history of the originator’s state.

## Cons
- Saving and restoring state can be time-consuming.
- The additional time to save the states decreases the overall performance of the system.
- If Originator object is very huge then Memento object size will also be huge and use a lot of memory.
- It also increases maintenance costs in parallel because code efforts needs to be made to manage memento classes as well.
- The app might consume lots of RAM if clients create mementos too often. 
- Caretakers should track the originator’s lifecycle to be able to destroy obsolete mementos. 
- Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched.

## Following Memento structures are possible
For reference, refer refactoring guru
- Implementation based on nested classes.
- Implementation based on an intermediate interface.
- Implementation with even stricter encapsulation.


## Examples
- In Java systems, consider using Serialization to save
  a system’s state.
- Used in database transactions.

## Memento Vs Command Design Pattern
- Command and Memento act as magic tokens to be passed around and invoked at a later time. In Command, the token represents a request; in Memento, it represents the internal state of an object at a particular time. Polymorphism is important to Command, but not to Memento because its interface is so narrow that a memento can only be passed as a value.
- Command can use Memento to maintain the state required for an undo operation.

## Memento Vs Iterator Design Pattern
Memento is often used in conjunction with Iterator. An Iterator can use a Memento to capture the state of an iteration. The Iterator stores the Memento internally.


## Useful Links
- [Medium Blog](https://medium.com/nerd-for-tech/understanding-memento-design-pattern-5c4f09be639)
- [Baeldung blog](https://www.baeldung.com/java-memento-design-pattern#:~:text=The%20Memento%20Design%20Pattern%2C%20described,since%20need%20to%20be%20undone.)
- [GeeksforGeeks](https://www.geeksforgeeks.org/memento-design-pattern/)
- [Example](https://howtodoinjava.com/design-patterns/behavioral/memento-design-pattern/)