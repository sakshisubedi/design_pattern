# Abstract Factory
 - Abstract Factory is a **creational design pattern** that lets you produce families of related objects without specifying their concrete classes.

## Intent
 - Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 - A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
 - The new operator considered harmful.

## When to use:
 - Use the Abstract Factory when your code needs to work with various families of related products, but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand or you simply want to allow for future extensibility.

## Pros
 - You can be sure that the products you’re getting from a factory are compatible with each other.
 - You avoid tight coupling between concrete products and client code.
 - Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
 - Open/Closed Principle. You can introduce new variants of products without breaking existing client code.

## Cons
 - The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

## Useful Links




 - [Stackoverflow example 1](https://stackoverflow.com/questions/2386125/real-world-examples-of-factory-method-pattern#:~:text=5%20Answers&text=A%20class%20implementing%20factory%20design,like%20SQL%20Server%20and%20Oracle.)
 - [Stackoverflow example 2](https://stackoverflow.com/questions/69849/factory-pattern-when-to-use-factory-methods)
 - [Real life example 1](https://codeburst.io/design-patterns-learning-abstract-factory-method-through-real-life-examples-9d0cc99ef0e8)
 - [Real life example 2](https://stacktraceguru.com/factory-design-pattern/)
 - [Real life example 3](http://www.mukeshkumar.net/articles/designpattern/factory-design-pattern-real-world-example)