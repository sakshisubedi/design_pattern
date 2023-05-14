# Flyweight
- Flyweight pattern allows when one instance of a class
  can be used to provide many **virtual instances.**
- Flyweight is a **structural design pattern** that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all the data in each object.
- It is also known as cache.
- Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint. It can also improve performance in applications where object instantiation is expensive. 
- Simply put, the flyweight pattern is based on a factory which recycles created objects by storing them after creation. Each time an object is requested, the factory looks up the object in order to check if it's already been created. If it has, the existing object is returned – otherwise, a new one is created, stored and then returned. 
- The flyweight object's state is made up of an invariant component shared with other similar objects (intrinsic) and a variant component which can be manipulated by the client code (extrinsic). 
- Each "flyweight" object is divided into two pieces: the state-dependent (extrinsic) part, and the state-independent (intrinsic) part. Intrinsic state is stored (shared) in the Flyweight object. Extrinsic state is stored or computed by client objects, and passed to the Flyweight when its operations are invoked.
- It's very important that the flyweight objects are immutable: any operation on the state must be performed by the factory.

## Problem
- Designing objects down to the lowest levels of system "granularity" provides optimal flexibility, but can be unacceptably expensive in terms of performance and memory usage.

## Intent
 - Use sharing to support large numbers of fine-grained objects efficiently. 
 - The Motif GUI strategy of replacing heavy-weight widgets with light-weight gadgets.

## When to use
 - The Flyweight is used when a class has many instances, and they can all be controlled identically.
 - Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM.
 - When we need a large number of similar objects that are unique in terms of only a few parameters and most of the stuffs are common in general. 
 - We need to control the memory consumption by large number of objects – by creating fewer objects and sharing them across.
 - The Flyweight pattern is merely an optimization. Before applying it, make sure your program does have the RAM consumption problem related to having a massive number of similar objects in memory at the same time. Make sure that this problem can’t be solved in any other meaningful way.

## How to Implement
- Divide fields of a class that will become a flyweight into two parts:
  - the intrinsic state: the fields that contain unchanging data duplicated across many objects. An intrinsic state attribute is stored/shared in the flyweight object, and it is independent of flyweight’s context. As the best practice, we should make intrinsic states immutable.
  - the extrinsic state: the fields that contain contextual data unique to each object. An extrinsic state varies with flyweight’s context, which is why they cannot be shared. Client objects maintain the extrinsic state, and they need to pass this to a flyweight object during object creation.
- Leave the fields that represent the intrinsic state in the class, but make sure they’re immutable. They should take their initial values only inside the constructor. 
- Go over methods that use fields of the extrinsic state. For each field used in the method, introduce a new parameter and use it instead of the field. 
- Optionally, create a factory class to manage the pool of flyweights. It should check for an existing flyweight before creating a new one. Once the factory is in place, clients must only request flyweights through it. They should describe the desired flyweight by passing its intrinsic state to the factory. 
- The client must store or calculate values of the extrinsic state (context) to be able to call methods of flyweight objects. For the sake of convenience, the extrinsic state along with the flyweight-referencing field may be moved to a separate context class.

## Pros
 - Reduces the number of object instances at runtime,
   saving memory. 
 - Centralizes state for many **virtual** objects into a
   single location.
 - You can save lots of RAM, assuming your program has tons of similar objects.

## Cons
 - Once you’ve implemented it, single, logical instances of the class will not be able to behave independently from the other instances.
 - You might be trading RAM over CPU cycles when some of the context data needs to be recalculated each time somebody calls a flyweight method. 
 - The code becomes much more complicated. New team members will always be wondering why the state of an entity was separated in such a way.

## Examples
- In programming, we can see java.lang.String constants as flyweight objects. All strings are stored in string pool and if we need a string with certain content then runtime return the reference to already existing string constant from the pool – if available. 
- In browsers, we can use an image in multiple places in a webpage. Browsers will load the image only one time, and for other times browsers will reuse the image from cache. Now image is same but used in multiple places. It’s URL is intrinsic attribute because it’s fixed and shareable. Images position coordinates, height and width are extrinsic attributes which vary according to place (context) where they have to be rendered.

## Singleton Vs Flyweight Design Pattern
- The singleton pattern helps we maintain only one object in the system. In other words, once the required object is created, we cannot create more. We need to reuse the existing object in all parts of the application. 
- The flyweight pattern is used when we have to create large number of similar objects which are different based on client provided extrinsic attribute.
- Similar to singleton pattern, if we create flyweight objects in concurrent environment, we may end up having multiple instances of same flyweight object which is not desirable. To fix this, we need to use double-checked locking as used in singleton pattern while creating flyweights.



## Useful Links
- [Baeldung blog](https://www.baeldung.com/java-flyweight)
- [GFG](https://www.geeksforgeeks.org/flyweight-design-pattern/)
- [Example](https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/)