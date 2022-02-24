# Command
- Command is a **behavioral design pattern** that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations. It converts requests or simple operations into objects.
- Encapsulate a command request as an object.
- The pattern intends to encapsulate in an object all the data required for performing a given action (command), including what method to call, the method's arguments, and the object to which the method belongs. This model allows us to decouple objects that produce the commands from their consumers, so that's why the pattern is commonly known as the **producer-consumer** pattern.
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

## Useful Links
- [Medium Blog](https://bikas-katwal.medium.com/design-pattern-command-design-pattern-simplified-d3f062bfd5c7)
- [Stackoverflow Example](https://stackoverflow.com/questions/12153708/real-world-example-of-application-of-the-command-pattern)
- [Baeldung blog](https://www.baeldung.com/java-command-pattern)
- [GeeksforGeeks](https://www.geeksforgeeks.org/command-pattern/)
- [Undo Operation Example](https://www.codiwan.com/command-design-pattern-real-world-example-java/)