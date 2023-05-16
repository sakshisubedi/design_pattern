# Chain Of Responsibility
- *Think of multiple middlewares in Node.js*
- Chain Of Responsibility is a **behavioral design pattern** that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.
- With the Chain of Responsibility Pattern, you create a chain of objects that examine a request. Each object in turn examines the request and handles it, or passes it on to the next object in the chain.
- The Chain of Responsibility relies on transforming particular behaviors into stand-alone objects called handlers.
- Use to achieve loose coupling in the software design, where a request from the client is passed to a chain of objects to process them. The request will receive through a handler and the objects in the chain will decide themselves who will going to process that request. Each of these objects contain certain type of commands to handle that request. If a particular object cannot handle that request, it will pass the request to the next object in that chain.
- Make sure there exists a "safety net" to "catch" any requests which go unhandled.
- Do not use Chain of Responsibility when each request is only handled by one handler, or, when the client object knows which service object should handle the request.

## Intent
- Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it. 
- Launch-and-leave requests with a single processing pipeline that contains many possible handlers. 
- An object-oriented linked list with recursive traversal.

## When to use
- When you want to give more than one object a chance to handle a request.
- Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
- Use the pattern when it’s essential to execute several handlers in a particular order.
- When the set of handlers and their order are supposed to change at runtime.
- When you don’t want to specify handlers explicitly in your code.
- To reduce the coupling degree. Decoupling it will request the sender and receiver. 
- Simplified object. The object does not need to know the chain structure. 
- Enhance flexibility of object assigned duties. By changing the members within the chain or change their order, allow dynamic adding or deleting responsibility. 
- Increase the request processing new class of very convenient.
- When more than one object can handle a request and the handler is unknown. 
- When the group of objects that can handle the request must be specified in dynamic way.


## Pros
- Decouples the sender of the request and its
  receivers.
- Simplifies your object because it doesn’t have to
  know the chain’s structure and keep direct references
  to its members.
- Allows you to add or remove responsibilities
  dynamically by changing the members or order of the
  chain.
- You can control the order of request handling.
- Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
- Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.
- It allows a set of classes to act as one; events produced in one class can be sent to other handler classes with the help of composition.


## Cons
- Execution of the request isn’t guaranteed; it may fall off the end of the chain if no object handles it (this can be an advantage or a disadvantage).
- Can be hard to observe the runtime characteristics
  and debug.
- Some requests may end up unhandled.
- Mostly, it can get broken easily:
  - if a handler fails to call the next handler, the command gets dropped
  - if a handler calls the wrong handler, it can lead to a cycle
  - It can create deep stack traces, which can affect performance
  - It can lead to duplicate code across handlers, increasing maintenance
- The performance of the system will be affected, but also in the code debugging is not easy may cause cycle call.

## Example
- Commonly used in windows systems to handle
  events like mouse clicks and keyboard events.

## Useful Links
- [Baeldung Blog](https://www.baeldung.com/chain-of-responsibility-pattern)
- [Example](https://medium.com/geekculture/understanding-the-chain-of-responsibility-pattern-d729ef84621c)
- [GFG](https://www.geeksforgeeks.org/chain-responsibility-design-pattern/)