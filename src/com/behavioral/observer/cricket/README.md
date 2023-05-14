# Observer
- Observer is a **behavioral design pattern** that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
- Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically. The Subject is the object that contains the states and controls it. So, there is ONE subject with state. The observers, on the other hand, use the state, even if they don't own it. There are many observers and they rely on the Subject to tell them when its states changes. In the provided example, ***WeatherData*** class is the **one** and ***Various Display Elements*** class that use the weather measurements are the **many**. 
- It provides an object design where subjects and observers are loosely coupled. New observers can be added/removed at any time. We never need to modify the subject to add new types of observers. We can reuse subjects or observers independently of each other. Changes to either the subject or an observer will not affect the other. Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.
- A way of notifying change to a number of classes.
- Observer pattern is used when an action needs to be performed when an event/change occurs. It has a subject - which causes the change, and observers - which perform some action after the change has occurred. Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
- How will the observer know that a change has occurred ? There are two ways - **push** or **pull** mechanism. In pull mechanism the observers keep on polling the subject and keep on asking if change has occurred. Other one which is the preferred one is the push mechanism where the subject pushes/notifies the observers that there is a change.
- If subscribers poll the message then it is inefficient. If publishers publish the message to all then wastage of resources. (Eg: man going to store to check whether apple phone is available or not, on the other hand store sending message to all customers about the availability of phone). Therefore, a observer/subscriber list in publisher/observable/subject class.

## Intent
- Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- Encapsulate the core (or common or engine) components in a Subject abstraction, and the variable (or optional or user interface) components in an Observer hierarchy.
- The "View" part of Model-View-Controller.

## When to use
- Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
- Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.
- When the change of a state in one object must be reflected in another object without keeping the objects tight coupled.
- When the framework we write and needs to be enhanced in future with new observers with minimal changes.

## Pros
- You can establish relations between objects at runtime.
- Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s code (and vice versa if there’s a publisher interface).
- It provides the support for broadcast-type communication.
- It describes the coupling between the objects and the observer.
- Provides a loosely coupled design between objects that interact. Loosely coupled objects are flexible with changing requirements. Here loose coupling means that the interacting objects should have less information about each other.

## Cons
- Subscribers are notified in random order.
- Memory leaks caused by Lapsed listener problem because of explicit register and unregistering of observers.

## Example
- weather updates
- stock prices
- train ticket confirmation when ticket status is changed from waiting to confirmed on irctc website
- action/event listener
- It is heavily used in GUI toolkits and event listener. In java the button(subject) and onClickListener(observer) are modelled with observer pattern.
- Social media, RSS feeds, email subscription in which you have the option to follow or subscribe and you receive latest notification.
- All users of an app on play store gets notified if there is an update.

## Useful Links
- [Stackoverflow Example](https://stackoverflow.com/questions/13744450/when-should-we-use-observer-and-observable)
- [Observer and Observable - Deprecated](https://stackoverflow.com/questions/46380073/observer-is-deprecated-in-java-9-what-should-we-use-instead-of-it)
- [Baeldung blog](https://www.baeldung.com/java-observer-pattern)
- [Youtube video](https://www.youtube.com/watch?v=98DiwRp-KZk&t=502s)
- [Example](https://thecodingsimplified.com/observer-design-pattern/)