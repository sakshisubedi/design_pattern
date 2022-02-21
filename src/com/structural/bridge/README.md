# Bridge
- Bridge is a **structural design pattern** that lets you split a large class or a set of closely related classes (divides business logic) into two separate hierarchies—**abstraction and implementation**—which can be developed independently of each other.
- Separates an object's interface from its implementation.
- One of these hierarchies (often called the Abstraction) will get a reference to an object of the second hierarchy (Implementation). The abstraction will be able to delegate some (sometimes, most) of its calls to the implementations object. Since all implementations will have a common interface, they’d be interchangeable inside the abstraction.
- Abstraction (also called interface) is a high-level control layer for some entity. This layer isn’t supposed to do any real work on its own. It should delegate the work to the implementation layer (also called platform). When talking about real applications, the abstraction can be represented by a graphical user interface (GUI), and the implementation could be the underlying operating system code (API) which the GUI layer calls in response to user interactions.
- The official definition for the Bridge design pattern introduced by Gang of Four (GoF) is to decouple an abstraction from its implementation so that the two can vary independently.
- It follows the principle which says “prefer composition over inheritance”.

## Intent
- Decouple an abstraction from its implementation so that the two can vary independently.
- Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.
- Beyond encapsulation, to insulation.

## When to use:
- Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
- Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
- Use the Bridge if you need to be able to switch implementations at runtime.
- When you don't want a permanent binding between the functional abstraction and its implementation.
- When both the functional abstraction and its implementation need to extended using sub-classes.
- Any Change in implementation should have no impact on abstraction.

## Pros
- You can create platform-independent classes and apps. Provides a good solution for cross-platform development.
- The client code works with high-level abstractions. It isn’t exposed to the platform details.
- Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
- Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.
- It enables the separation of implementation from the interface.
- It improves the extensibility.
- It allows the hiding of implementation details from the client.

## Cons
- You might make the code more complicated by applying the pattern to a highly cohesive class.

## Does it sound similar to Adapter pattern ?
- Bridge pattern decouples an abstraction and implementation elements of a class by creating two separate class hierarchies to change independently, whereas an Adapter pattern helps two incompatible classes to work together.
- Also, as stated by GOF “Adapter makes things work after they’re designed; on the other hand Bridge makes them work before they are”. It means Adapter pattern is commonly used with already developed application for two incompatible classes to work together whereas Bridge pattern is usually designed up-front to allow a developer to develop a part of an application and letting other part to be written independently by someone.


### Example
                                   shape
                                     ^
                      /              |              \               \
              BlueCircle      BlueSquare          RedCircle       RedSquare -------- N times

              
              Breaks into separate hierarchies --> Shape & Color


              Shape                                    Color
               ^                                         ^
               |                                         |
       Circle      Square                          Red        Blue


       Shape o--- contains ---- color  ====== Composition over Inheritance

## QUESTION:  FOR THE EXAMPLE ABOVE WHY CANT WE USE COLOR DECORATER, WHY BRIDGE PATTERN?
### Difference between decorator vs bridge
- Decorator pattern is for existing objects ie it accepts and returns single Interface type + it is used to extend the functionality of existing class.
- Bridge pattern breaks into hierarchy of two different class/interface which can individually extend without interference from the other.


### WHERE CAN WE USE IT?
- Example
    - Consider a payment system, we provide two options to user via credit card or net banking. Internally, we have integrated two payment gateways - Razorpay and Googlepay gateway

    Without Abstraction what will we do?

                                     IPaymentSystem
                                          ^
                                          |
          RazarpayCredit      RazorpayNetBanking        GooglepayCredit         GooglepayNetBanking



    - With Bridge pattern
    
    ```

              IPaymentSystem                                          IPaymentGateway
                     ^                                                        ^
                     |                                                        |                                 
        Credit            Netbanking                                Razorpay     GooglepayGateway

            PaymentSystem o-----contains----- paymentGateway ====== COMPOSITION
    ```

  At runtime, our default gateway is Googlepay but when Googlepay is not available we set the gateway as Razorpay Gateway

## Useful Links
- [Baeldung blog](https://www.baeldung.com/java-bridge-pattern)
- [Medium blog](https://medium.com/@amritlalsahu5/bridge-design-pattern-9afad7138777)
