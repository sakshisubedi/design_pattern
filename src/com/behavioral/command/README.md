# Command
- Command is a **behavioral design pattern** that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations. It converts requests or simple operations into objects, store them, pass them around, and invoke them when you need them.
- Encapsulate method invocation ie encapsulate a command request as an object.
- Invoker is passed a command object that makes requests by calling execute() method and ConcreteCommand carries it out by calling one or more actions on the Receiver. Invokers can be parameterized with Commands, even dynamically at runtime.
- Commands may support undo by implementing an undo method that restores the object to its previous state before the execute() method was last called. *(HFDP example)*
- The Meta Command Pattern allows to create macros of commands (Macro Commands are a simple extension of Command) so that you can execute multiple commands at once. Likewise, Macro Commands can easily support undo(). *(HFDP example)* 
- Commands may also be used to implement logging and transactional systems.
- The Command Pattern allows to decouple the requester of an action from the object that actually performs the action. This model allows us to decouple objects that produce the commands from their consumers, so that's why the pattern is commonly known as the **producer-consumer** pattern.
- A Command Pattern says that *"encapsulate a request under an object as a command and pass it to invoker object (here, RemoteButton). Invoker object looks for the appropriate object (here, TV/SetTopBox) which can handle this command and pass the command to the corresponding object and that object executes the command"*. It is also known as Action or Transaction.

## Intent
- Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undoable operations.
- Promote "invocation of a method on an object" to full object status.
- An object-oriented callback.

## Problem
Need to issue requests to objects without knowing anything about the operation being requested or the receiver of the request.

## When to use
- Use the Command pattern when you want to parametrize objects with operations.
- Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
- Use the Command pattern when you want to implement reversible operations (undo operations).
- When you need parameterize objects according to an action perform.
- When you need to create and execute requests at different times.
- **When you need to support rollback (undo operation), logging or transaction functionality.**

## Pros
- Single Responsibility Principle. You can decouple classes that invoke operations (Invoker) from classes that perform these operations (Receiver).
- Open/Closed Principle. You can introduce new commands into the app without breaking existing client code (Eg, volume increase/decrease command).
- You can implement undo/redo.
- You can implement deferred execution of operations.
- You can assemble a set of simple commands into a complex one.
- Reduces coupling the invoker (here, RemoteButton) and receiver (here, TV/SetTopBox) of a command.

## Cons
- The code may become more complicated since you’re introducing a whole new layer (of command) between senders (invoker) and receivers.
- Increase in the number of classes for each individual command.

## Questions
How can I implement a history of undo operations? In other words, I want to be able to press the undo button multiple times. 
- Great question! It’s pretty easy actually; instead of keeping just a reference to the last Command executed, you keep a stack of previous commands. Then, whenever undo is pressed, your invoker pops the first item off the stack and calls its undo() method.

## Command Vs Observer Design Pattern
Command Pattern encapsulates a operation call in an object thus making it transferable over a wire or persist-able whereas Observer Pattern notifies zero to n interested parties that some event (for example a finished operation) happened.

## Useful Links
- [Medium Blog](https://bikas-katwal.medium.com/design-pattern-command-design-pattern-simplified-d3f062bfd5c7)
- [Stackoverflow Example](https://stackoverflow.com/questions/12153708/real-world-example-of-application-of-the-command-pattern)
- [Baeldung blog](https://www.baeldung.com/java-command-pattern)
- [GeeksforGeeks](https://www.geeksforgeeks.org/command-pattern/)
- [Undo Operation Example](https://www.codiwan.com/command-design-pattern-real-world-example-java/) Can refer undo example from HFDP book.