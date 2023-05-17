# Visitor
- Imagine that we have a composite object which consists of components. The object's structure is fixed – we either can't change it, or we don't plan to add new types of elements to the structure. Now, how could we add new functionality to our code without modification of existing classes? We'll have to do is to add a function which accepts the visitor class to each element of the structure. That way our components will allow the visitor implementation to “visit” them and perform any required action on that element.
- Visitor is a **behavioral design pattern** that lets you separate algorithms from the objects on which they operate.
- Use the Visitor Pattern when you want to add capabilities to a composite of objects and encapsulation is not important.
- It suggests that you place the new behavior into a separate class called visitor, instead of trying to integrate it into existing classes.
- It is a way of separating an operational logic or algorithm from an object structure on which it operates. 
- It lets you define new operations to existing object structures without modifying the structures. 
- It provides good use of the Open/Closed principle as we won’t modify the code, but we’ll still be able to extend the functionality by providing a new Visitor implementation.

## Intent
- Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.
- The classic technique for recovering lost type information.
- Do the right thing based on the type of two objects.
- Double dispatch

## When to use
-  Use the Visitor when you need to perform an operation on all elements of a complex object structure (for example, an object tree).
- Use the Visitor to clean up the business logic of auxiliary behaviors.
- Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.
- Use the Visitor when you need to perform distinct and unrelated operation on all elements of a complex object structure.
- The classes defining the object structure rarely change, however you often want to define the new operation over the structure. Therefore, new operation can be added to the visitor hierarchy by not polluting the existing design.
- Element object has to accept the visitor object so that visitor object handles the operation on the element object.

## Pros
- Allows you to add operations to a Composite
  structure without changing the structure itself.
- Adding new operations is relatively easy.
- The code for operations performed by the Visitor is
  centralized.
- Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.
- Single Responsibility Principle. You can move multiple versions of the same behavior into the same class. 
- A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of this structure.
- If the logic of operation changes, then we need to make changes only in the visitor implementation rather than doing it in all the item classes. 
- Adding a new item to the system is easy, it will require change only in visitor interface and implementation and existing item classes will not be affected. 
- Gather related operations into a single class rather than force you to change or derive classes to add these operations
- If the logic of operation changes, then we need to make change only in the visitor implementation rather than doing it in all the item classes.
- Adding a new item to the system is easy, it will require change only in visitor interface and implementation and existing item classes will not be affected.

## Cons
- The Composite classes’ encapsulation is broken when the Visitor is used.
- Because the traversal function is involved, changes to the Composite structure are more difficult.
- You need to update all visitors each time a class gets added to or removed from the element hierarchy.
- Visitors might lack the necessary access to the private fields and methods of the elements that they’re supposed to work with.
- We should know the return type of visit() methods at the time of designing otherwise we will have to change the interface and all of its implementations. 
- If there are too many implementations of visitor interface, it makes it hard to extend. 
- Visitor is not good for the situation where “visited” classes are not stable. Every time a new Composite hierarchy derived class is added, every Visitor derived class must be amended.

## Relations with Other Patterns:
- Visitor is a powerful version of the Command pattern. Its objects can execute operations over various objects of different classes.
- Visitor can be used to execute an operation over an entire Composite tree.
- Visitor can be used along with Iterator to traverse a complex data structure and execute some operation over its elements, even if they all have different classes.
- The abstract syntax tree of Interpreter is a Composite (therefore Iterator and Visitor are also applicable).
- Iterator can traverse a Composite. Visitor can apply an operation over a Composite.
- The Visitor pattern is like a more powerful Command pattern because the visitor may initiate whatever is appropriate for the kind of object it encounters.
- The Visitor pattern is the classic technique for recovering lost type information without resorting to dynamic casts.

## Useful Links
- [Medium](https://medium.com/@amritlalsahu5/visitor-design-pattern-364c712f46ca)
- [Example-1](https://medium.com/javarevisited/how-to-implement-visitor-design-pattern-using-java-99b6fcdd48ef)
- [Example-2](https://www.scaler.com/topics/design-patterns/visitor-design-pattern/)
- [Baeldung blog](https://www.baeldung.com/java-visitor-pattern)
- [GFG](https://www.geeksforgeeks.org/visitor-design-pattern/)