# Prototype
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes. *(In other words, it is a cloning of an existing object(prototype) instead of creating new one and can also be customized as per the requirement. Prototype patterns are required, when object creation is time consuming, and costly operation, so we create objects with the existing object itself.)*

## Intent
 - Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 - Co-opt one instance of a class for use as a breeder of all future instances.
 - The new operator considered harmful.

## Problem
 - Not all objects can be copied by going through all the fields of the original object and copy their values over to the new object because some of the object’s fields may be private and not visible from outside of the object itself.
 - Object creation becomes dependent on the class.

## Types
- Shallow Clone
- Deep Clone

## When to use:
 - Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
 - Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects. Somebody could have created these subclasses to be able to create objects with a specific configuration.
 - When the classes to instantiate are specified at run-time. 
 - When the cost of creating an object is expensive or complicated.
 - When you want to keep the number of classes in an application minimum.
 - When a system should be independent of how its products are created, composed, and represented.

## Pros
 - You can clone objects without coupling to their concrete classes.
 - You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
 - You can produce complex objects more conveniently. Also, it hides complexities of creating objects.
 - You get an alternative to inheritance when dealing with configuration presets for complex objects.
 - It reduces the need of sub-classing.
 - Adding and removing products at run-time.
 - The clients can get new objects without knowing which type of object it will be.
 - Specifying new objects by varying values and varying structures.
 - The pattern is useful to remove a bunch of boilerplate code, when the configuration required would be onerous.

## Cons
 - Cloning complex objects that have circular references might be very tricky.
 - It also hides concrete product classes from the client.
 - Overkill for a project that uses very few objects and/or does not have an underlying emphasis on the extension of prototype chains. 
 - Prototype pattern, just like every other design pattern, should be used only when it's appropriate. Since we are cloning the objects, the process could get complex when there are many classes, thereby resulting in a mess.

## Useful Links
 - [baeldung blog](https://www.baeldung.com/java-pattern-prototype)
 - [Example of prototype registry](https://howtodoinjava.com/design-patterns/creational/prototype-design-pattern-in-java/)
