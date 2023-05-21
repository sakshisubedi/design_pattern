# Iterator
- Iterator is a **behavioral design pattern** that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).
- The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called an iterator.

## Intent
- Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation. 
- The C++ and Java standard library abstraction that makes it possible to decouple collection classes and algorithms. 
- Promote to "full object status" the traversal of a collection. 
- Polymorphic traversal

## When to use
- Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients (either for convenience or security reasons).
- Use the pattern to reduce duplication of the traversal code across your app.
- Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.

## Pros
- Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes. 
- Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything. 
- You can iterate over the same collection in parallel because each iterator object contains its own iteration state. 
- For the same reason, you can delay an iteration and continue it when needed.
- It supports variations in the traversal of a collection. 
- It simplifies the interface to the collection.

## Cons
- Applying the pattern can be an overkill if your app only works with simple collections. 
- Using an iterator may be less efficient than going through elements of some specialized collections directly.

## Useful Links
- [GeeksforGeeks](https://www.geeksforgeeks.org/iterator-pattern/)