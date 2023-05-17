# State
- State is a **behavioral design pattern** that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
- The State pattern is closely related to the concept of a Finite-State Machine.
- If we have to change behavior of an object based on its state, we can have a state variable in the Object and use if-else condition block to perform different actions based on the state. However, State pattern is used to provide a systematic and loose-coupled way to achieve this through Context and State implementations.
- The main idea of State pattern is to allow the object for changing its behavior without changing its class. Also, by implementing it, the code should remain cleaner without many if/else statements.

## Problem
- A monolithic object's behavior is a function of its state, and it must change its behavior at run-time depending on that state. Or, an application is characterized by large and numerous case statements that vector flow of control based on the state of the application.
- The biggest weakness of a state machine based on conditionals reveals itself once we start adding more and more states and state-dependent behaviors to the class. Most methods will contain monstrous conditionals that pick the proper behavior of a method according to the current state. Code like this is very difficult to maintain because any change to the transition logic may require changing state conditionals in every method.

## Solution
The State pattern suggests that you create new classes for all possible states of an object and extract all state-specific behaviors into these classes. Instead of implementing all behaviors on its own, the original object, called context, stores a reference to one of the state objects that represents its current state, and delegates all the state-related work to that object.

## Intent
- Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
- An object-oriented state machine.
- wrapper + polymorphic wrappee + collaboration.

## When to use
- Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
- Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.
- Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine.
- When the behavior of object depends on its state and it must be able to change its behavior at runtime according to the new state.
- It is used when the operations have large, multipart conditional statements that depend on the state of an object.

## Example
- We can change the state of TV by pressing buttons on remote. But the state of TV will change or not, it depends on the current state of the TV. If TV is ON, we can switch it OFF, mute or change aspects and source. But if TV is OFF, nothing will happen when we press remote buttons.

## Pros
- Single Responsibility Principle. Organize the code related to particular states into separate classes.
- Open/Closed Principle. Introduce new states without changing existing state classes or the context.
- Simplify the code of the context by eliminating bulky state machine conditionals.
- With State pattern, the benefits of implementing polymorphic behavior are evident, and it is also easier to add states to support additional behavior.
- In the State design pattern, an object’s behavior is the result of the function of its state, and the behavior gets changed at runtime depending on the state. This removes the dependency on the if/else or switch/case conditional logic. For example, in the TV remote scenario, we could have also implemented the behavior by simply writing one class and method that will ask for a parameter and perform an action (switch the TV on/off) with an if/else block.
- The State design pattern also improves Cohesion since state-specific behaviors are aggregated into the ConcreteState classes, which are placed in one location in the code.

## Cons
- Applying the pattern can be overkill if a state machine has only a few states or rarely changes.
- The State design pattern can be used when we need to change state of object at runtime by inputting in it different subclasses of some State base class. This circumstance is advantage and disadvantage in the same time, because we have a clear separate State classes with some logic and from the other hand the number of classes grows up.

## State Vs Strategy Design Pattern
- The State and Strategy Patterns have the same class diagram, but they differ in intent.
- This structure may look similar to the Strategy pattern, but there’s one key difference. In the State pattern, the particular states may be aware of each other and initiate transitions from one state to another, whereas strategies almost never know about each other.
- First, the strategy pattern defines a family of interchangeable algorithms. Generally, they achieve the same goal, but with a different implementation, for example, sorting or rendering algorithms.
- In state pattern, the behavior might change completely, based on actual state.
- Next, in strategy, the client has to be aware of the possible strategies to use and change them explicitly. Whereas in state pattern, each state is linked to another and create the flow as in Finite State Machine.
- State encapsulates state-based behavior and delegate behavior to the current state whereas Strategy encapsulates interchangeable behaviors and use delegation to decide which behavior to use.
- Template Method Subclasses decide how to implement steps in an algorithm.

## Useful Links
- [Stackoverflow Example](https://stackoverflow.com/questions/3768703/give-me-a-real-life-non-trivial-use-of-the-state-pattern)
- [Baeldung blog](https://www.baeldung.com/java-state-design-pattern)