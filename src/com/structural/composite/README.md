# Composite
- Composite is a **structural design pattern** that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
- The composite pattern is meant to allow treating individual objects and compositions of objects, or “composites” in the same way.
- It can be viewed as a tree structure made up of types that inherit a base type, and it can represent a single part or a whole hierarchy of objects.

## Problem
- Application needs to manipulate a hierarchical collection of "primitive" and "composite" objects. Processing of a primitive object is handled one way, and processing of a composite object is handled differently. Having to query the "type" of each object before attempting to process it is not desirable.

## Intent
 - Compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly. 
 - Recursive composition.
 - "Directories contain entries, each of which could be a directory".
 - 1-to-many "has a" up the "is a" hierarchy

## When to use
 - Use the Composite pattern when you have to implement a tree-like object structure.
 - Use the pattern when you want the client code to treat both simple and complex elements uniformly.

## Pros
 - You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
 - Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.

## Cons
 - It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.
 - Composite Design Pattern makes it harder to restrict the type of components of a composite. So it should not be used when you don’t want to represent a full or partial hierarchy of objects. 
 - Composite Design Pattern can make the design overly general. It makes harder to restrict the components of a composite. Sometimes you want a composite to have only certain components. With Composite, you can’t rely on the type system to enforce those constraints for you. Instead you’ll have to use run-time checks.

## Useful Links
- [Baeldung blog](https://baeldung.com/java-composite-pattern)
- [GFG](https://www.geeksforgeeks.org/composite-design-pattern/)