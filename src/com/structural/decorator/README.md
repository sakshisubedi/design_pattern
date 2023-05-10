# Decorator
- Decorator is a **structural design pattern** that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors. It allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class.
- In the implementation of this pattern, we prefer composition over an inheritance – so that we can reduce the overhead of subclassing again and again for each decorating element. The recursion involved with this design can be used to decorate our object as many times as we require.
- Extending new services/features/behavior from the base class is not good design practice. Because there will be an increase of subclasses and not all subclasses have dependency on other subclasses. Eg *(from refactoring guru)*. You tried to address the notification problem by creating special subclasses which combined several notification methods within one class. However, it quickly became apparent that this approach would bloat the code immensely by making several combinations, not only the library code but the client code as well. 

## Problem
- Inheritance is static. You can’t alter the behavior of an existing object at runtime. You can only replace the whole object with another one that’s created from a different subclass.
- Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.
- Subclasses can have just one parent class.
- Also, adding services in base class as fields violates SOLID principles i.e. open-closed principle (open for extension and closed for modification), since in future additional services might be added or removed or updated. It is also compile-time binding (Inheritance is static).  
- One of the ways to overcome these caveats is by using Aggregation or Composition. (Adding functionality to an object dynamically). You want to add behavior or state to individual objects at run-time. Inheritance is not feasible because it is static and applies to an entire class.
- Make sure all classes implement the component interface.
- The interface uses recursive composition to allow an unlimited number of decorator "layers" to be added to each core object.
- In the executed example, the PlainPizza class is called decorated objects and Decorators decorates the decorated objects.

## Intent
 - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
 - Client-specified embellishment of a core object by recursively wrapping it.
 - Wrapping a gift, putting it in a box, and wrapping the box.

## When to use
 - When you want to transparently and dynamically add responsibilities to objects without affecting other objects.
 - When you want to add responsibilities to an object that you may want to change in future.
 - Extending functionality by sub-classing is no longer practical.
 - When we wish to add, enhance or even remove the behavior or state of objects.
 - When we just want to modify the functionality of a single object of class and leave others unchanged.

## Pros
 - It provides greater flexibility than static inheritance.
 - You can extend an object’s behavior without making a new subclass. 
 - You can combine several behaviors by wrapping an object into multiple decorators.
 - You can add or remove responsibilities from an object at runtime.
 - It allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class.
 - Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.
 - It enhances the extensibility of the object, because changes are made by coding new classes.
 - Follows Open Closed Principle.

## Cons
 - It’s hard to remove a specific wrapper(decorator) from the wrappers stack.
 - It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.
 - The initial configuration code of layers might look pretty ugly.

## Questions
1. Can decorators know about the other decorations in the chain? Say, I wanted my getDecription() method to
print “Whip, Double Mocha” instead of  “Mocha, Whip, Mocha”? That would  require that my outermost decorator know all the decorators it is wrapping.

Decorators are meant to add behavior to the object they wrap. When you need to peek at multiple layers into the decorator chain, you are starting to push the decorator beyond its true intent. Nevertheless, such things are possible. Imagine a CondimentPrettyPrint decorator that parses the final decription and can print “Mocha, Whip, Mocha” as “Whip, Double Mocha.” Note that getDecription() could return an ArrayList of descriptions to make this easier.

## Useful Links
- [Baeldung blog](https://www.baeldung.com/java-decorator-pattern)
- [stackoverflow example](https://stackoverflow.com/questions/2707401/understand-the-decorator-pattern-with-a-real-world-example)
- [Example 1](https://javapapers.com/design-patterns/decorator-pattern/)
- [Example 2](https://www.blazeclan.com/blog/simplifying-coding-decorator-design-pattern-when-to-use-when-not-to-use/)
- [Youtube video](https://www.youtube.com/watch?v=XihyLU6MhzY&list=PLRnuLZZ5D0Kzz1oWyvIxz8RSjMRIjzgK6&index=8)