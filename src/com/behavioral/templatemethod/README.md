# Template
- Template is a **behavioral design pattern** that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
- Template means Preset format like HTML templates which has fixed preset format. Similarly in template method pattern,we have a preset structure method called template method which consists of steps.This steps can be abstract method which will be implemented by its subclasses.
- Most of the time, subclasses calls methods from super class but in template pattern, superclass template method calls methods from subclasses, this is known as Hollywood Principle - **don’t call us, we’ll call you.**
- Methods in base class with default implementation are referred as **Hooks** and they are intended to be overridden by subclasses, if you want some of the methods to be not overridden, you can make them final.

## Intent
- Defining the skeleton of the algorithm.
- Separating part of the logic to classes that inherit from the AbstractClass class (base class) without changing the basic structure of the algorithm.
- Implementing invariant part of the algorithm.

## When to use
- The template method is used in frameworks, where each implements the invariant parts of a domain’s architecture, leaving “placeholders” for customization options.
- Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.
- Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.

## Pros
- You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.
- You can pull the duplicate code into a superclass.

## Cons
- Some clients may be limited by the provided skeleton of an algorithm. 
- You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass. 
- Template methods tend to be harder to maintain the more steps they have.

## Useful Links
- [Medium](https://medium.com/@sawomirkowalski/design-patterns-template-method-45888a2b84bc)
- [Example-1](https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java)
- [Example-2](https://medium.com/@sahoosunilkumar/understanding-template-method-design-pattern-bc975347c3a8)
- [Baeldung blog](https://www.baeldung.com/java-template-method-pattern)
- [GFG](https://www.geeksforgeeks.org/template-method-design-pattern/)